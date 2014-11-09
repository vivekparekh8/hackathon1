<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Money Advising</title>
</head>
<body>
<center><h1>Money Advisor</h1>
<p>Personal advising on how much budget you have set and in reality how much you have spent</p>
<form name="input" action="ExpendServlet" method="GET">
<table>
<thead>
<tr>
<th>Category</th>
<th>Budgeted</th>
<th>Actual</th>
<!-- <th>Whats left</th> -->
</tr>
</thead>
<tbody>
<tr>
<td>Entertainment</td>
<td><input type="text" name="bEnt"></td>
<td><input type="text" name="eEnt"></td>
<!-- <td><input type="text" name="dEnt"></td> -->
</tr>
<tr>
<td>Groceries</td>
<td><input type="text" name="bGros"></td>
<td><input type="text" name="eGros"></td>
<!-- <td><input type="text" name="dGros"></td> -->
</tr>
<tr>
<td>Housing</td>
<td><input type="text" name="bHouse"></td>
<td><input type="text" name="eHouse"></td>
<!-- <td><input type="text" name="dHouse"></td> -->
</tr>
<tr>
<td>Saving</td>
<td><input type="text" name="bSave"></td>
<td><input type="text" name="eSave"></td>
<!-- <td><input type="text" name="dSave"></td> -->
</tr>
<tr>
<td>Telephone</td>
<td><input type="text" name="bTel"></td>
<td><input type="text" name="eTel"></td>
<!-- <td><input type="text" name="dTel"></td> -->
</tr>
<tbody>
<!-- <tfoot>
<tr>
<td>Total</td>
<td><input type="text" name="bTot"></td>
<td><input type="text" name="eTot"></td>
<td><input type="text" name="dTot"></td>
</tr>
</tfoot> -->
</table> <br/>
<input type="submit" value="Calculate">
</form>
</center>
</body>
</html>