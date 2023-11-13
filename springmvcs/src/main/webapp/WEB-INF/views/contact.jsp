<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--https://getbootstrap.com/docs/5.0/getting-started/introduction/  -->
              <!--bootstrap link   -->
<!doctype html>
<%@ page isELIgnored="false"%>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  <div class="container mt-5"><!--Margin top   -->
   	<form action="processForm" method="post">
   	     	<h3 class="text-center">${Header}</h3>
     	<p class="text-center">${desc}</p>
   		<h1 class="text-center">Registration Form</h1>
  		<div class="form-group">
   			 <label for="Email1" class="form-label">Email address</label>
   			 <input type="email" class="form-control" id="Email1" aria-describedby="emailHelp" name="email" placeholder="Enter Here">
 		 </div>
  		<div class="form-group">
   			 <label for="UserName" class="form-label">User Name</label>
   			 <input type="text" class="form-control" id="UserName" aria-describedby="userNameHelp" name="name" placeholder="Enter Here">
 		 </div>
  		<div class="form-group">
   			 <label for="Password" class="form-label">Password</label>
   			 <input type="password" class="form-control" id="Password" aria-describedby="userNameHelp" name="password" placeholder="Enter Here">
 		 </div>
 		 <div class="container text-center mt-5">
 		 <button type="submit" class="btn btn-success">Submit</button>
		 </div>
	</form>
  </div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>