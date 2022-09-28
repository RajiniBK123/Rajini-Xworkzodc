<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>primeMinister</title>
</head>
<body>
<h1> Java Server page is created</h1>
<form action="Rajini" method="post">
name:<br>
<input type="text" id="PMname" name="name"/>
<br>
Country:<br>
<select name="CountryName">
<option>-------SELECT-------- </option>
<option value="India">INDIA</option>
<option value="Australia">AUSTRALIA</option>
<option value="Sydney">SYDNEY</option>
<option value="Srilanka">SRILANKA</option>
<option value="England">ENGLAND</option>
</select>
<br>
<br>
Marriage Status:<br>
<input type="radio" id="Marriage" name="Married">MARRIED</input>
<input type="radio" id="Marriage" name="Unmarried">UNMARRIED</input>
<br>
<br>
Party:<br>
<Select name="PartyName">
<option>-----SELECT------</option>
<option value="BJP">BJP<option>
<option value="JDC">JDC<option>
<option value="Congress">CONGRESS<option>
<option value="Janasena">JANASENA<option>
<option value="KJP">KJP<option>
</Select>
<br>
<br>
Age:<br>
<input type="text" id="Age" name="Age">
<br>
<br>
Gender:<br>
<input type="radio" id="gend" name="female">FEMALE</input>
<input type="radio" id="gend" name="male">MALE</input>
<input type="radio" id="gend" name="others">OTHERS</input>
<br>
<br>
Period as:<br>
<input type="text" id="period" name="Period"/>
<br>
<br>
Time Represented:<br>
<Select name="Time">
<option>------SELECT--------</option>
<option value="2times"> 2TIMES</option>
<option value="3times"> 3TIMES</option>
<option value="4times"> 4TIMES</option>
<option value="5times"> 5TIMES</option>
</Select>
<br>
<br>
<input type="submit" value="SAVE">



</form>

</body>
</html>