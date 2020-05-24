//服务层
app.service('regService', function ($http) {

    //注册
    this.reg = function (user) {
        return $http.post('user/reg.do', user);
    }

});
