//服务层
app.service('codeService', function ($http) {

    //加密
    this.code = function (entity) {
        return $http.post('code/code.do', entity);
    };

    //解密
    this.decode = function (entity) {
        return $http.post('code/decode.do', entity);
    }

});
