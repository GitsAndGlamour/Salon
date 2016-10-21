(function() {
  'use strict';

  app.service('UserSrvc', User);

  function User() {
      var user;
      var password;

      var getUser() {
        return this.user;
      }

      var setUser(user) {
        this.user = user;
      }

      var getPassword() {
        return this.password;
      }

      var setPassword() {
        this.password = password;
      }

      var isValidLoginCredentials() {
        return DataService.checkForValidLoginCredentials(this.user,this.password);
      }
    }
})();
