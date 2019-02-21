<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<body>
<h1>Region List</h1>
    <table border="2" width="70%" cellpadding="2">
    <tr><th>Id</th><th>Nombre</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="regionvar" items="${listaRegiones}">
    <tr>
    <td>${regionvar.idRegion}</td>
    <td>${regionvar.nombre}</td>
    <td><a href="/editemp/?id${regionvar.idRegion}">Edit</a></td>
    <td><a href="/deleteemp/?id${regionvar.idRegion}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="empform">Add New Region</a>
    
   <form action="${pageContext.request.contextPath}/agregar" method="POST">
    id: <input type="text"  name="idRegion"> <br/>
    nombre: <input type="text"  name="nombre"> <br/>
    <input type="submit" value ="Insertar">
    </form> 
    
       <form action="${pageContext.request.contextPath}/actualizar" method="POST">
    id: <input type="text"  name="idRegion"> <br/>
    nombre: <input type="text"  name="nombre"> <br/>
    <input type="submit" value ="Insertar">
    </form> 

</body>
</html>
