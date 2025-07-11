<%@page import="com.tops.Model.ProductDetails"%>
<%@page import="java.util.Optional"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Boot MVC</title>
</head>
<body>
<h1 style="text-align: center"> Product Details</h1>
<%
	Optional<ProductDetails> optional=(Optional)request.getAttribute("product");
ProductDetails p=optional.orElse(null);
%>
<div style="text-align: center">
<f:form action="${pageContext.request.contextPath}/AddProduct" method="post" modelAttribute="product">
<f:input path="productId" value="<%=p.getProductId() %>"  />
<label>Product Name</label>
 <f:input path="productName" class="form-control"  value="<%=p.getProductName() %>"  /><br><br>
<label>Product Price</label>
<f:input path="Price" class="form-control" value="<%=p.getPrice() %>" /><br><br>
<label>Product Description</label>
<f:input path="Description"  class="form-control" value="<%=p.getDescription() %>"/><br><br>
<button type="submit">Submit</button>

 </div>
</f:form>
</body>
</html>