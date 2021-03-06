<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	
	<script>
		window.menu = '${title}';
		window.contextRoot = '${contextRoot}';
	</script>
	
    <title>Online Shopping - ${title}</title>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
	
	<!-- Bootstrap Readable theme -->
    <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
    
    <!-- Bootstrap DataTables -->
    <link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
    
    <!-- Add custom CSS here -->
    <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
<div class="wrapper">
    <!-- Navbar section -->    
    <%@include file="./shared/navbar.jsp" %>
    
    <div class = "content">
    <!-- Page content section (home) -->
    <c:if test="${userClickHome == true}">
    <%@include file="home.jsp" %>
    </c:if>

    <!-- Page content section (About) -->
    <c:if test="${userClickAbout == true}">
    <%@include file="about.jsp" %>
    </c:if>

    <!-- Page content section (Contact) -->
    <c:if test="${userClickContact == true}">
    <%@include file="contact.jsp" %>
    </c:if>
    
    <!-- Page content section (listProducts) -->
    <c:if test="${userClickAllProducts == true or userClickCategoryProducts==true}">
    <%@include file="listProducts.jsp" %>
    </c:if>
    
    <!-- Page content section (ShowProduct) -->
    <c:if test="${userClickShowProduct==true}">
    <%@include file="singleProduct.jsp" %>
    </c:if>
    </div>   
       
    <!-- footer section -->
	<%@include file="./shared/footer.jsp" %>



    <!-- JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.min.js"></script>
	<script src="${js}/myapp.js"></script>
	<script src="${js}/jquery.dataTables.js"></script>
	<!-- Bootstrap DataTables -->
    <script src="${js}/dataTables.bootstrap.js"></script>
</div>
</body>

</html>
