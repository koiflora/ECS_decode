//控制层
app.controller('regController', function ($scope, $controller, $location, regService) {

    $scope.entity = {};

    //分页
    $scope.reg = function () {
        regService.reg($scope.entity).success(
            function (response) {
                if (response.success) {
                    if (confirm('注册成功,跳转?')) {
                        location.href = "login.html";
                    }
                } else {
                    alert(response.message);
                }
            }
        );
    }
});
