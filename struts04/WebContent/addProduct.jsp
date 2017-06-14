<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>

<html>
	<form action="addProduct" method="post">
		 name: <input type="text" name="product.name">
		    <br/><br/>
		 color: <input type="text" name="product.color">
		    <br/><br/>
		 <input type="submit" value="submit">
	</form>
</html>

<!-- 
提交数据的时候指定编码方式UTF-8
并且设置form 的method为post方式
 -->