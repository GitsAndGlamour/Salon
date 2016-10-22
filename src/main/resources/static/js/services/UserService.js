(function() {
  'use strict';

  app.service('UserSrvc', UserSrvc, ['DataService']);

  function UserSrvc(DataService) {
      this.user;
      this.password;

      this.getUser = function() {
        return this.user;
      };

      this.setUser = function(user) {
        this.user = user;
      };

      this.getPassword = function() {
        return this.password;
      };

      this.setPassword = function(password) {
        this.password = password;
      };

      this.hasValidLoginCredentials = function() {
        return DataService.checkForValidLoginCredentials(this.user,this.password);
      };
    }
})();
