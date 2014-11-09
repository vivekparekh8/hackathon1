<%-- 
    Document   : advise
    Created on : 09-Nov-2014, 03:32:17
    Author     : Vivek Parekh
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="mystyle.css">
        <title>Advice</title>
    </head>
    <body>
        <div class="wraper">
        <%@include file="header.jsp" %>
        <h1>Advice and Credit Ranking</h1>
        <%
            ArrayList list =(ArrayList)session.getAttribute("credithist");    
        %>
        Your Figo (Credit) Score is <%=list.get(3).toString()%>
        Your Credit is <%=list.get(0).toString()%>
        So, Following is the estimated interest rates for the loans you can take.
        Home : <%=list.get(1).toString()%>
        Car : <%=list.get(2).toString()%>
        Average Interest on the savings account in US is 2%.
        <%
            if(list.get(0).toString().equalsIgnoreCase("bad") || list.get(0).toString().equalsIgnoreCase("poor"))
            {%>
                <p>As your credit history is poor or bad, the loans rates are very high and there is a low probability that your loan gets approved.
                </p><p>So, You should open either a saving account or get a credit card that will help to build your credit history.</p>
                <p>To learn more about credit card , <a href="poorhistory.jsp">Click here</a></p>
            <%}
                       else
                       {%>
                       <form action="goodhistory.jsp" method="post">
                           <p>You have a good credit History. You may get loans at reduced interest rates. </p>
                           <p>So there are many options available for you to find a goog saving stratagy for you. </p>
                           <p>enter your details below and find out some better investing ideas.</p><br>
                           <input type="text" name="saving" id="saving" placeholder="enter your monthly saving in $" autocomplete="off" tabindex="1" class="txtinput"><br>
                           <input type="text" name="rent" id="rent" placeholder="enter your monthly rent" autocomplete="off" tabindex="1" class="txtinput"><br>
                      <input type="reset" name="reset" id="resetbtn"  value="Reset">
			<input type="submit" name="submit" id="submitbtn" value="Submit this!">
		
                       </form>
                       <%}%>
            
        </div>
    </body>
</html>
