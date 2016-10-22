(function() {
  'use strict';

  app.controller('SettingsCtrl', SettingsCtrl);

  function SettingsCtrl($scope) {
    $scope.test = 'This is a test string for the Settings Page called by the SettingsCtrl.';
  }
})();
