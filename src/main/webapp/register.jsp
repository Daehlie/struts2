
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Register</title>
<s:head />
</head>
<body>
<h3>Register by completing this form.</h3>

<s:form action="register_process">

 	  <s:textfield name="personBean.firstName" label="First name" />
 	  <s:textfield  name="personBean.lastName" label="Last name" />
 	  <s:textfield name="personBean.email"  label ="Email"/>
 	  <s:textfield name="personBean.age"  label="Age"  />

   	  <s:submit/>

</s:form>
<br/>
<p><a href="<s:url action='index' />" >Return to index</a>.</p>
</body>
</html>