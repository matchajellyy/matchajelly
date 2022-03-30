<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ include file="../include/header.jsp"%>

<style>

/* ---------------------- 멘토링 ---------------------- */
/* 타이틀 */
section.community-header {
	color: aliceblue;
	font-size: 30px;
	background-color: rgb(61, 58, 58);
	padding: 1em 0;
}
/* ---------- */

/* 메뉴 */
section.community-body nav.community-body-nav ul h6 {
	color: purple;
	font-size: 16px;
	margin: 40px 0;
}

section.community-body nav.community-body-nav ul li {
	margin: 20px 0;
}

section.community-body nav.community-body-nav ul li span {
	color: plum;
	font-size: 20px;
}
/* ---------- */
.community-body .search-text {
	margin-top: 40px;
}

.community-body .search-text .form-group {
	margin: 0;
}

.community-body .community-body-write .write {
	padding: 0;
	text-align: right;
}

.mentoring-search {
	padding: 0;
}

div.mentoring {
	border: 1px rgb(216, 191, 191) solid;
	margin-top: 10px;
	padding: 10px;
}

ul.mentoring-body>li {
	padding: 10px;
}

ul.mentoring-body .prod-list-inner {
	border: 1px rgb(216, 191, 191) solid;
	padding: 10px;
}

section.mentoring-bottom .pagination-list {
	text-align: center;
}

div.prod-list-inner {
	height: 250px;
	box-sizing: border-box;
}

div.price {
	margin-top: 60px;
}

div.prod-info {
	overflow: hidden;
	text-overflow: ellipsis;
	display: -webkit-box;
	-webkit-line-clamp: 2;
	-webkit-box-orient: vertical;
	word-wrap: break-word;
	line-height: 1.2em;
	height: 2.4em; 
}

div.prod-writer {
	color: #adb5bd;
	margin-top: 0.25rem;
    font-size: .875rem;
}

#modal-outer {
	transform: translate(0, -150px);
}

div.modal-title {
    font-size: 16px;
    background: #f5f5f5;
    border-radius: 5px;
    margin: 15px 0;
    font-weight: 700;
    padding: 10px;
}

#modalCon {
	width: 500px;
	height: 650px;
}

#content-body {
	height: 320px;
	margin-top: 0px;
	overflow: auto;
	text-align: left;
	padding: 30px
}

.modal-apply-info {
    font-size: 15px;
    text-align: left;
    margin-bottom: 20px;
}

.modal-apply-btn {
	margin-right: 20px;
}

</style>

<div id="wrapper">

	<section class="community-header">
		<div class="container">
			<div class="row">
				<div class=" col-md-12">
					<h2>멘토링</h2>
				</div>
			</div>
		</div>
	</section>

	<section class="community-body">
		<div class="container">
			<div class="row">
				<nav class="community-body-nav col-md-2">
					<ul class="">
						<h6 class="">Dreams Come True</h6>
						<li class=""><a href="#"><span>공지사항</span></a></li>
						<li class=""><a href="#"><span>사이트 소개</span></a></li>
					</ul>
					<ul class="">
						<h6 class="">커뮤니티</h6>
						<li class=""><a href="#"><span>질문 &amp; 답변</span></a></li>
						<li class=""><a href="#"><span>자유게시판</span></a></li>
					</ul>
					<ul class="">
						<h6 class="">후기</h6>
						<li class=""><a href="#"><span>수강평</span></a></li>
						<li class=""><a href="#"><span>멘토링 후기</span></a></li>
					</ul>
				</nav>

				<div class="mentoring-search col-md-10">
					<div class="search-text">
						<form action="#">
							<div class="col-md-2"></div>
							<div class="form-group col-md-2">
								<select id="condition" class="form-control" name="condition">
									<option value="title"
										${param.condition=='title' ? 'selected' : '' }>제목</option>
									<option value="content"
										${param.condition=='content' ? 'selected' : '' }>내용</option>
									<option value="writer"
										${param.condition=='writer' ? 'selected' : '' }>작성자</option>
									<option value="titleContent"
										${param.condition=='titleContent' ? 'selected' : ''
											}>제목+내용</option>
								</select>
							</div>
							<div class="form-group col-md-4">
								<div class="input-group">
									<input type="text" class="form-control" name="keyword"
										id="keywordInput" placeholder="검색어" value=""> <span
										class="input-group-btn"> <input type="submit"
										value="검색" class="btn btn-cpp btn-flat" id="searchBtn">
									</span>
								</div>
							</div>
							<div class="col-md-2"></div>
							<div class="col-md-2"></div>
						</form>
					</div>

					<div class="community-body-write">
						<form action="#">
							<div class="col-md-10"></div>
							<div class="write col-md-2">
								<a class="btn btn-success" href="<c:url value="/mentor/mentoringWrite" />" role="button">글쓰기</a>
							</div>
						</form>
					</div>
				</div>

				<div class="mentoring col-md-10">
					<ul class="mentoring-body clearfix">
						<c:forEach var="vo" items="${mentoringList}">
							<li class="col-md-3">
								<div class="prod-list-inner">
									<div class="prod-content">
										<div class="prod-info">
											<span>${vo.mentoringTitle}</span>
										</div>
										<div class="prod-writer">
											<p>by. ${vo.userName}</p>
										</div>
									</div>
									<div class="price">
										<strong><fmt:formatNumber value="${vo.mentoringPrice}" pattern="#,###" />원</strong>
									</div>
									<div class="prod-footer">
										<a class="btn btn-info btn-modal"  href="${vo.mentoringNo}" data-toggle="modal" data-target="#contentModal">내용보기</a>
									</div>
								</div>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</section>



	<section class="mentoring-bottom">
		<div class="container">
			<div class="row">
				<div class="col-md-2"></div>
				<nav class="col-md-10 pagination-list">
					<ul class="pagination">
						<li><a href="#">이전</a></li>
						<li class="active"><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">다음</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</section>
	
	
	<!-- 내용보기 모달 준비 -->
	
	<!-- Modal -->
	<div class="modal fade" id="contentModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
	  <div class="modal-dialog" id="modal-outer">
	    <div class="modal-content" id="modalCon">
	      <div class="modal-header" style="border: none; padding: 30px">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h3 class="modal-title" id="myModalLabel">멘토링 소개</h3>
	        
	        <div class="modal-title" id="content-title">
	        	제목이 들어갈 공간입니다. 제목제목제목이에요.
	        </div>
	        
	      </div>
	      <div class="modal-body" id="content-body">
	        
	      </div>
	      <div class="modal-footer">
	        <div class="modal-apply-info">
	        	지금 <span></span>원에 멘토링 기회를 잡아보세요! 
	        </div>
	        <div class="modal-apply-btn">
	        	<button type="button" class="btn btn-primary">신청하기</button>
	        </div>
	        
	      </div>
	    </div>
	  </div>
	</div>
	
	
	

	<%@ include file="../include/footer.jsp"%>

</div>

<script>


	$('.prod-footer').on('click', 'a', function(e) {
		e.preventDefault();
		const mentoringNo = $(this).attr('href');
		console.log('href: ' + mentoringNo);
		
		$.ajax({
			type: 'get',
			url: '<c:url value="/mentor/mentoringModal/" />' + mentoringNo,
			success: function(data) {
				$('#content-title').text(data.mentoringTitle);
				$('#content-body').html(data.mentoringContent);
				$('.modal-apply-info span').text(data.mentoringPrice.toLocaleString('ko-KR'));
				$('.modal-apply-btn button').val(data.mentoringNo);
			},
			fail: function() {
				console.log('통신 실패!');
			}	
		});
	});
	
	$('.modal-apply-btn button').click(function() {
		const number = $(this).val();
		location.href='<c:url value="/mentor/mentoringDetail?mentoringNo=" />' + number;
	});
	


</script>















