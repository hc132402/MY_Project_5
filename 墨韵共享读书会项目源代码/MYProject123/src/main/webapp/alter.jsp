<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>修改个人信息</title>

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
    	<%String username=(String)session.getAttribute("username");%>
    	欢迎用户&nbsp;<%=username %>&nbsp;使用墨韵读书会共享网站&nbsp;&nbsp;|&nbsp;
    	<a href="index2.jsp">首页</a><span>&nbsp;&nbsp;</span>&nbsp;|&nbsp;
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



<hr/> 



<!--div_PRODUCT_LIST-->
<div style="width: 1000px; margin: 0 auto; height:60px; background: #CC7;border-radius:15px;">
    <table>
    <tr>&nbsp;</tr>
    <tr>
    <p>
        <font size="4" color="#fff" text="center">
        <strong>&nbsp;&nbsp;&nbsp;个人信息页面</strong>
        </font>
    </p>
    </tr>
    <tr>&nbsp;</tr>
    </table>
</div>
<!--div_PRODUCT_LIST-->

<!--修改个人信息页面表单-->
<div style="width: 790px; margin: 100px 200px; height:500px;">

<table border="0">
		
	<form action="alterCheckServlet" method="get">
		
	<tr>
		<% String pwd=(String)session.getAttribute("pwd"); %>
		<% String sex=(String)session.getAttribute("sex"); %>
		<% String age=(String)session.getAttribute("age"); %>
		<td style="width:80px">用户名：</td>
		<td style="width:100px">
			<input type="text" name="name" value="<%=username %>" readonly="true"/>
		</td>
	</tr>
	<tr>
		<td style="height:20px"></td>
	</tr>
	<tr>
		<td style="width:80px">密码：</td>
		<td style="width:100px">
			<input type="text" name="pwd" value="<%=pwd%>"/>${alterError1}
		</td>
	</tr>
	
	<tr>
		<td style="height:20px"></td>
	</tr>
	<tr>
		<td style="width:80px">确认密码：</td>
		<td style="width:100px">
			<input type="text" name="rpsw" value="<%=pwd%>"/>${alterError2}
		</td>
	</tr>
	
	<tr>
		<td style="height:20px"></td>
	</tr>
	</tr>
	<tr>
		<td style="width:80px">性别：</td>
		<td style="width:100px"colspan="2">
		<% if(sex.equals("male")){%>
			<input type="radio" value="male" name="sex" checked="checked"/>男&nbsp;&nbsp;
			<input type="radio" value="female" name="sex" />女&nbsp;
		<%}else if(sex.equals("female")){%>
			<input type="radio" value="male" name="sex" />男&nbsp;&nbsp;
			<input type="radio" value="female" name="sex" checked="checked"/>女&nbsp;
			<%}%>
			
		</td>
	</tr>
	
	<tr>
		<td style="height:20px"></td>
	</tr>
	
	<tr>
		<td style="width:80px">年龄：</td>
		<td style="width:100px">
			<input type="text" name="age" value="<%=age%>"/>${alterError3}
		</td>
	</tr>
	<tr>
		<td style="height:20px"></td>
	</tr>
	
	<tr>
		<td style="width:80px"></td>
		<td style="width:100px">
			<input type="submit" value="修改" style="width:100px;"/>
		</td>
	</tr>
	</form>	
</table>
</div>
<!--修改个人信息页面表单-->

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
</html>1