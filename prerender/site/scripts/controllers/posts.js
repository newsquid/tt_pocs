angular.module('tt').controller("postsController",
    function ($scope, server, $routeParams, $sce){
        server.get("/posts").success(function(data){
            console.log(data);
            $scope.posts = data;
        });
    }
);
