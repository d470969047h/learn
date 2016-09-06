<%--
  Created by IntelliJ IDEA.
  User: daihui
  Date: 2015-10-07
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>上传</title>
</head>
<body>
<b/>
<p>spring文件上传</p>
<div>
    <form id="springUploadForm" action="${ctx}/upload/springUpload" method="post" enctype="multipart/form-data">
        <p>Icon:<input type="file" name = "file"/></p>
        <input type="submit" value="Submit" />
    </form>
</div><b/>

<p>spring-data-mongo文件上传</p>
<div>
    <form id="mongoUploadForm" action="${ctx}/upload/mongoUpload" method="post" enctype="multipart/form-data">
        <p>Icon:<input type="file" name = "file"/></p>
        <input type="submit" value="Submit" />
    </form>
</div>
</body>
</html>
