<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>登录界面</title>

<style type="text/css">
	/*重置浏览器的默认样式 */
* { margin:0; padding:0;  list-style:none;}
</style>

</head>
<body>
<div style="width: 1024px;	margin: 0 auto;	background: #eee;">

<!--header_begin-->
<header style="width: 1024px; height: 70px;">
	<img src="Images/my1.png" align="left" height="70px" weight="400px">
    <table>
    <tr>&nbsp;</tr>
    <tr>
    <ul align="right">
    	<a href="index.jsp">首页</a><span>&nbsp;|</span>
        <a href="login.jsp">登录</a><span>&nbsp;|</span>
        <a href="register.jsp">注册</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </ul>
    </tr>
    <tr>&nbsp;</tr>
    </table>   
</header>
<!--header_end-->

<!--nav_begin-->
<nav style="width: 1000px; margin: 0 auto; height:25px;	background: #000;">	
<ul align="center">
    <a href="#"><font color="white" size="2">文学&nbsp;</font></a>
    <a href="#"><font color="white" size="2">生活&nbsp;</font></a>
    <a href="#"><font color="white" size="2">计算机&nbsp;</font></a>
    <a href="#"><font color="white" size="2">外语&nbsp;</font></a>
    <a href="#"><font color="white" size="2">经营&nbsp;</font></a>
    <a href="#"><font color="white" size="2">荔枝&nbsp;</font></a>
    <a href="#"><font color="white" size="2">社科&nbsp;</font></a>
    <a href="#"><font color="white" size="2">学术&nbsp;</font></a>
    <a href="#"><font color="white" size="2">少儿&nbsp;</font></a>
    <a href="#"><font color="white" size="2">艺术&nbsp;</font></a>
    <a href="#"><font color="white" size="2">原版&nbsp;</font></a>
    <a href="#"><font color="white" size="2">科技&nbsp;</font></a>
    <a href="#"><font color="white" size="2">考试&nbsp;</font></a>
    <a href="#"><font color="white" size="2">生活百科&nbsp;</font></a>
    <a href="#"><font color="yellow" size="2">全部商品目录</font></a>
</ul>
</nav>
<!--nav_end-->

<!--div_search-->
<div style="width: 1000px; margin: 0 auto; height:25px; background: #CC7;">
    <form name="form_search" align="right">
        <font size="3" color="#666">Search</font>
        <input type="text" name="text_search">
        <button><font size="2" color="#666">按钮</font></button>
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </form>
</div>
<!--div_search-->

<!-- 一条线 -->
<hr/>




<!--div_PRODUCT_LIST-->
<div style="width: 1000px; margin: 0 auto; height:60px; background: #CC7;border-radius:15px;">
    <table>
    <tr>&nbsp;</tr>
    <tr>
    <p>
        <font size="4" color="#fff" text="center">
        <strong>&nbsp;&nbsp;&nbsp;登录页面</strong>
        </font>
    </p>
    </tr>
    <tr>&nbsp;</tr>
    </table>
</div>
<!--div_PRODUCT_LIST-->

<!--登录页面表单begin-->
<div style="width: 790px; margin: 100px 200px; height:500px;">

<table border="0">
	<form action="loginCheckServlet" method="post">
	<tr>
	${alterSuccess}
		<!-- <% String username=(String)session.getAttribute("user"); %> -->
		<td style="width:80px">用户名：</td>
		<td style="width:350px">
			<input type="text" name="name"/>&nbsp;${loginError1}
		</td>
		
	</tr>
	    
	<tr>
		<td style="height:20px"></td>
	</tr>
	
	<tr>
		<td style="width:80px">密码：</td>
		<td style="width:350px">
			<input type="password" name="pwd" />&nbsp;${loginError2}
		</td>
	</tr>
	
	<tr>
		<td style="height:20px"></td>
	</tr>
	
	<tr>
		<td style="width:80px"></td>
		<td style="width:350px">
			<input type="submit" value="登录" style="width:50px;"/>
			&nbsp;&nbsp;&nbsp;
			<input type="button" value="注册" onclick="next()" style="width:50px;"/>
			<script type="text/javascript">
			function next() {
				window.location="register2.jsp";
			}
			</script>
		</td>
	</tr>
	</form>	
</table>
<div style="margin:30px 0px 0px 90px;">${loginError3}</div>
</div>
<!--登录页面表单end-->

<!--footer_begin-->
<footer style="width:1024px; margin: 0 auto; height:60px;  background: #CCA;">
    <table>
    <tr>
    <td width="341">
    <img src="Images/my2.png" align="left" height="50px" weight="400px">
    </td>
    <td>
    <p>CONTACT US</p>
    <p align="center">copyright 2021 &copy; Book All Rights</p>
    </td>

    </tr>
    </table>
</footer>
<!--footer_end-->
</div>
</body>
</html>