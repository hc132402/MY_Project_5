<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>书籍详情页</title>

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
	 	String username=(String)session.getAttribute("username");
	 	%>
    	欢迎用户&nbsp;<%=username%>&nbsp;使用墨韵读书会共享网站&nbsp;&nbsp;|&nbsp;
        <a href="alter2.jsp">我的信息</a><span>&nbsp;&nbsp;</span>&nbsp;|&nbsp;
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
        <strong>&nbsp;&nbsp;&nbsp;图书详情页面</strong>
        </font>
    </p>
    </tr>
    <tr>&nbsp;</tr>
    </table>
</div>
<!--div_PRODUCT_LIST-->

<!--书籍详情页面-->

<div style="width: 790px; margin: 100px 200px; height:500px;">
<div style="float:left;">
<img src="${book.covePath}" alt=""  width="150" height="230"/>
</div>

<div  style="float:left; margin-left:50px">


<table border="0">
<div class="divlisttitle">
	<tr>
		<td style="width:80px">书名：</td>
		<td style="width:400px">
			 ${book.title}
		</td>
	</tr>
	<tr>
		<td style="height:50px"></td>
	</tr>
	<tr>
		<td style="width:80px">作者：</td>
		<td style="width:400px">
			 ${book.author}
		</td>
	</tr>
	<tr>
		<td style="height:50px"></td>
	</tr>
	<tr>
		<td style="width:80px">简介：</td>
		<td style="width:400px">
			 <font size="2">${book.bookIntoduc}</font>
		</td>
	</tr>
	<tr>
		<td style="height:50px"></td>
	</tr>
	<tr>
		<td style="width:80px"></td>
		<td style="width:400px">
			
		</td>
	</tr>
</table>

</div>
</div>


<!--书籍详情页面-->

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