(function() {
    'use strict';

    app.service('UserSrvc', UserSrvc, ['DataService', 'User']);

    function UserSrvc(DataService, $q, User) {
        this.userId;
        this.password;

        this.getUserId = function() {
            return this.userId;
        }

        this.getPassword = function() {
            return this.password;
        }

        this.setUserId = function(userId) {
            this.userId = userId;
        }

        this.setPassword = function(password) {
            this.password = password;
        }

        this.hasValidLoginCredentials = function() {
            var credentials = null;
            do {
                credentials = DataService.checkForValidLoginCredentials(this.userId, this.password);
            } while (credentials == null);
            return User.getUser();
        }
    }
})();
