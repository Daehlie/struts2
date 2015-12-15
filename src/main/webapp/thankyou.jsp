
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Registration Successful</title>
</head>
<body>
<h3>Thank you for registering.</h3>

<p>Your registration information: <s:property value="personBean" /> </p>

<p><a href="<s:url action='index' />" >Return to index</a>.</p>

</body>
</html>