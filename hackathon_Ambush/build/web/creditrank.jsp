<%-- 
    Document   : creditrank
    Created on : 09-Nov-2014, 02:31:27
    Author     : Vivek Parekh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
        <title>Credit Tip</title>
        <meta name="author" content="Vivek Parekh">
        <link rel="stylesheet" type="text/css" media="all" href="style.css">
        <link rel="stylesheet" type="text/css" media="all" href="responsive.css">
    </head>
    <style type="text/css">
	div{
		padding:10px;
	}
    </style>
    <body>
        <%@include file="header.jsp" %>     
        <section id="container">
		
		<h2>Credit Rank</h2>
		<form name="hongkiat" id="hongkiat-form" method="post" action="credithistory">
		<div id="wrapping" class="clearfix">
			<section id="aligned">
			
                        <input type="text" name="ssn" id="ssn" placeholder="Enter SSN : " autocomplete="off" tabindex="1" class="txtinput"><br>
		
                        <input type="text" name="bankname" id="bankname" placeholder="Bank Name : " autocomplete="off" tabindex="1" class="txtinput"><br>
			
                        <input type="text" name="account" id="account" placeholder="Account No. : " autocomplete="off" tabindex="1" class="txtinput"><br>
                        
			</section>
			
		</div>
                <br> 
                <!--Test combo box:: 
                <select id="selectValue" name="selectValue" OnChange="return generateTextBox(this.options[this.selectedIndex].text)"> 
                <option value="">Select a reason</option> 
                <option value="1">1 </option> 
                <option value="2">2 </option> 
                <option value="3">3 </option> 
                <option value="4">4 </option> 
                <option value="5">5 </option> 
                </select> 
                <div id="testdiv"></div> -->

                <center>
		
			<input type="reset" name="reset" id="resetbtn"  value="Reset">
			<input type="submit" name="submit" id="submitbtn" value="Submit this!">
		
                </center>
		</form>
	</section>
    </body>
</html>
