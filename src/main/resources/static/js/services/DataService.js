(function() {
  'use strict';

  app.service('DataService', DataService);

  function DataService() {
      var isValidLoginCredentials = function(user, password) {
          $.ajax({
            type: "POST",
            url: "/staff/{user}/{password}",
            data: {
              user: user,
              password: password},
            success: function (result) {
                console.log("DataService: isValidLoginCredentials is Successful!");
            },
            error: function (result) {
              console.log("DataService: isValidLoginCredentials is NOT Successful!");
            }
          });
      }
  }
})();
