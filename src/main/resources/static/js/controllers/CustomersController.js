(function() {
  'use strict';

  app.controller('CustomersCtrl', CustomersCtrl);

  function CustomersCtrl($scope) {
    $scope.test = 'This is a test string for the Customers Page called by the CustomersCtrl.';
  }
})();
