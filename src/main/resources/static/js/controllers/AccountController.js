(function() {
  'use strict';

  app.controller('AccountCtrl', AccountCtrl);

  function AccountCtrl($scope) {
    $scope.test = 'This is a test string for the Account Page called by the AccountCtrl.';
  }
})();
