(function() {
  'use strict';

  app.service('DataService', DataService);

  function DataService($http) {
      this.checkForValidLoginCredentials = function(user, password) {
        $http({
          method: 'GET',
          url: '/staffs/'+user+'/password/'+password,
        }).then(function successCallback(response) {
            console.log("DataService: checkForValidLoginCredentials is Successful!");
        }, function errorCallback(response) {
            console.log("DataService: checkForValidLoginCredentials is NOT Successful!");
        });
    }
  }
})();
