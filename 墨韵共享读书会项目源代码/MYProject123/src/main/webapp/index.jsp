<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>首页</title>
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

<!--div_BOOK_LIST-->
<div style="width: 1000px; margin: 0 auto; height:60px; background: #CC7;border-radius:15px;">
    <table>
    <tr>&nbsp;</tr>
    <tr>
    <p>
        <font size="4" color="#fff" text="center">
        <strong>&nbsp;&nbsp;&nbsp;图书列表</strong>
        </font>
    </p>
    </tr>
    <tr>&nbsp;</tr>
    </table>
</div>
<!--div_BOOK_LIST-->

<!--showBooks-->
<div style="width: 790px; margin: 0 auto; height:550px;">
<br/>
    <table border="0">
        <tr>
            <td>
                <a href="detailPage2.jsp">
                <a href="${pageContext.request.contextPath}/findBookInfoServlet2?id=1">
                <img src="Images/001.jpg" width="130px" height="197px">
                </a>
                </a>
                <p align="center" style="font-size: 15px">在不安的生活里</p>
            </td>
            
            
            <td width="90px">&nbsp;</td>
            
            
            <td>
            	<a href="detailPage2.jsp">
            	<a href="${pageContext.request.contextPath}/findBookInfoServlet2?id=2">
                <img src="Images/002.jpg" width="130px" height="197px">
                </a>
                		<p align="center" style="font-size: 15px">美好的理想</p> 
            </td>
           
            
            <td width="90px">&nbsp;</td>
             <td>
            	<a href="detailPage2.jsp">
            	<a href="${pageContext.request.contextPath}/findBookInfoServlet2?id=3">
                <img src="Images/003.jpg" width="130px" height="197px">
                </a>
                <p align="center" style="font-size: 15px">你若盛开,芬芳自来</p>
            </td>
            <td width="90px">&nbsp;</td>
            
            <td>
            	<a href="detailPage2.jsp">
            	<a href="${pageContext.request.contextPath}/findBookInfoServlet2?id=4">
                <img src="Images/004.jpg" width="130px" height="197px">
                </a>
                <p align="center" style="font-size: 15px">羊皮卷</p>
            </td>
            
        </tr>
        <tr height="20px"></tr>
        <tr>
            <td>
            	<a href="detailPage2.jsp">
            	<a href="${pageContext.request.contextPath}/findBookInfoServlet2?id=5">
                <img src="Images/005.jpg" width="130px" height="197px">
                </a>
                <p align="center" style="font-size: 15px">过成你想要的样子</p>
            </td>
            <td width="90px">&nbsp;</td>
            <td>
            	<a href="detailPage2.jsp">
            	<a href="${pageContext.request.contextPath}/findBookInfoServlet2?id=6">
                <img src="Images/006.jpg" width="130px" height="197px">
                </a>
                <p align="center" style="font-size: 15px">高情商表达技巧</p>
            </td>
            <td width="90px">&nbsp;</td>
            <td>
            	<a href="detailPage2.jsp">
            	<a href="${pageContext.request.contextPath}/findBookInfoServlet2?id=7">
                <img src="Images/007.jpg" width="130px" height="197px">
                </a>
                <p align="center" style="font-size: 15px">心理自愈法</p>
            </td>
            <td width="90px">&nbsp;</td>
            <td>
            	<a href="detailPage2.jsp">
            	<a href="${pageContext.request.contextPath}/findBookInfoServlet2?id=8">
                <img src="Images/008.jpg" width="130px" height="197px">
                </a>
                <p align="center" style="font-size: 15px">超级记忆书</p>
            </td>
        </tr>
    </table>
</div>
<!--showBooks-->

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