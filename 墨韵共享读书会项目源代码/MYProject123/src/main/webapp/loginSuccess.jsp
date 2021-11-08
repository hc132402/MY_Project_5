<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>登录成功界面</title>

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
    	<%
	 	String username=(String)session.getAttribute("user");
	 	%>
    	欢迎用户&nbsp;<%=username%>&nbsp;使用墨韵读书会共享网站&nbsp;&nbsp;|&nbsp;
        <a href="alter.jsp">我的信息</a><span>&nbsp;&nbsp;</span>&nbsp;|&nbsp;
        <a href="index.jsp">退出登录</a><span>&nbsp;&nbsp;</span>
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
        <strong>&nbsp;&nbsp;&nbsp;登录成功</strong>
        </font>
    </p>
    </tr>
    <tr>&nbsp;</tr>
    </table>
</div>
<!--div_PRODUCT_LIST-->

<!--登录成功页面表单begin-->
<div style="width: 790px; margin: 0 auto; height:550px;">
		<%
		String name =(String)session.getAttribute("user");
	 	%>
	 	<p style="font-size: 30px">恭喜&nbsp;<%=name%>&nbsp;注册成功！
	 	即将进入登录页面...</p>
	 	<% 
	 	HttpServletResponse resp=(HttpServletResponse)response;
	 	resp.setHeader("refresh", "1.5;URL=login.jsp");
	 	%>
</div>
<!--登录成功页面表单end-->

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