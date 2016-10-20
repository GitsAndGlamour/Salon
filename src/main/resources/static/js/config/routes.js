app.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/');

    // PATH TO TEMPLATES =======================================================
    var $path = '../templates/';

    $stateProvider

        // HOME STATES AND NESTED VIEWS ========================================
        .state('home', {
            url: '/',
            controller: 'HomeCtrl',
            templateUrl: $path+'home.html'
        })

        .state('home.promotions.new', {
            url: '/promotions/new',
            templateUrl: $path+'promotions.new.html'
        })

        .state('home.customers.new', {
            url: '/customers/new',
            templateUrl: $path+'customers.new.html'
        })

        .state('home.calendar.new', {
            url: '/calendar/new',
            templateUrl: $path+'calendar.new.html'
        })

        .state('home.account', {
            url: '/account/{id}',
            templateUrl: $path+'home.account.html'
        })

        .state('home.login', {
            url: '/login',
            templateUrl: $path+'home.login.html'
        })

        // CALENDAR PAGE AND MULTIPLE NAMED VIEWS =================================
        .state('calendar', {
            url: '/calendar',
            templateUrl: $path+'calendar.html'
        })

        .state('calendar.new', {
              url: '/calendar',
              templateUrl: $path+'calendar.new.html'
                })

        // CUSTOMERS PAGE AND MULTIPLE NAMED VIEWS =================================
        .state('customers', {
            url: '/customers',
            templateUrl: $path+'customers.html'
        })

        .state('customers.new', {
            url: '/customers',
            templateUrl: $path+'customers.new.html'
        })

        // REPORTS PAGE AND MULTIPLE NAMED VIEWS =================================
        .state('reports', {
            url: '/reports',
            templateUrl: $path+'reports.html'
        })

        // SETTINGS PAGE AND MULTIPLE NAMED VIEWS =================================
        .state('settings', {
            url: '/settings',
            templateUrl: $path+'settings.html'
        });

});
