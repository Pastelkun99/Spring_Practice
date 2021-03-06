<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../includes/header.jsp"%>
<!-- ../는 현재 경로에서 한 단계 상위로 올라가겠다는 말 -->


<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">목록보기</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				게시판 목록 페이지
				<button id="regBtn" type="button" class="btn btn-xs btn-primary pull-right">새
					글 등록</button>
			</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<table width="100%"
					class="table table-striped table-bordered table-hover"
					id="dataTables-example">
					<thead>
						<tr>
							<th>번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>작성일</th>
							<th>수정일</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="board">
							<tr>
								<td>${board.bno }</td>
								<td><a href='/board/get?bno=${board.bno}'>${board.title }</a></td>
								<td>${board.writer }</td>
								<td><fmt:formatDate value="${board.regdate }"
										pattern="yyyy-MM-dd" /></td>
								<td><fmt:formatDate value="${board.updateDate }"
										pattern="yyyy-MM-dd" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<!-- table-responsive -->
				<!-- Modal -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">등록 확인</h4>
							</div>
							<div class="modal-body">처리가 완료되었습니다.</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
								<button type="button" class="btn btn-primary">확인</button>
							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>
				<!-- /.modal -->
			</div>
			<!-- end panel-body -->
		</div>
		<!-- end panel -->
	</div>
	<!-- end col -->
</div>
<!-- end row -->

<%@ include file="../includes/footer.jsp"%>



<script>
	$(document).ready(
			function() {
				var result = '<c:out value="${result}"/>'

				checkModal(result)
				
				history.replaceState({}, null, null);

				function checkModal(result) {
					if (result === '' || history.state)
						return;

					if (parseInt(result) > 0) {
						$(".modal-body").html(
								"게시물 " + parseInt(result) + " 번이 등록되었습니다.")
					}

					$("#myModal").modal("show");

				}

				$("#regBtn").on("click", function() {
					self.location = "/board/register";
				});

			});
</script>
