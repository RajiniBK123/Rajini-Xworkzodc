<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>CRIMINAL DETAILS</h1>
<form action="start" method="post">
<br><br>
NAME:<input type="text" name="name">
<br><br>
AGE:<select name="age">
<option>Select</option>
<c:forEach begin="12" end="100" var="index">
<option value="${index}">${index}</option>
</c:forEach>
</select>
<br><br>
COUNTRY:<select name=country>
<option>select</option>
<option>INDIA</option>
<option>SOUTHAFRICA</option>
<option>PAKISTAN</option>
<option>AUSTRALIA</option>
<option>NEWZEALAND</option>
<option>SHRILANKA</option>
</select>
<br><br>
Criminal Type:<select name=criminalType>
<option>SELECT</option>
<option>MURDER</option>
<option>HALF MURDER</option>
<option>RAPE</option>
<option>TERRORIST</option>
</select>

<br><br>
NOOFCASES:<select name="noOfCases">
<option>select</option>
<c:forEach begin="1" end="100" var="index">
<option value="${index}">${index}</option>
</c:forEach>
</select>
<br><br>
ALIVE:<input type="radio" name="alive" value="Alive">Alive
<input type="radio" name="alive" value="NotAlive">NotAlive
<br><br>
GENDER:<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="other">other
<br><br>
INTERNATIONAL:<input type="radio" name="international" value="International">International
<input type="radio" name="international" value="Local">Local
<input type="radio" name="international" value="other">other
<br><br>
MARRIED:<input type="radio" name="married" value="Married">Married
<input type="radio" name=married value="Local">UnMarried
<input type="radio" name="married" value="other">other
<br><br>
JAILTERM:<select name="jailTerm">
<option>select</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select>
<br><br>
WIFENAME:<input type="text" name="wifeName"/>
<br><br>
RIGHT HAND NAME:<input type="text" name="rightHandName"/>
<br><br>
LEFT HAND NAME:<input type="text" name="leftHandName"/>
<br><br>
PRISON NAME:<input type="text" name="prisonName"/>
<br><br>
NET WORTH:<input type="text" name="netWorth"/>
<br><br>
<input type="submit" value="SAVE">

</form>
<br><br>
<a href="criminal">SHOW ALL CREMINALS DETAILS</a>

</body>
</html>