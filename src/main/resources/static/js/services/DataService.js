(function() {
  'use strict';

  app.service('DataService', DataService, ['User']);

  function DataService($http, User) {
      this.checkForValidLoginCredentials = function(user, password) {
        return $http({
              method: 'GET',
              url: '/staffs/'+user+'/password/'+password,
            }).success(function(response) {
              User.setUser(response);
              return true;
            }).error(function(response) {
              return false;
            }).then(function(response) {});
            return User.getUser();
          };

      }
})();
