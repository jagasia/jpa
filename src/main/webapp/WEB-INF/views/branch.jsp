<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="jumbotron text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      
    </div>
    <div class="col-sm-4">
      <form:form method="POST" modelAttribute="branch" action="/branch">
      	Id: <form:input path="bid" class="form-control" />
      	Name: <form:input path="bname" class="form-control" />
      	City: <form:input path="bcity" class="form-control" />
      	<br/>
      	<input type="submit" class="btn btn-success" value="Add" name="insert" />&nbsp;
      	<input type="submit" class="btn btn-warning" value="Modify" name="update" />&nbsp;
      	<input type="submit" class="btn btn-danger" value="Delete" name="delete" />&nbsp;
      </form:form>
    </div>
    <div class="col-sm-4">
      
    </div>
  </div>
  <div class="row">
  	<div class="col-sm-2">
      
    </div>
  	<div class="col-sm-8">
      <table class="table table-bordered table-striped table-hover">
      	<thead>
      		<th>Id</th><th>Name</th><th>City</th>
      	</thead>
      	<tbody>
      		<c:forEach var="b" items="${branches}">
      			<tr>
      				<td>${b.bid }</td>
      				<td>${b.bname }</td>
      				<td>${b.bcity }</td>
      			</tr>
      		</c:forEach>
      	</tbody>
      </table>
    </div>
  	<div class="col-sm-2">
      
    </div>
  </div>
</div>
</body>
</html>