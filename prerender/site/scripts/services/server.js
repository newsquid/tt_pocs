angular.module('tt').service('server', function($http){
    return {
        url: "http://localhost:8888",
        token: function(){
            return window.localStorage.token;
        },
        get: function(u){
            return $http.get(this.url + u);
        },
        post: function(u, data){
            return $http.post(this.url + u, data);
        },
        put: function(u, data){
            return $http.put(this.url + u, data);
        },
        delete: function(u){
            return $http.delete(this.url + u);
        }
    }
});
