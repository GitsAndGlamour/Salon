(function() {
  'use strict';

  app.service('UserSrvc', UserSrvc, ['DataService']);

  function UserSrvc(DataService) {
      this.userId;
      this.password;
      this.first;
      this.last;
      this.email;
      this.address;
      this.city;
      this.state;
      this.postal;
      this.phone;
      this.altPhone;
      this.roleId;
      this.services;
      this.statusCode;
      this.createAdmin;
      this.updaateAdmin;
      this.createTs;
      this.updateTs;
      this.isActive;

      this.getUserId = function() {
        return this.userId;
      };

      this.setUserId = function(userId) {
        this.userId = userId;
      };

      this.getFirst = function() {
        return this.first;
      };

      this.setFirst = function(first) {
        this.first = first;
      };

      this.getLast = function() {
        return this.last;
      };

      this.setLast = function(last) {
        this.last = last;
      };

      this.getPassword = function() {
        return this.password;
      };

      this.setPassword = function(password) {
        this.password = password;
      };

      this.updateUserService = function(data) {
        console.log("destination");
        console.log(data);
        this.first = data.first;
        this.last = data.last;
      }

      this.hasValidLoginCredentials = function() {
        var $promise = DataService.checkForValidLoginCredentials(this.userId,this.password).then(
          function(result) {
            if(result.status == 200) {
              return result.data;
            } else {
              return null;
            }
          }
        );
        return $q.resolve($promise).then({
          function(response) {
            console.log(response);
            return response;
          }
        });
      }
    }
})();
