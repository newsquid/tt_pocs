var app = angular.module('tt', ['ngRoute']);
app.config(['$routeProvider', function($routeProvider){

    $routeProvider.when("/", {
        redirectTo: "!/posts"
    });

    $routeProvider.when("/!/posts",{
        templateUrl: "views/posts.html",
        controller: "postsController"
    });

    $routeProvider.when("/!/posts/:id",{
        templateUrl: "views/post.html",
        controller: "postController"
    });

    $routeProvider.otherwise({
        redirectTo: "/"
    });
}
]);

app.controller("mainController",
    function mainController($scope, $http){
    }
);
