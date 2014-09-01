angular.module('tt').controller("postController",
    function ($scope, server, $routeParams, $sce){
        server.get("/posts/" + $routeParams.id).success(function(data){
            $scope.post = data;
        });
    }
);
