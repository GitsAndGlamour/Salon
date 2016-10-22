(function() {
  'use strict';

  app.controller('InventoryCtrl', InventoryCtrl);

  function InventoryCtrl($scope) {
    $scope.test = 'This is a test string for the Inventory Page called by the InventoryCtrl.';
  }
})();
