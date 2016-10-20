(function() {
  'use strict';

  app.controller('NavCtrl', NavCtrl);

  function NavCtrl($scope) {
    $scope.currentNavItem = 'home';
  }
  app.config(function($mdThemingProvider) {
  $mdThemingProvider.theme('default')
    .primaryPalette('grey')
    .accentPalette('light-blue');
});
})();
