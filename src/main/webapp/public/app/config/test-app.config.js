'use strict';


var app = angular.module('app', [
   'ngRoute',
   'controllers'
]);


app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'public/app/components/home/home.html',
            controller: 'HomeController'
        })
        .otherwise({
            redirectTo: '/'
        });
}]);


var controllers = angular.module("controllers", []);

controllers.controller("HomeController", ['$scope', function ($scope) {
   $scope.title = 'Hello world!';
}]);