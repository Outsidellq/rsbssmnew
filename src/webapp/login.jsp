<%--
  Created by IntelliJ IDEA.
  User: 小可爱
  Date: 2020/5/15
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <!-- meta data -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- title of site -->
    <title>登陆</title>
    <!-- For favicon png -->
    <link rel="shortcut icon" type="image/icon" href="<%=request.getContextPath()%>/assets/logo/favicon.png" />
    <!--bootstrap.min.css-->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/bootstrap.min.css">
    <!--style.css-->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/style.css">
</head>
<body>
<div class="container" style="padding-top: 100px;">
    <div class="sign-content">
        <h2>登陆人事系统</h2>
        <form action="/loginname" method="post">
            <div class="row">
                <div class="col-sm-12">
                    <div class="signin-form">

                        <div class="form-group">
                            <label for="account">Account</label>
                            <input type="username" name="username" class="form-control" id="account" placeholder="请输入账户">
                        </div>
                        <!--/.form-group -->
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" name="password" class="form-control" id="password" placeholder="请输入密码">
                        </div>
                        <!--/.form-group -->
                    </div>
                    <!--/.signin-form -->
                </div>
                <!--/.col -->
            </div>
            <!--/.row -->

            <div class="row">
                <div class="col-sm-12">
                    <div class="signin-password">
                        <div class="awesome-checkbox-list">
                            <ul class="unstyled centered">
                                <li>
                                    <input class="styled-checkbox" id="styled-checkbox-2" type="checkbox" value="value2">
                                    <label for="styled-checkbox-2">记住密码</label>
                                </li>
                                <li>
                                    <a href="#">忘记密码 ?</a>
                                </li>
                            </ul>
                        </div>
                        <!--/.awesome-checkbox-list -->
                    </div>
                    <!--/.signin-password -->
                </div>
                <!--/.col -->
            </div>
            <!--/.row -->
            <div class="row">
                <div class="col-sm-12">
                    <div class="signin-footer">
                        <button type="submit" class="btn signin_btn">
                            登陆
                        </button>
                    </div>
                    <!--/.signin-footer -->
                </div>
                <!--/.col-->
            </div>
            <!--/.row -->
        </form>
        <!--/form -->
    </div>
    <!--/.sign-content -->
</div>
<!--/.container -->
</body>

</html>

