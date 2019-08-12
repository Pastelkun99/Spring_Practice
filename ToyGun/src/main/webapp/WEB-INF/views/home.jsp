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
	<h2>아직 어른이 덜 된 성인의 장난감들</h2>
	<div class="portrait">
	<img
		src="https://dcimg4.dcinside.co.kr/viewimage.php?id=2cb4c235ead42ca17bb1&no=24b0d769e1d32ca73fee80fa11d028315a8efe524a7018c72c9aa2b29d1c978bc51c4d9a945b092f6338d2332163cca2027e1ced799bc5f80827c733962631aeef8f37de68"
		height="480" width="730">
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
