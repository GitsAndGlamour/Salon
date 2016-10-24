(function() {
    'use strict';

    app.service('UserSrvc', UserSrvc, ['DataService', 'User']);

    function UserSrvc(DataService, $q, User) {
        var $user = this;
        $user.userId;
        $user.password;

        $user.getUserId = function() {
            return $user.userId;
        }

        $user.getPassword = function() {
            return $user.password;
        }

        $user.setUserId = function(userId) {
            $user.userId = userId;
        }

        $user.setPassword = function(password) {
            $user.password = password;
        }

        $user.endSession = function() {
          $user.setUserId(null);
          $user.setPassword(null);
        }

        $user.hasValidLoginCredentials = function() {
            var credentials = null;
            do {
                credentials = DataService.checkForValidLoginCredentials($user.userId, $user.password);
            } while (credentials == null);
            return User.getUser();
        }
    }
})();
