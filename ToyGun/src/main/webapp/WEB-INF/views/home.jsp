<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
<title>MyWish Gun Store</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">
<link href="/resources/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">
<link href="/resources/css/sb-admin.css" rel="stylesheet">
<style>
.buttonbox {
	text-align:center;
}
.box1, .box2, .box3 {
	margin:5px;
}
.portrait {
	text-align:center;
}
h2 {
	text-align:center;
}
.body {
	margin:10px;
	padding:0px;
}

</style>

</head>
<body class="body">
	<h2>장난감</h2>
	<div class="portrait">
	<img
		src="http://image.kmib.co.kr/online_image/2019/0102/611311110012960095_1.jpg"
		height="696" width="1100">
	</div>

	<div class="buttonbox">
		<br> <br>
		
		<button type="button" class="btn btn-primary box1"
			onclick="location.href='Assultrifle'">돌격소총</button>
		<button type="button" class="btn btn-primary box2"
			onclick="location.href='Pistol'">권총</button>
		<button type="button" class="btn btn-primary box3"
			onclick="location.href='Shotgun'">산탄총</button>
	</div>

</body>
</html>
