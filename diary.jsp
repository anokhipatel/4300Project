<%@ page import = "diary.*" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title> Diary Entry </title>

<head>
<body>
        <jsp:useBean id="diaryBean" class="diary.DiaryBean" scope="session"/>
        <jsp:setProperty name ="diaryBean" property ="*" />
        <h1 style="color:blue"> Diary Entry </h1>
<form method ="GET" action = "http://172.17.149.181:8080/Diary/index.jsp">
<table border = "1" cellpadding = "10">
<tr>
        <th>Author </th>
        <th>Comment</th>
        <th>Date</th>
</tr>
<c:forEach items = "${diaryBean.postingList}" var = "post">
<%--display table row for this genre--%>
<tr>
        <td>${post.author}</td>
        <td>${post.comment}</td>
        <td>${post.date}</td>
</tr>
</c:forEach>
</table>

<table>
<h2> Add Message</h2>

<p>From <select name="author">
<option value="Anokhi">Anokhi Patel</option>
<option value="Mary">Mary Brown</option>
<option value="Dasnee">Dasnee Bailey</option>
</select>

<br><textarea name ="comment" rows="4" cols="80"></textarea>
<br><input type ="submit" value="Post">


</form>
</body>
</html>


