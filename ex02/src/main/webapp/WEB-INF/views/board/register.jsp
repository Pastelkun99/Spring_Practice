<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../includes/header.jsp"%>
<!-- ../는 현재 경로에서 한 단계 상위로 올라가겠다는 말 -->


<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">글 등록</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading"></div>
			<!-- panel 제목 -->
			<div class="panel-body">
				<!-- 본문내용 -->
				<form action="/board/register" role="form" method="post">
					<div class="form-group">
						<label>제목</label> <input class="form-control" name="title">
					</div>
					<div class="form-group">
						<label>내용</label>
						<textarea class="form-control" rows="3" name="content"></textarea>
					</div>
					<div class="form-group">
						<label>작성자</label> <input class="form-control" name="writer">
					</div>
					<button type="submit" class="btn btn-default">등록</button>
					<button type="reset" class="btn btn-default">취소</button>
					<button type="button" class="btn btn-danger" onclick="location.href='list'">이전으로</button>
				</form>
			</div>
			<!-- end panel-body -->

		</div>
		<!-- end panel -->
	</div>
	<!-- end col -->
</div>
<!-- end row -->

<%@ include file="../includes/footer.jsp"%>

