(function() {
    'use strict';

    app.controller('NavigationCtrl', NavigationCtrl, ['LoginSrvc']);

    function NavigationCtrl($scope, LoginSrvc, $mdDialog) {
        $scope.currentNavigationItem = 'home';
        $scope.displayLoginPrompt = displayLoginPrompt;
        $scope.displayNewPromotionModal = displayNewPromotionModal;
        $scope.displayNewAppointmentModal = displayNewAppointmentModal;
        $scope.displayNewCustomerModal = displayNewCustomerModal;
        $scope.logout = logout;
        $scope.showHistory = showHistory;
        $scope.user = {
            userId: null,
            name: "User",
            data: null,
            isSessionActive: null
        };

        function logout() {
            console.log("logout");
        };

        function showHistory() {
            console.log("show history");
        }

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
            });
        };

    }
})();
