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

        // CALENDAR PAGE AND MULTIPLE NAMED VIEWS ==============================
        .state('calendar', {
            url: '/calendar',
            controller: 'CalendarCtrl',
            templateUrl: $path+'calendar.html'
        })

        // CUSTOMERS PAGE AND MULTIPLE NAMED VIEWS =============================
        .state('customers', {
            url: '/customers',
            controller: 'CustomersCtrl',
            templateUrl: $path+'customers.html'
        })

        // REPORTS PAGE AND MULTIPLE NAMED VIEWS ===============================
        .state('reports', {
            url: '/reports',
            controller: 'ReportsCtrl',
            templateUrl: $path+'reports.html'
        })

        // INVENTORY PAGE AND MULTIPLE NAMED VIEWS =============================
        .state('inventory', {
            url: '/inventory',
            controller: 'InventoryCtrl',
            templateUrl: $path+'inventory.html'
        })

        // SETTINGS PAGE AND MULTIPLE NAMED VIEWS ==============================
        .state('settings', {
            url: '/settings',
            controller: 'SettingsCtrl',
            templateUrl: $path+'settings.html'
        });

});
