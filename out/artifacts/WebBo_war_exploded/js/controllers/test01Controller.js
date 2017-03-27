
app.controller('test01Ctrl',function ($rootScope,$scope, $http,$resource,$location) {
	$http.get('js/StudentInfo.json')  
    .success(function (Data) {  
        $scope.names = Data;  
        console.info(Data);  
    });
	
	$scope.currentStu = {};  
    $scope.x = $scope.names;  
    $scope.researchStu = function (x) {  
        $scope.research = x;  
    };  
    $scope.deleteStu = function (x) {  
        $scope.x.splice($scope.names.indexOf(x), 1);  
    };  
    $scope.addStu = function (x) {  
        $scope.stu.push(x);  
    };  
    $scope.isSelected = function (currentrow) {  
        console.info(currentrow);  
        return currentrow;  
    }  
    $scope.editStu = function () {  
        var now = $scope.isSelected();  
        console.info(now);  
    };  
});