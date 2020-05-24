//控制层
app.controller('codeController', function ($scope, $controller, $location, codeService) {

    $scope.entity = {};

    $scope.code = function () {

        $scope.entity.code = $scope.text;
        $scope.entity.pwd = $.trim($scope.pwd);
        codeService.code($scope.entity).success(
            function (response) {
                if (response.success) {
                    $scope.show = response.message;
                } else {
                    $scope.show = response.message;
                }
            }
        )
    };

    $scope.decode = function () {
        $scope.entity.id = $scope.text;
        $scope.entity.pwd = $.trim($scope.pwd);
        codeService.decode($scope.entity).success(
            function (response) {
                if (response.success) {
                    $scope.show = response.message;
                } else {
                    $scope.show = response.message;
                }
            }
        )
    }
});
