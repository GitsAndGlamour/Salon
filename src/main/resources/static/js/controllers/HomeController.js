(function() {
  'use strict';

  app.controller('HomeCtrl', HomeCtrl);

  function HomeCtrl($scope) {
    $scope.test = 'This is a test string for the Home Page called by the HomeCtrl.';
  }
})();
