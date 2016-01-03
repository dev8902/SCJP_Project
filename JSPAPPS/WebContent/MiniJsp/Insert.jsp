<html>
<script type="text/javascript" src="/MiniJsp/insert.js"></script>
<body>
<form name="f" action="./insert" method="post" onsubmit="return isValid(this)">
<table border=1 cellpadding=7 cellspacing=7 align=center>
<caption><i><font size=4><u>Insert Records</caption>
<tr>
<th>Student ID:</th><td><input type="text" name="stu_id"></td></tr>
<tr><th>Student NAME:</th><td><input type="text" name="stu_name"></td></tr>
<tr><th>Student ADDRESS:</th><td><input type="text" name="stu_add"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="INSERT"></td></tr>
</table>
</form>
</body>
</html>