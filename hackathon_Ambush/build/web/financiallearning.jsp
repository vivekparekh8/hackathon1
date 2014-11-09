<%-- 
    Document   : financiallearning
    Created on : Nov 9, 2014, 12:21:08 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="mystyle.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="wraper">
         <%@include file="header.jsp" %>
         <ul>
             <li><a href="moneybasics.jsp">Money Basics : Learn some banking terms</a></li>
             <li><a href="creditcard.jsp">Credit Cards and Credit History </a></li>
             <li><a href="gensavingtips.jsp">Learn some saving tips</a></li>
         </ul>
        </div>
    </body>
</html>
