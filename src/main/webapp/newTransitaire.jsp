<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><center>Nouveau Transitaire</center></h1>

<form action="saveTransitaire" method="POST" modelAttribute="transitaire">
nom : <input type="text" name="surname"><br>
prenom : <input type="text" name="name"><br>
nom entreprise : <input type="text" name="nameEntreprise"><br>
mail : <input type="email" name="mail"><br>
siret : <input type="number" name="siret" min="0"><br> <!--  il faudra mettre not null en bdd -->
<input type="submit" name="envoyez">
</form>

</body>
</html>