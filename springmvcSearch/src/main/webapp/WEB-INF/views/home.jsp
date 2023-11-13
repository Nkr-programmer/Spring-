<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

<!--//css and js  -->
     <link rel="stylesheet" href="<c:url value="/resources/css/style.css/"/>"></link>   
     <script src="<c:url value="/resources/js/script.js/"/>"></script>
       <title>Hello, world!</title>
  </head>

  <body>

   <div class="container text-center" >
   		<div class="container text-center" >
   			<div class="card mx-auto mt-5 bg-secondary" style="width:20%;">
   			<!--//image code  -->
   			  <img alt="my img" src="<c:url value="/resources/image/Screenshot 2023-09-23 2311111.png/"/>"></img>
   			</div>
   		</div>
  		<div class="card mx-auto mt-5 bg-secondary" style="width:60%;">
  			<div class="card-body py-5"></div>
  			<form action="search" class="mt-3">
  			<h1 class="text-white">Google</h1>
   			 
  			 <div class="form-group text-center MT-5">
   			 <input type="text" class="form-control" id="UserName" aria-describedby="userNameHelp" name="queryBox" placeholder="Enter Your Keyword">
 		  		 <div class="container text-center mt-5">
 		 		<button type="submit" class="btn btn-outline-light">Search</button>
		 		</div>
 		 </div>
  			</form>
  		</div>
   </div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
    -->
  </body>
</html>