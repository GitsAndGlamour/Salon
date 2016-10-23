(function() {
    'use strict';

    app.controller('NavigationCtrl', NavigationCtrl, ['LoginSrvc']);

    function NavigationCtrl($scope, LoginSrvc, $mdDialog) {
        $scope.currentNavigationItem = 'home';
        $scope.displayLoginPrompt = displayLoginPrompt;
        $scope.displayNewPromotionModal = displayNewPromotionModal;
        $scope.displayNewAppointmentModal = displayNewAppointmentModal;
        $scope.displayNewCustomerModal = displayNewCustomerModal;
        $scope.user = {
            name: "User",
            data: null,
            isSessionActive: null
        };

        function displayNewPromotionModal() {
            console.log("displayNewPromotionModal");
        };

        function displayNewAppointmentModal() {
            console.log("displayNewAppointmentModal");
        };

        function displayNewCustomerModal() {
            console.log("displayNewCustomerModal");
        };

        function displayLoginPrompt(ev) {

            $mdDialog.show({
                controller: 'DialogCtrl',
                templateUrl: 'templates/snippets/login.dialog.html',
                parent: angular.element(document.body),
                targetEvent: ev,
                clickOutsideToClose: true
            }).then(function(result) {
                $scope.user = LoginSrvc.user;
                $scope.$apply();
            });
        };

    }
})();
