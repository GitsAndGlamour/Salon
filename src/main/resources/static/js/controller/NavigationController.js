(function() {
  'use strict';

  app.controller('NavigationCtrl', NavigationCtrl, ['Session', 'UserSrvc', 'User']);
  function NavigationCtrl($scope, Session, UserSrvc, $timeout, User) {
    $scope.currentNavigationItem = 'home';
    $scope.displayLoginForm = displayLoginForm;
    $scope.displayNewPromotionModal = displayNewPromotionModal;
    $scope.displayNewAppointmentModal = displayNewAppointmentModal;
    $scope.displayNewCustomerModal = displayNewCustomerModal;
    $scope.user = {
      name: "User",
      data: null
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

    function displayLoginForm() {
      // TODO: Create modal for login form
      UserSrvc.setUserId("0");
      UserSrvc.setPassword("root");
      login();
    };

    function login() {
      var user = UserSrvc.getUserId();
      var password = UserSrvc.getPassword();
      var isValidLogin = validateLogin();
      if(isValidLogin) {

        $timeout(function() {
          $scope.user.name = User.getFirst() + " " + User.getLast();
        }, 250);
      }
    };

    function validateLogin() {
      $scope.user.data = UserSrvc.hasValidLoginCredentials();
      if($scope.user.data != false && $scope.user.data != null) {
          setSessionAndCookies();
          if(Session.isActiveSession && Session.isValidSession) {
            return true;
          } else if (Session.isActiveSession) {
              return false;
          } else if (Session.isValidSession) {
              return false;
            } else {
              return false;
            }
        }
    }

    function setSessionAndCookies() {
      Session.setName("username");
      Session.setUserId(UserSrvc.getUserId());
      Session.setExpirationIndays(364);
      Session.setSession();
      Session.setCookie(Session.session);
      Session.checkCookie();
    }

}
})();
