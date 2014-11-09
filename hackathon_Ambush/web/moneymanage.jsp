<%-- 
    Document   : index
    Created on : 08-Nov-2014, 17:25:24
    Author     : Vivek Parekh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
  <title>Money Manager</title>
  <meta name="author" content="Jake Rocheleau">
  <link rel="stylesheet" type="text/css" media="all" href="style.css">
  <link rel="stylesheet" type="text/css" media="all" href="responsive.css">
  <link rel="stylesheet" type="text/css" href="mystyle.css">
<title>Money Manager</title>
 

   <script type="text/javascript"> 
var intTextBox=0; 
function generateTextBox(value){ 
intTextBox = intTextBox + 1; 
var testdiv = document.getElementById('testdiv'); 
var newTBDiv = document.createElement('div'); 
newTBDiv.setAttribute('id','strText'+intTextBox); 
newTBDiv.innerHTML = "Text "+intTextBox+":<input type='text' value='" + value + "' id='" + intTextBox + "' name='" + intTextBox + "'/>"; 
testdiv.appendChild(newTBDiv); 
return true; 
} 
</script> 

 
<style type="text/css">
	div{
		padding:10px;
	}
</style>
</head>
<body>
    
    <%@include file="header.jsp" %>
    <section id="container">
		
		<h2>Money Manager</h2>
		<form name="hongkiat" id="hongkiat-form" method="post" action="expenseschart">
		<div id="wrapping" class="clearfix">
			<section id="aligned">
                            <font size="3">Location     </font><select id="location" name="location" class="selmenu"><option value="urban">Urban</option>
                                <option value="rural">Rural</option>
                            </select><br>
                            <br>
                        <input type="text" name="name" id="name" placeholder="Name : " autocomplete="off" tabindex="1" class="txtinput"><br>
		
                        <input type="text" name="income" id="income" placeholder="Income : " autocomplete="off" tabindex="1" class="txtinput"><br>
			
                        <input type="text" name="housing" id="housing" placeholder="Rent : " autocomplete="off" tabindex="1" class="txtinput"><br>
                        
                        <input type="text" name="food" id="food" placeholder="Food : " autocomplete="off" tabindex="1" class="txtinput"><br>
                        
                        <input type="text" name="transportation" id="transportation" placeholder="Transport : " autocomplete="off" tabindex="1" class="txtinput"><br>
                        
                        <input type="text" name="debt" id="debt" placeholder="Loan : " autocomplete="off" tabindex="1" class="txtinput"><br>
		
                        <input type="email" name="email" id="email" placeholder="Email Id If u want to send summary: " autocomplete="off" tabindex="2" class="txtinput"><br>
			
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
