<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="web.servlet"%>
<%
Object moy =request.getAttribute("m");
%>
<html>
<head>
<style>
body{
background-color:#1a1a1a;
}
.top {
  background-color: #333;
  overflow: hidden;
}

/* Style the links inside the navigation bar */
.top a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.top a:hover {
  background-color: #ddd;
  color: black;
}

/* Add a color to the active/current link */
.top a.active {
  background-color: #2162E1;
  color: white;
}
h3,a{
            font-size: 50px;
            color: rgb(169, 162, 151);
            font-style:normal;
            font-weight:700;
            font-family: Gotham Narrow SSm A,Gotham Narrow SSm B,Rubik,Lato,Lucida Grande,Lucida Sans Unicode,Tahoma,Sans-Serif;
}
h3{
    margin-left: auto;
    margin-right: auto;
    width: 11em
}
</style></head>
<body>
<div class="top">
  <a class="active" href="index.html">Home</a>
  <a href="computer.html">Computer</a>
  <a href="Robotics.html">Robotics</a>
  <a href="physics.html">Physics</a>
  <a href="Chimie.html">Chemistry</a>
  <a href="law.html">Law</a>
  <a href="Gestion.html">Economy</a>
</div>

<h3>
<%
try{
Double arroundimoy=(double) Math.round((Double)moy*100) / 100; // Round https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
out.println("Moyenne ="+arroundimoy);

	if (arroundimoy>9.70)
		out.println("<br>Congrats ..Succes");
	else out.println("<br>Commiseration ..Fail");
}
catch(NullPointerException x){
	response.sendRedirect("index.html");

	
}
%>
</h3>


</body>
</html>