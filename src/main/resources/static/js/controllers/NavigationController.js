(function() {
  'use strict';

  app.controller('NavigationCtrl', NavigationCtrl, ['Session']);
  function NavigationCtrl($scope, Session) {
    $scope.currentNavigationItem = 'home';
    $scope.displayLoginForm = displayLoginForm;
    $scope.displayNewPromotionModal = displayNewPromotionModal;
    $scope.displayNewAppointmentModal = displayNewAppointmentModal;
    $scope.displayNewCustomerModal = displayNewCustomerModal;

    function displayNewPromotionModal() {
      console.log("displayNewPromotionModal");
    };

    function displayNewAppointmentModal() {
      console.log("displayNewAppointmentModal");
    };

    function displayNewCustomerModal() {
      console.log("displayNewCustomerModal");
    };

    function displayLoginForm() {
      console.log("displayLoginForm");
    };

}
})();
