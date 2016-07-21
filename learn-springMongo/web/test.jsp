<%--
  Created by IntelliJ IDEA.
  User: daihui
  Date: 2015-10-07
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
    <title>上传</title>
</head>
<body>
<p>文件上传</p>
<div>
    <form action="${ctx}/upload/springUpload" method="post">
        <input type="file" name="file" id="file">
        <input type="button" value="submit" title="上传">
    </form>
</div>
</body>
</html>
