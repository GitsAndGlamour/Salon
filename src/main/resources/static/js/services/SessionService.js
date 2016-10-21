(function() {
  'use strict';

  app.service('Session', Session);

  function Session() {
    var user;
    var password;
    var isActiveSession;
    var isValidSession;
    var session;
    var expirationInDays;

    var getSession = function() {
      return this.session;
    }

    var setSession = function() {
    var d = new Date();
    d.setTime(d.getTime() + (this.expirationInDays*24*60*60*1000));
    var expires = "expires="+ d.toUTCString();
    this.session = this.user + "=" + this.password + ";" + this.expirationInDays + ";path=/";
    }

    var getCookie = function(user) {
      var name = user + "=";
      var cookies = document.cookie.split(';');
      for(var i = 0; i <cookies.length; i++) {
          var cookie = cookies[i];
          while (cookie.charAt(0)==' ') {
              cookie = ccookie.substring(1);
          }
          if (c.indexOf(name) == 0) {
              return cookie.substring(name.length,cookie.length);
          }
      }
      return "";
    }

    var checkCookie = function() {
    var user = getCookie("username");
    if (user != "") {
        this.user = user;
        this.isValidSession = true;
        this.isActiveSession = true;
    } else {
        this.isValidSession = false;
        this.isActiveSession = false;
    }
}

    var setCookie = function() {
      document.cookie = this.session;
    }

    var getUser = function() {
      return this.user;
    };

    var setUser = function(user) {
      this.user = user;
    };

    var getPassword = function() {
      return this.password;
    };

    var setPassword = function(password) {
      this.password = password;
    };

    var isSessionActive = function() {
      return this.isActive;
    };

    var setSessionActive = function(isActive) {
      this.isActiveSession = isActive;
    };

    var isSessionValid = function() {
      return this.isValidSession;
    };

    var setSessionValid = function(isValid) {
      this.isValidSession = isValid;
    };

    var getExpirationInDays = function() {
      return this.expirationInDays;
    }

    var setExpirationIndays = function(days) {
      this.expirationInDays = days;
    }

  }
})();
