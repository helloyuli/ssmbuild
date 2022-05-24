<%--
  Created by IntelliJ IDEA.
  User: 与鲤
  Date: 2022/5/22
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增图书</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form  action="${pageContext.request.contextPath}/insert" method="post">
        <div class="form-group">
            <label for="bookname">书籍名称</label>
            <input type="text" name="bookName" class="form-control" id="bookname" placeholder="JAVA" required>
        </div>
        <div class="form-group">
            <label for="counts">书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" id="counts" placeholder="书籍数量" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍详情</label>
            <input type="text" name="detail" class="form-control" id="detail" placeholder="书籍详情" required>
        </div>
        <div class="row">
            <div class="col-md-12 column" >
                <button class="btn btn-success" type="submit">提交</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
