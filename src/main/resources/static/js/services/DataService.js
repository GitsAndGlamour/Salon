(function() {
  'use strict';

  app.service('DataService', DataService);

  function DataService($http, $q) {
      this.checkForValidLoginCredentials = function(user, password) {
        return $q.resolve($http({
          method: 'GET',
          url: '/staffs/'+user+'/password/'+password,
        }).success(function(response) {
          console.log(response);
          return response.data;
        }).error(function(response) {
          console.log(response);
          return false;
        })).then(
          function(response) {
            console.log(response);
            return response;
          }
        );
    }
  }
})();
