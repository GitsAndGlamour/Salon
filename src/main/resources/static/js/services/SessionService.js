(function() {
    'use strict';

    app.service('Session', Session);

    function Session() {
        var userId;
        var name;
        var isActiveSession;
        var isValidSession;
        var session;
        var expirationInDays = 365;

        this.getSession = function() {
            return this.session;
        }

        this.setSession = function() {
            var d = new Date();
            d.setTime(d.getTime() + (this.expirationInDays * 24 * 60 * 60 * 1000));
            var expires = "expires=" + d.toUTCString();
            this.session = this.name + "=" + this.userId + ";" + this.expirationInDays + ";path=/";
        }

        this.getCookie = function(userId) {
            var name = "username=" + userId;
            var cookies = document.cookie.split(';');
            for (var i = 0; i < cookies.length; i++) {
                var cookie = cookies[i];
                if (cookie.indexOf(name) == 0) {
                    return cookie.substring(name.length - userId.length, cookie.length);
                }
            }
            return "";
        }

        this.checkCookie = function() {
            var userId = this.getCookie(this.userId);
            if (userId != "") {
                this.userId = userId;
                this.isValidSession = true;
            } else {
                this.isValidSession = false;
            }
        }

        this.setSessionAndCookies = function() {
            Session.setName("username");
            Session.setUserId(UserSrvc.getUserId());
            Session.setExpirationIndays(364);
            Session.setSession();
            Session.setCookie(Session.session);
            Session.checkCookie();
        }

        this.setCookie = function() {
            document.cookie = this.session;
        }

        this.getUserId = function() {
            return this.userId;
        };

        this.setUserId = function(userId) {
            this.userId = userId;
        };

        this.getName = function() {
            return this.name;
        };

        this.setName = function(name) {
            this.name = name;
        };

        this.isSessionActive = function() {
            return this.isActive;
        };

        this.setSessionActive = function(isActive) {
            this.isActiveSession = isActive;
        };

        this.isSessionValid = function() {
            return this.isValidSession;
        };

        this.setSessionValid = function(isValid) {
            this.isValidSession = isValid;
        };

        this.getExpirationInDays = function() {
            return this.expirationInDays;
        }

        this.setExpirationIndays = function(days) {
            this.expirationInDays = days;
        }

    }
})();
