<%--
  Created by IntelliJ IDEA.
  User: DELL-TJ
  Date: 2020/11/9
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="/resource/js/bootstrap.js"></script>
    <link rel="stylesheet" href="/resource/css/bootstrap.css" type="text/css"></link>
    <script type="text/javascript">
        function goPage(pageNum) {
            location = "/list?pageNum="+pageNum;
        }
    </script>
</head>
<body>
<p>晚安打工人</p>
<table class="table">
    <tr>
       <th>编号</th>
       <th>姓名</th>
    </tr>
    <c:forEach items="${info.list}" var="stu">
    <tr>
        <td>${stu.id}</td>
        <td>${stu.name}</td>
    </tr>
    </c:forEach>
</table>
<div><jsp:include page="/resource/js/pages.jsp"></jsp:include></div>
</body>
</html>
