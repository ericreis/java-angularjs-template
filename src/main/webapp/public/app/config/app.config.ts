(() => {
	"use strict";

	routeConfig.$inject = ['$routeProvider'];

	angular.module(App.Config.MODULE_NAME).config(routeConfig);

	function routeConfig($routeProvider: ng.route.IRouteProvider) {
		$routeProvider
			.when('/', {
				templateUrl: 'public/app/components/home/home.html',
            	controller: App.Components.Home.HomeController,
            	controllerAs: 'homeCtrl'
			})
			.when('/user', {
				templateUrl: 'public/app/components/user/user.html',
				controller: App.Components.User.UserController,
				controllerAs: 'userCtrl'
			})
			.otherwise({
	            redirectTo: '/'
	        });
	}

})();