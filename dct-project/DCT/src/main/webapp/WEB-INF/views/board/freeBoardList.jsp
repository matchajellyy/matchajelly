<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../include/header.jsp"%>

<style>

}
/* ---------- */

section.community-header {
	padding: 10px 0 10px;
}
.community-body-content {
	padding: 0;
	float: right;
	margin-top: -40px;
}

.community-body-content .search-text {
	margin-top: 40px;
	display: block;
	margin-right: 8px;
}

.community-body .search-text .form-group {
	margin: 0;
	display: flex;
}

.community-body .community-body-write .write {
	padding: 10px;
	text-align: right;
}

.community-body .community-body-content-list .table {
	margin-top: 120px;
}

.community-body .community-body-content-list .board-head th {
	text-align: center;
}

.community-body .community-body-content-list .board-body .board-viewDate
	{
	text-align: center;
}

.community-body .community-body-content .pagination-list {
	text-align: center;
}

.container .columns{
	display: flex;
}

.container .columns .col-md-3{
	display: inline;
}

/* 글쓰기 */
.community-body-write{
	display: inline;
}

/*aside*/
.aside_menu {
    float: left;
}

.aside_menu p{
    font-size: 18px;
}

.aside_menu .menu-list .btn_wrap {
	font-size: 15px;
	color: #757575;
}

.aside_menu .menu-list a:hover, .aside_menu .menu-list a:focus {
 color: #000;
 background: #f2f2f2;
 text-decoration: none;
}

.menu-label {
	margin: 1px;
}

</style>

<div id="wrapper">

	<section class="community-header">
		<div class="container">
			<div class="row">
				<div class=" col-md-12">
					<h3>자유게시판</h3>
				</div>
			</div>
		</div>
	</section>

            <div class="container">
                <div class="columns">
                    <div class="col-md-2">
                        <div class="aside_menu">
                            <aside class="sidebar_left">
                                <div class="menu_container">
                                    <p class="menu-label">공지사항</p>
                                    <ul class="menu-list">
                                        <li>
                                            <a class="btn_wrap " href="<c:url value='/notice/noticeList' />">
                                                <span>공지사항</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a class="btn_wrap " href="<c:url value='/notice/introduce' />">
                                                <span>사이트 소개</span>
                                            </a>
                                        </li>
                                    </ul>
                                    <p class="menu-label">강의</p>
                                    <ul class="menu-list">
                                        <li>
                                            <a class="btn_wrap " href="<c:url value='/lecture/lecturePage' />">
                                                <span>전체 강의</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a class="btn_wrap " href="<c:url value='/lecture/lectureEva' />">
                                                <span>수강평</span>
                                            </a>
                                        </li>
                                    </ul>
                                    <p class="menu-label">커뮤니티</p>
                                    <ul class="menu-list">
                                        <li>
                                            <a class="btn_wrap " href="<c:url value='/board/freeBoardList' />">
                                                <span>자유게시판</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a class="btn_wrap " href="<c:url value='/notice/frequentqna' />">
                                                <span>자주 묻는 질문</span>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </aside>
                        </div>
                    </div>


				<div class="community-body-content col-md-10">
					<div class="search-text">
						<form action="<c:url value='/board/freeBoardList' />">
							<div class="col-md-5"></div>
							<div class="form-group col-md-2">
								<select id="condition" class="form-control" name="condition">
									<option value="title"
										${pc.paging.condition == 'title' ? 'selected' : ''}>제목</option>
									<option value="content"
										${pc.paging.condition == 'content' ? 'selected' : ''}>내용</option>
									<option value="writer"
										${pc.paging.condition == 'writer' ? 'selected' : ''}>작성자</option>
									<option value="titleContent"
										${pc.paging.condition == 'titleContent' ? 'selected' : ''}>제목+내용</option>
								</select>
							</div>
							<div class="form-group col-md-4">
								<div class="input-group">
									<input type="text" class="form-control" name="keyword"
										value="${pc.paging.keyword}">
										<span class="input-group-btn">
										<button type="submit" class="btn btn-cpp btn-flat">검색</button>
									</span>
								</div>
							</div>
						</form>
					</div>

					<div class="community-body-write">
						<form action="#">
							<div class="write col-md-1">
								<button type="button" class="btn btn-success" onclick="location.href='<c:url value="/board/freeBoardRegist" />'" style="background:#424242; border:1px solid #fff; font-size: 14px;">글쓰기</button>
							</div>
						</form>
					</div>

					<div class="community-body-content-list">
						<table class="table table-hover">
							<thead class="board-head">
								<tr class="active">
									<th class="col-md-6">제목</th>
									<th class="col-md-2">글쓴이</th>
									<th class="col-md-2">날짜</th>
								</tr>
							</thead>
							<tbody class="board-body">
								<c:forEach var="vo" items="${boardList}">
	                                <tr>
	                                    <td>
	                                    	<a href="<c:url value='/board/freeBoardDetail?communityNo=${vo.communityNo}&pageNum=${pc.paging.pageNum}&keyword=${pc.paging.keyword}&condition=${pc.paging.condition}' />">
                                            ${vo.communityTitle}
                                            </a>
	                                    </td>
	                                    <td>${vo.userName}</td>
	                                    <td><fmt:formatDate value="${vo.communityCreateDate}" pattern="yy-MM-dd HH:mm" /> </td>
	                                </tr>
                                </c:forEach>
							</tbody>
						</table>
					</div>


					<nav class="pagination-list">
						<form action="<c:url value='/board/freeBoardList' />" name="pageForm">
							<div style="text-align: center;">
								<hr>
								<ul class="pagination" id="pagination">
									<c:if test="${pc.prev}">
										<li><a href="#" data-pageNum="${pc.beginPage-1}">이전</a></li>
									</c:if>

									<c:forEach var="num" begin="${pc.beginPage}"
										end="${pc.endPage}">
										<li class="${pc.paging.pageNum == num ? 'active' : ''}"><a
											href="#" data-pageNum="${num}">${num}</a></li>
									</c:forEach>

									<c:if test="${pc.next}">
										<li><a href="#" data-pageNum="${pc.endPage+1}">다음</a></li>
									</c:if>
								</ul>

								<!-- 페이지 관련 버튼을 클릭 시 같이 숨겨서 보낼 값 -->
								<input type="hidden" name="pageNum" value="${pc.paging.pageNum}">
								<input type="hidden" name="countPerPage"
									value="${pc.paging.countPerPage}"> <input type="hidden"
									name="keyword" value="${pc.paging.keyword}"> <input
									type="hidden" name="condition" value="${pc.paging.condition}">
							</div>
						</form>
					</nav>
				</div>
			</div>
         </div>


	<%@ include file="../include/footer.jsp"%>

</div>

<script>
	const msg = '${msg}';
	if (msg !== '') {
		alert(msg);
	}

	//사용자가 페이지 관련 버튼을 클릭했을 때, 기존에는 각각의 a태그의 href에 
	//각각 다른 url을 작성해서 요청을 보내줬다면, 이번에는 클릭한 그 버튼에 맞는 페이지 정보를
	//자바스크립트를 이용하여 끌고 와서 요청을 보내 주겠습니다.
	/*
	const pagination = document.getElementById('pagination');
	pagination.onclick = function(e) {
		e.preventDefault(); //버튼의 고유이벤트 속성 중지.
		
		//현재 이벤트가 발생한 요소(버튼)의
		//data-pageNum의 값을 얻어서 변수에 저장.
		const value = e.target.dataset.pagenum;
		
		//페이지 버튼들을 감싸고 있는 form태그를 name으로 지목하여
		//그 안에 있는 pageNum이라는 input태그의 value에
		//위에서 얻은 data-pageNum의 값을 삽입 후 submit
		document.pageForm.pageNum.value = value;
		document.pageForm.submit();
	}
	 */

	$(function() {
		$('#pagination').on('click', 'a', function(e) {
			e.preventDefault();
			console.log($(this));
			const value = $(this).data('pagenum');
			console.log(value);
			document.pageForm.pageNum.value = value;
			document.pageForm.submit();
		});
	});
</script>
