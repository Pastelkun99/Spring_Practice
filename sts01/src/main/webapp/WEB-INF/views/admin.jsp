<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>

</head>
<body>
	<h3>관리자 페이지</h3>
	<a href="admin.do?menu=1">회원관리</a> /
	<a href="admin.do?menu=2">게시물관리</a> /
	<a href="admin.do?menu=3">물품관리</a>

	<c:if test="${param.menu == 1 }">
		<h5>회원관리</h5>
	</c:if>
	<c:if test="${param.menu == 2 }">
		<h5>게시물관리</h5>
		<table border="1">
		<thead>
			<tr>
			<th><input type="checkbox" id="checkall" /></th>
			<th>글번호</th>
			<th>글제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>날짜</th>
			<th>비고</th>
			</tr>
		</thead>
		<tbody id="tbody">
		
		</tbody>
		</table>
	</c:if>
	<c:if test="${param.menu == 3 }">
		<h5>물품관리</h5>
	</c:if>

	<script>
		$(function() {
			
			$(document).on('click', '.btn_delete', function() {
				var idx = $(this).index('.btn_delete');
				var no = $('.no').eq(idx).text();
				
				$.get('boardd.json?no='+ no, function(retdata){
					if(retdata.ret == 1){
						$('#tr_' + no).remove(); // 현재 라인 삭제
					}
				}, 'json')
				//alert(idx + ' , ' + no);
				// $('.btn_delete').click(function() {
			});
			$('.btn_delete').click(function() {
				alert('aaa');
			});
			
			$('#checkall').click(function() { // 태그 중에서 id가 checkall인 것이 클릭되면
				if($('#checkall').is(':checked')) { // 태그중에 id가 checkall인 것이 체크 상태면
					$('.check').prop('checked', true); 		//태그 중의 class가 check인것 모두 체크하기
				}
				else {	// 체크 상태가 아니면
					$('.check').prop('checked', false);		//태그 중의 class가 check인것 모두 체크 해제하기
				}
			});
				//{"aaa":"bbb"} => retdata.aaa -> bbb
				//[{    }, {    }]
				$.get('board.json', function(retdata) {
					var len = retdata.length;
					for(var i = 0; i<len; i++) {
						$('#tbody').append(
								'<tr id="tr_' + retdata[i].BRD_NO + '">"' +
									'<td>' + '<input type="checkbox" class="check" />' + '</td>' + 
									'<td class="no">' + retdata[i].BRD_NO + '</td>' +
									'<td>' + retdata[i].BRD_TITLE + '</td>' + 
									'<td>' + retdata[i].BRD_WRITER + '</td>' + 
									'<td>' + retdata[i].BRD_HIT + '</td>' + 
									'<td>' + retdata[i].BRD_DATE + '</td>' +
									'<td>' + 
											'<input type="button" class="btn_delete" value="삭제" />' + 
											'<input type="button" value="수정" />' + 
									'</td>' + 
								'</tr>'
						);
					}
				}, 'json');
			});
	</script>
</body>
</html>