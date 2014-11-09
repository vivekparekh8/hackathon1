<%-- 
    Document   : index
    Created on : Nov 9, 2014, 10:18:13 AM
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
        <div class="mycenter">
        <form name="moneymanage" id="moneymanage" method="post" action="moneymanage.jsp">
            <section id="buttons">
                <input type="submit" name="moneymanage" id="moneymanage" value="Manage Your Money" class="classname">
            </section>  
        </form>
        <form name="moneymanage" id="moneymanage" method="post" action="gensavingtips.jsp">
            <section id="buttons">
                <input type="submit" name="gensavingtips" id="gensavingtips" value="Need some Saving Tips?" class="classname">
            </section>  
        
        </form>
        
        </div>
        </div>       
    </body>
</html>
