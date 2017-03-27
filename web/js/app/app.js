'use strict';


var app = angular.module('app', [
	'ngRoute',
	'ngResource',
]);

app.config(['$routeProvider',function ($routeProvider) {
	$routeProvider.when('/test01',{
		templateUrl:'commonviews/test01.html',
		controller:'test01Ctrl'
	}).when('/signup',{
		templateUrl:'commonviews/signup.html',
		controller:'signupCtrl'
	}).when('/home',{
		templateUrl:'dashboard/home.html',
		controller:'homeCtrl'
	}).when('/signin',{
		templateUrl:'commonviews/signin.html',
		controller:'signinCtrl'
	}).otherwise({redirectTo:'/signin'
	});

}]);

app.run(['$rootScope','$resource',function($rootScope,$resource){
	$rootScope.user={};
}]);