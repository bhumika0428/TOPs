<%@page import="com.tops.Model.ProductDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" >
<head>
<meta charset="UTF-8">
<title>Spring Boot MVC</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>
<h1 style="text-align: center">List Product Details</h1>
<div style="text-align: center">
<table class="table table-dark"  style="margin: auto;">
<thead>
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Price</th>
<th>Description</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<%-- <tr th:each="p : ${list}">

<td th:text="${p.productId}"></td>
<td th:text="${p.productName}"></td>
<td th:text="${p.Price}"></td>
<td th:text="${p.Description}"></td>
<td></td>
</tr> --%>
<% List<ProductDetails> L= (List) request.getAttribute("list"); %>
<%for(ProductDetails p :L){ %>
<tr>
<th><%=p.getProductId() %></th>
<th><%=p.getProductName() %></th>
<th><%=p.getPrice() %></th>
<th><%=p.getDescription() %></th>
<th><a href="Editproduct/<%=p.getProductId()%>"  class="btn btn-warning">Edit</a>
<a class="btn btn-danger" href="${pageContext.request.contextPath}/DeleteProduct/<%=p.getProductId()%>">Delete</a></th>
</tr>
<%} %>
</tbody>
</table>
<%-- <% List<ProductDetails> L= (List) request.getAttribute("list"); %>
<%for(ProductDetails p :L){ %>
<%=p.getProductId() %>
<%=p.getProductName() %>
<%} %> --%>
</div>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>