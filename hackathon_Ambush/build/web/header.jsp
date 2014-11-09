<%-- 
    Document   : header
    Created on : Sep 13, 2013, 12:19:44 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style type="text/css">
        .header{
            margin-top: 1 cm;
            background-color: mediumspringgreen;
		height:70px;
		
	}
	.logo
	{
		background-image:url(images/bug.jpg);
		height:62px;
		width:62px;
		margin-top: 4px;
		margin-left: 3px;
		float:left;
	}
	.companyname{
	margin-left: 20px;
	height: 62px;
	float: left;
		
		
	}
	.login
	{
		float:right;
		height: 62px;
		margin-left:30%;
		
	}
	.menu
	{
		margin-top:10px;
		height:35px;
		background-color:#FFFF66;
	}
		
</style>
    </head>
    <body>
        
        <div class="header">
<div class="logo">
</div>
<div class="companyname">

<h1> Ambush Financial </h1></div> 
 <div class="login">
 
<table height="61" width="302" style="border-width:0px;">

<tr>
<td height="25px"><center><a href="index.jsp"> Home </a></center></td>
<td height="25px"><a href="financiallearning.jsp"> Financial Learning</a></td>
<td height="25px"><a href="Expenditure.jsp"> Expenditure Management</a></td>
</tr>
</table>

      

</div>
</div>

        
    </body>
</html>
