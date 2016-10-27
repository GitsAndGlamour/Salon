(function() {
    'use strict';

    app.controller('DialogCtrl', DialogCtrl, ['UserSrvc', 'LoginSrvc', 'mdDialog']);

    function DialogCtrl($scope, $mdDialog, UserSrvc, LoginSrvc) {
        $scope.test = 'This is a test string for the Dialog Page called by the DialogCtrl.';
        var vm = this;
        vm.userId = null;
        vm.password = null;
        vm.message = null;

        vm.handleLoginSubmit = handleLoginSubmit;
        vm.handleLoginCancel = handleLoginCancel;

        function handleLoginSubmit() {
            UserSrvc.setUserId(vm.userId);
            UserSrvc.setPassword(vm.password);
            console.log(UserSrvc.getUserId());
            console.log(UserSrvc.getPassword());
            if (LoginSrvc.login()) {
                return $mdDialog.hide();
            } else {
                vm.message = "Invalid login credentials.";
            }
        }

        function handleLoginCancel() {
            return $mdDialog.hide();
        }
    }
})();
