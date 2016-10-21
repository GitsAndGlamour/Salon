(function() {
  'use strict';

  app.service('UserSrvc', UserSrvc);

  function UserSrvc() {
      var user;
      var password;

      var getUser = function() {
        return this.user;
      };

      var setUser = function(user) {
        this.user = user;
      };

      var getPassword = function() {
        return this.password;
      };

      var setPassword = function() {
        this.password = password;
      };

      var hasValidLoginCredentials = function() {
        return DataService.checkForValidLoginCredentials(this.user,this.password);
      };
    }
})();
