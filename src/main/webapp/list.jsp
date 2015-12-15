
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>List All Records</title>
<s:head />
</head>
<body>
    <h3>All Records:</h3>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Email</th>
        </tr>
        <s:iterator  value="list">
            <tr><td><s:property value="firstName"/>&nbsp;
            <s:property value="lastName" /></td>
            <td><s:property value="age"/></td>
            <td><s:property value="email"/></td></tr>
        </s:iterator>
    </table>
    <br/>
    <p><a href="<s:url action='index' />" >Return to index</a>.</p>
</body>
</html>