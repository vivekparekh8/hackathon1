<%-- 
    Document   : diplayimage
    Created on : Nov 8, 2014, 9:09:52 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" type="text/css" href="mystyle.css">
    </head>
    <%@page import="java.util.ArrayList"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page  import="java.awt.*" %>
<%@ page  import="java.io.*" %>
<%@ page  import="org.jfree.chart.*" %>
<%@ page  import="org.jfree.chart.entity.*" %>
<%@ page  import ="org.jfree.data.general.*"%>
<%
            
            //session.getAttribute("piechart");
            ArrayList piechart=(ArrayList)session.getAttribute("piechart");
    
    
            final DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("housing("+piechart.get(0).toString()+")", new Double(piechart.get(0).toString()));
            data.setValue("Debt("+piechart.get(1).toString()+")", new Double(piechart.get(1).toString()));
            data.setValue("transportation("+piechart.get(2).toString()+")", new Double(piechart.get(2).toString()));
            data.setValue("Food("+piechart.get(3).toString()+")", new Double(piechart.get(3).toString()));
            data.setValue("Saving("+piechart.get(4).toString()+")", new Double(piechart.get(4).toString()));
            String name=piechart.get(5).toString();
            String location=piechart.get(6).toString();
            Float income=Float.parseFloat(piechart.get(7).toString());
            
            //data.setValue("Two", new Double());
            //data.setValue("Three", new Double(27.5));
            //data.setValue("Four", new Double(17.5));
            //data.setValue("Five", new Double(11.0));
            //data.setValue("Six", new Double(19.4));
            JFreeChart chart = ChartFactory.createPieChart("Expense Distribution for the "+name+" having income "+income+" per month", data, true, true, false);
            try {
                final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection()); 
                final File file1 = new File("E:\\java projects\\hackathon1\\web\\piechart.jpg");
                ChartUtilities.saveChartAsPNG(file1, chart, 600, 400, info);
            } catch (Exception e) {
                out.println(e);
            }
%>
    <body>
        <div class="wraper">
        <%@include file="header.jsp" %>
        <table>
            <tr>
                <td>
                    <image src="<%= request.getContextPath()%>/piechart.jpg"></td>
        <% if(location.equalsIgnoreCase("urban")) {%>
                <td><image src="<%= request.getContextPath()%>/piecharturban.jpg"></td>
                </tr>
        </table>
        <% } else { %>
            <td><image src="<%= request.getContextPath()%>/piechartrural.jpg"></td>
            </tr>
        </table>
        <% } 
            Double savingdiff=new Double(piechart.get(4).toString())-(10.00);
            if(savingdiff<0)
            { %>
            <font style="size: 20px;">You Saving is below average. To find more tips about saving, please visit: <a href="gensavingtips.jsp">Saving Tips</a></font>
           <%} else { %>
           <font style="size: 20px;">You Saving is above average. To find more tips about saving, please visit: <a href="gensavingtips.jsp">Saving Tips</a></font>
       <% } %>
        </div>  
    </body>
</html>
