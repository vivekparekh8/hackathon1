<%-- 
    Document   : goodhistory
    Created on : 09-Nov-2014, 05:39:28
    Author     : Vivek Parekh
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
        <% int saving =Integer.parseInt(request.getParameter("saving"));
           int rent = Integer.parseInt(request.getParameter("rent"));
           %> <p>Yearly amount paid for the rent ( no returns for your spending ) is <%=rent*12%></p>
           <p> Putting the saving amount in the bank and getting 2 % interest on that you save<%=saving*1.02%></p>
          
          <p>Now, If you take a home loan that would be beneficial to you as you get to own the property eventually.</p>
          <p>Adding your monthly saving and rent you may be able the loan payment installments of <%=rent+saving%></p>
          
          <p> So, What you are doing here is simply taking benefit of your good credit history & using your money in right place that would have been otherwise wasted in paying rents.
          
              Also, You may get same kind of benefits in car loan and other such offers in the market .</p>
        
        </div>
    </body>
</html>
