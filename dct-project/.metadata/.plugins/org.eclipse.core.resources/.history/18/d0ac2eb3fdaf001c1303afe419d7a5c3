<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../include/header.jsp"%>

<style>

/* ---------------------- 공지사항 ---------------------- */
section.community-header {
	padding: 10px 0 10px;
}


/* ---------- */
.community-body-content {
	padding: 0;
	float: right;
	margin-top: -40px;
}

.community-body .search-text {
	margin-top: 40px;
	display: block;
	margin-right: 8px;
}

.community-body .search-text .form-group {
	margin: 0;
	display: flex;
}

.community-body .community-body-write .write {
	padding: 10ㅔㅌ;
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
					<h3>공지사항</h3>
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
					<div class="community-body-content-list">
						<table class="table table-hover">
							<thead class="board-head">
								<tr class="active">
									<th class="col-md-10">제목</th>
									<th class="col-md-2">날짜</th>
								</tr>
							</thead>
							<tbody class="board-body">
								<tr>
									<td>
										<a href="#"> [장애 발생 공지]🚨 2022년 3월 31일 서비스 오류 </a>
									</td>
									<td>2022.03.31</td>
								</tr>
								<tr>
									<td>
										<a href="#"> [새소식] D.C.T에서 이벤트를 합니다. 🎁</a>
									</td>
									<td>2022.03.30</td>
								</tr>
								<tr>
									<td>
										<a href="#"> [이벤트] 신규 회원가입 유저들에게 절호의 기회!! 😺 </a>
									</td>
									<td>2022.03.29</td>
								</tr>
								<tr>
									<td>
										<a href="#"> [업데이트 소식] 다양한 업데이트가 진행 되었습니다. 🎉🎉</a>
									</td>
									<td>2022.03.28</td>
								</tr>
								<tr>
									<td>
										<a href="#"> [공지] 코로나 상황에 대하여 공지 드립니다. </a>
									</td>
									<td>2022.03.26</td>
								</tr> 
								<tr>
									<td>
										<a href="#"> [공지]🚨 개인정보 취급방침 개정 안내 </a>
									</td>
									<td>2022.03.26</td>
								</tr>
								<tr>
									<td>
										<a href="#"> [공지] 서비스 이용약관 변경 안내 </a>
									</td>
									<td>2022.03.25</td>
								</tr>
							</tbody>
						</table>
					</div>


					<nav class="pagination-list">
						<form action="<c:url value='/notice/noticeList' />"
							name="pageForm">
							<div>
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
	</section>

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
