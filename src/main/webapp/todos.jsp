<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<title>Angular JS Includes</title>
	<%--
		<link href="${pageContext.request.contextPath}/resources/css/app.css" rel="stylesheet" > 
	 --%>
	 
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
    <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
    
</head>
<body>
<body ng-app = "mainApp">
	<div class="container">
		<div class="page-header">
			<h2>TODO'S</h2>
		</div>
		<div class="content">
			<div ng-controller="studentController">
		       	<div class="panel panel-default">
				  <div class="panel-heading">TODO'S</div>
				  <div class="panel-body">
					<table class="table table-hover">
					   <thead>
					   	<tr>
					   	  <th>Id</th>
					      <th>Subject</th>
					      <th>Description</th>
					      <th>Status</th>
					      <th>Priority</th>
					      <th>Actions</th>
				      	</tr>
					   </thead>
					   <tbody>
						   <tr ng-repeat = "todo in todos">
						   	  <td>{{ todo.id }} </td>
						      <td>{{ todo.subject }}</td>
						      <td>{{ todo.description }}</td>
						      <td>{{ todo.status }}</td>
						      <td>{{ todo.priority }}</td>
						      <td>
						      	<button class="btn btn-info" ng-click="editTodo(todo)"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></button>
						      	<button class="btn btn-danger" ng-click="deleteTodo(todo.id)"><i class="glyphicon glyphicon-trash" aria-hidden="true"></i></button>
						      </td>
						   </tr>
					   </tbody>
					</table>  
				  </div>
				</div>
				
				<div class="form-inline">
				  <div class="form-group">
				    <input type="text" class="form-control" ng-model="todo.subject" placeholder="Subject">
				  </div>
				  <div class="form-group">
				    <input type="text" class="form-control" ng-model="todo.description" placeholder="Description">
				  </div>
				  <div class="form-group">
				    <input type="text" class="form-control" ng-model="todo.status" placeholder="staus">
				  </div>
				  <div class="form-group">
				    <input type="text" class="form-control" ng-model="todo.priority" placeholder="Priority">
				  </div>
				  <button type="button" class="btn btn-success" ng-click="addTodo()" ng-if="!edit_status">Add</button>
				  <button type="button" class="btn btn-success" ng-click="updateTodo()" ng-if="edit_status">Update</button>
				  <button type="button" class="btn btn-info" ng-click="clear()">Clear</button>
				</div>
	      	</div>		
		</div>
	</div>
      
      <script>
         var mainApp = angular.module("mainApp", []);
         
         mainApp.controller('studentController', function($scope, $http) {
            $scope.todos = [];
            $scope.todo = {};
        	$scope.edit_status = false;
            
            $http.get("http://localhost:8080/gsk/todos/list")
            .then(function(response) {
            	console.log(response);
                $scope.todos = response.data;
            });
            
            $scope.addTodo = function(){
            	$http.post("http://localhost:8080/gsk/todos/create", $scope.todo)
            	.then(function(response){
            		$scope.todos.push(response.data);
            	});
            }
            
            $scope.updateTodo = function(){
            	$http({
            		"url" : "http://localhost:8080/gsk/todos/update/"+$scope.todo.id,
            		"method": "PUT",
            		"data": $scope.todo 
            	}).then(function(response){
            		alert("Successfully updated");
            	});
            	
            }
            
            $scope.editTodo = function(todo) {
            	$scope.edit_status = true;
            	$scope.todo = todo;
            }
            
            $scope.deleteTodo = function(id) {
            	alert("Delete todo "+ id);
            }
            
            $scope.clear = function(){
            	$scope.todo = {};
            }
         });
      </script>
      
   </body>
</body>
</html>