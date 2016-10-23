(function() {
    'use strict';

    app.service('LoginSrvc', LoginSrvc, ['Session', 'UserSrvc', 'User']);

    function LoginSrvc(Session, UserSrvc, User, $timeout) {
        var login = this;
        login.user = {
            name: "User",
            data: null,
            isSessionActive: false
        };

        login.login = function() {
            var user = {
                name: "User",
                data: null,
                isSessionActive: false
            };
            if (login.validateLogin()) {
                $timeout(function() {
                    user.name = User.getFirst() + " " + User.getLast();
                    user.isSessionActive = true;
                }, 250);

                login.user = user;
                return true;
            } else {
              return false;
            }
        };

        login.validateLogin = function() {
            do {
                login.user.data = UserSrvc.hasValidLoginCredentials();
            }
            while (login.user.data == null);
            if (login.user.data != false && login.user.data != null) {
                Session.setSessionActive(true);
                login.user.isSessionActive = Session.isSessionActive();
                setSessionAndCookies();
                if (Session.isActiveSession && Session.isValidSession) {
                    return true;
                } else if (Session.isActiveSession) {
                    return false;
                } else if (Session.isValidSession) {
                    return false;
                } else {
                    return false;
                }
            }
        }

        function setSessionAndCookies() {
            Session.setName("username");
            Session.setUserId(UserSrvc.getUserId());
            Session.setExpirationIndays(364);
            Session.setSession();
            Session.setCookie(Session.session);
            Session.checkCookie();
        }

    }
})();
