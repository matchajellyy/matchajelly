<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript">

var bDisplay = false;
function doDisplay(){
	var con = document.getElementById("myDIV");
	if(con.style.display=='none'){
		con.style.display = 'block';
	}else{
		con.style.display = 'none';
	}
}
var bDisplay = true;
function doDisplay2(){
	var con = document.getElementById("myDIV2");
	if(con.style.display=='none'){
		con.style.display = 'block';
	}else{
		con.style.display = 'none';
	}
}
var bDisplay = true;
function doDisplay3(){
	var con = document.getElementById("myDIV3");
	if(con.style.display=='none'){
		con.style.display = 'block';
	}else{
		con.style.display = 'none';
	}
}
var bDisplay = true;
function doDisplay4(){
	var con = document.getElementById("myDIV4");
	if(con.style.display=='none'){
		con.style.display = 'block';
	}else{
		con.style.display = 'none';
	}
}
var bDisplay = true;
function doDisplay5(){
	var con = document.getElementById("myDIV5");
	if(con.style.display=='none'){
		con.style.display = 'block';
	}else{
		con.style.display = 'none';
	}
}
var bDisplay = true;
function doDisplay6(){
	var con = document.getElementById("myDIV6");
	if(con.style.display=='none'){
		con.style.display = 'block';
	}else{
		con.style.display = 'none';
	}
}
var bDisplay = true;
function doDisplay7(){
	var con = document.getElementById("myDIV7");
	if(con.style.display=='none'){
		con.style.display = 'block';
	}else{
		con.style.display = 'none';
	}
}var bDisplay = true;
function doDisplay8(){
	var con = document.getElementById("myDIV8");
	if(con.style.display=='none'){
		con.style.display = 'block';
	}else{
		con.style.display = 'none';
	}
}
</script>


<style>

/* ---------------------- 자유게시판 ---------------------- */
/* 타이틀 */
section.community-header {
	padding: 10px 0 10px;
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
.community-body-content {
	padding: 0;
}

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

.community-body .community-body-content-list .table {
	margin-top: 0px;
}

.community-body .community-body-content-list .board-head th {
	text-align: center;
}

.community-body .community-body-content-list .board-body .board-likeDate
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



/*************************************** 사쿠라 ***************************************/
@-webkit-keyframes fall {
    0% {
        opacity: 0.9;
        top: 0
    }
    100% {
        opacity: 0.2;
        top: 100%
    }
}

@-o-keyframes fall {
    0% {
        opacity: 0.9;
        top: 0
    }
    100% {
        opacity: 0.2;
        top: 100%
    }
}

@-ms-keyframes fall {
    0% {
        opacity: 0.9;
        top: 0
    }
    100% {
        opacity: 0.2;
        top: 100%
    }
}

@-moz-keyframes fall {
    0% {
        opacity: 0.9;
        top: 0
    }
    100% {
        opacity: 0.2;
        top: 100%
    }
}

@keyframes fall {
    0% {
        opacity: 0.9;
        top: 0
    }
    100% {
        opacity: 0.2;
        top: 100%
    }
}

@-webkit-keyframes blow-soft-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -50%
    }
}

@-o-keyframes blow-soft-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -50%
    }
}

@-ms-keyframes blow-soft-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -50%
    }
}

@-moz-keyframes blow-soft-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -50%
    }
}

@keyframes blow-soft-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -50%
    }
}

@-webkit-keyframes blow-medium-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -100%
    }
}

@-o-keyframes blow-medium-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -100%
    }
}

@-ms-keyframes blow-medium-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -100%
    }
}

@-moz-keyframes blow-medium-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -100%
    }
}

@keyframes blow-medium-left {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: -100%
    }
}

@-webkit-keyframes blow-soft-right {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 50%
    }
}

@-o-keyframes blow-soft-right {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 50%
    }
}

@-ms-keyframes blow-soft-right {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 50%
    }
}

@-moz-keyframes blow-soft-right {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 50%
    }
}

@keyframes blow-soft-right {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 50%
    }
}

@-webkit-keyframes blow-medium-right {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 100%
    }
}

@-o-keyframes blow-medium-right {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 100%
    }
}

@-ms-keyframes blow-medium-right {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 100%
    }
}

@-moz-keyframes blow-medium-lerightft {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 100%
    }
}

@keyframes blow-medium-right {
    0% {
        margin-left: 0
    }
    100% {
        margin-left: 100%
    }
}

@-webkit-keyframes sway-0 {
    0% {
        -webkit-transform: rotate(-5deg)
    }
    40% {
        -webkit-transform: rotate(28deg)
    }
    100% {
        -webkit-transform: rotate(3deg)
    }
}

@-o-keyframes sway-0 {
    0% {
        -o-transform: rotate(-5deg)
    }
    40% {
        -o-transform: rotate(28deg)
    }
    100% {
        -o-transform: rotate(3deg)
    }
}

@-ms-keyframes sway-0 {
    0% {
        -ms-transform: rotate(-5deg)
    }
    40% {
        -ms-transform: rotate(28deg)
    }
    100% {
        -ms-transform: rotate(3deg)
    }
}

@-moz-keyframes sway-0 {
    0% {
        -moz-transform: rotate(-5deg)
    }
    40% {
        -moz-transform: rotate(28deg)
    }
    100% {
        -moz-transform: rotate(3deg)
    }
}

@keyframes sway-0 {
    0% {
        transform: rotate(-5deg)
    }
    40% {
        transform: rotate(28deg)
    }
    100% {
        transform: rotate(3deg)
    }
}

@-webkit-keyframes sway-1 {
    0% {
        -webkit-transform: rotate(10deg)
    }
    40% {
        -webkit-transform: rotate(43deg)
    }
    100% {
        -webkit-transform: rotate(15deg)
    }
}

@-o-keyframes sway-1 {
    0% {
        -o-transform: rotate(10deg)
    }
    40% {
        -o-transform: rotate(43deg)
    }
    100% {
        -o-transform: rotate(15deg)
    }
}

@-ms-keyframes sway-1 {
    0% {
        -ms-transform: rotate(10deg)
    }
    40% {
        -ms-transform: rotate(43deg)
    }
    100% {
        -ms-transform: rotate(15deg)
    }
}

@-moz-keyframes sway-1 {
    0% {
        -moz-transform: rotate(10deg)
    }
    40% {
        -moz-transform: rotate(43deg)
    }
    100% {
        -moz-transform: rotate(15deg)
    }
}

@keyframes sway-1 {
    0% {
        transform: rotate(10deg)
    }
    40% {
        transform: rotate(43deg)
    }
    100% {
        transform: rotate(15deg)
    }
}

@-webkit-keyframes sway-2 {
    0% {
        -webkit-transform: rotate(15deg)
    }
    40% {
        -webkit-transform: rotate(56deg)
    }
    100% {
        -webkit-transform: rotate(22deg)
    }
}

@-o-keyframes sway-2 {
    0% {
        -o-transform: rotate(15deg)
    }
    40% {
        -o-transform: rotate(56deg)
    }
    100% {
        -o-transform: rotate(22deg)
    }
}

@-ms-keyframes sway-2 {
    0% {
        -ms-transform: rotate(15deg)
    }
    40% {
        -ms-transform: rotate(56deg)
    }
    100% {
        -ms-transform: rotate(22deg)
    }
}

@-moz-keyframes sway-2 {
    0% {
        -moz-transform: rotate(15deg)
    }
    40% {
        -moz-transform: rotate(56deg)
    }
    100% {
        -moz-transform: rotate(22deg)
    }
}

@keyframes sway-2 {
    0% {
        transform: rotate(15deg)
    }
    40% {
        transform: rotate(56deg)
    }
    100% {
        transform: rotate(22deg)
    }
}

@-webkit-keyframes sway-3 {
    0% {
        -webkit-transform: rotate(25deg)
    }
    40% {
        -webkit-transform: rotate(74deg)
    }
    100% {
        -webkit-transform: rotate(37deg)
    }
}

@-o-keyframes sway-3 {
    0% {
        -o-transform: rotate(25deg)
    }
    40% {
        -o-transform: rotate(74deg)
    }
    100% {
        -o-transform: rotate(37deg)
    }
}

@-ms-keyframes sway-3 {
    0% {
        -ms-transform: rotate(25deg)
    }
    40% {
        -ms-transform: rotate(74deg)
    }
    100% {
        -ms-transform: rotate(37deg)
    }
}

@-moz-keyframes sway-3 {
    0% {
        -moz-transform: rotate(25deg)
    }
    40% {
        -moz-transform: rotate(74deg)
    }
    100% {
        -moz-transform: rotate(37deg)
    }
}

@keyframes sway-3 {
    0% {
        transform: rotate(25deg)
    }
    40% {
        transform: rotate(74deg)
    }
    100% {
        transform: rotate(37deg)
    }
}

@-webkit-keyframes sway-4 {
    0% {
        -webkit-transform: rotate(40deg)
    }
    40% {
        -webkit-transform: rotate(68deg)
    }
    100% {
        -webkit-transform: rotate(25deg)
    }
}

@-o-keyframes sway-4 {
    0% {
        -o-transform: rotate(40deg)
    }
    40% {
        -o-transform: rotate(68deg)
    }
    100% {
        -o-transform: rotate(25deg)
    }
}

@-ms-keyframes sway-4 {
    0% {
        -ms-transform: rotate(40deg)
    }
    40% {
        -ms-transform: rotate(68deg)
    }
    100% {
        -ms-transform: rotate(25deg)
    }
}

@-moz-keyframes sway-4 {
    0% {
        -moz-transform: rotate(40deg)
    }
    40% {
        -moz-transform: rotate(68deg)
    }
    100% {
        -moz-transform: rotate(25deg)
    }
}

@keyframes sway-4 {
    0% {
        transform: rotate(40deg)
    }
    40% {
        transform: rotate(68deg)
    }
    100% {
        transform: rotate(25deg)
    }
}

@-webkit-keyframes sway-5 {
    0% {
        -webkit-transform: rotate(50deg)
    }
    40% {
        -webkit-transform: rotate(78deg)
    }
    100% {
        -webkit-transform: rotate(40deg)
    }
}

@-o-keyframes sway-5 {
    0% {
        -o-transform: rotate(50deg)
    }
    40% {
        -o-transform: rotate(78deg)
    }
    100% {
        -o-transform: rotate(40deg)
    }
}

@-ms-keyframes sway-5 {
    0% {
        -ms-transform: rotate(50deg)
    }
    40% {
        -ms-transform: rotate(78deg)
    }
    100% {
        -ms-transform: rotate(40deg)
    }
}

@-moz-keyframes sway-5 {
    0% {
        -moz-transform: rotate(50deg)
    }
    40% {
        -moz-transform: rotate(78deg)
    }
    100% {
        -moz-transform: rotate(40deg)
    }
}

@keyframes sway-5 {
    0% {
        transform: rotate(50deg)
    }
    40% {
        transform: rotate(78deg)
    }
    100% {
        transform: rotate(40deg)
    }
}

@-webkit-keyframes sway-6 {
    0% {
        -webkit-transform: rotate(65deg)
    }
    40% {
        -webkit-transform: rotate(92deg)
    }
    100% {
        -webkit-transform: rotate(58deg)
    }
}

@-o-keyframes sway-6 {
    0% {
        -o-transform: rotate(65deg)
    }
    40% {
        -o-transform: rotate(92deg)
    }
    100% {
        -o-transform: rotate(58deg)
    }
}

@-ms-keyframes sway-6 {
    0% {
        -ms-transform: rotate(65deg)
    }
    40% {
        -ms-transform: rotate(92deg)
    }
    100% {
        -ms-transform: rotate(58deg)
    }
}

@-moz-keyframes sway-6 {
    0% {
        -moz-transform: rotate(65deg)
    }
    40% {
        -moz-transform: rotate(92deg)
    }
    100% {
        -moz-transform: rotate(58deg)
    }
}

@keyframes sway-6 {
    0% {
        transform: rotate(65deg)
    }
    40% {
        transform: rotate(92deg)
    }
    100% {
        transform: rotate(58deg)
    }
}

@-webkit-keyframes sway-7 {
    0% {
        -webkit-transform: rotate(72deg)
    }
    40% {
        -webkit-transform: rotate(118deg)
    }
    100% {
        -webkit-transform: rotate(68deg)
    }
}

@-o-keyframes sway-7 {
    0% {
        -o-transform: rotate(72deg)
    }
    40% {
        -o-transform: rotate(118deg)
    }
    100% {
        -o-transform: rotate(68deg)
    }
}

@-ms-keyframes sway-7 {
    0% {
        -ms-transform: rotate(72deg)
    }
    40% {
        -ms-transform: rotate(118deg)
    }
    100% {
        -ms-transform: rotate(68deg)
    }
}

@-moz-keyframes sway-7 {
    0% {
        -moz-transform: rotate(72deg)
    }
    40% {
        -moz-transform: rotate(118deg)
    }
    100% {
        -moz-transform: rotate(68deg)
    }
}

@keyframes sway-7 {
    0% {
        transform: rotate(72deg)
    }
    40% {
        transform: rotate(118deg)
    }
    100% {
        transform: rotate(68deg)
    }
}

@-webkit-keyframes sway-8 {
    0% {
        -webkit-transform: rotate(94deg)
    }
    40% {
        -webkit-transform: rotate(136deg)
    }
    100% {
        -webkit-transform: rotate(82deg)
    }
}

@-o-keyframes sway-8 {
    0% {
        -o-transform: rotate(94deg)
    }
    40% {
        -o-transform: rotate(136deg)
    }
    100% {
        -o-transform: rotate(82deg)
    }
}

@-ms-keyframes sway-8 {
    0% {
        -ms-transform: rotate(94deg)
    }
    40% {
        -ms-transform: rotate(136deg)
    }
    100% {
        -ms-transform: rotate(82deg)
    }
}

@-moz-keyframes sway-8 {
    0% {
        -moz-transform: rotate(94deg)
    }
    40% {
        -moz-transform: rotate(136deg)
    }
    100% {
        -moz-transform: rotate(82deg)
    }
}

@keyframes sway-8 {
    0% {
        transform: rotate(94deg)
    }
    40% {
        transform: rotate(136deg)
    }
    100% {
        transform: rotate(82deg)
    }
}

.sakura {
    background: -webkit-linear-gradient(120deg, rgba(255, 183, 197, 0.9), rgba(255, 197, 208, 0.9));
    background: -o-linear-gradient(120deg, rgba(255, 183, 197, 0.9), rgba(255, 197, 208, 0.9));
    background: -ms-linear-gradient(120deg, rgba(255, 183, 197, 0.9), rgba(255, 197, 208, 0.9));
    background: -moz-linear-gradient(120deg, rgba(255, 183, 197, 0.9), rgba(255, 197, 208, 0.9));
    background: linear-gradient(120deg, rgba(255, 183, 197, 0.9), rgba(255, 197, 208, 0.9));
    -webkit-border-radius: 12px 1px;
    -o-border-radius: 12px 1px;
    -ms-border-radius: 12px 1px;
    -moz-border-radius: 12px 1px;
    border-radius: 12px 1px;
    -webkit-pointer-events: none;
    -moz-pointer-events: none;
    -ms-pointer-events: none;
    -o-pointer-events: none;
    pointer-events: none;
    position: absolute
}


</style>





<%@ include file="../include/header.jsp"%>
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

				<div class="community-body-content col-md-10" style="margin-top: -50px">

					<div class="community-body-content-list" >
						<table class="table table-hover">
							<thead class="board-head">
								<tr class="">
									<th style = " font-size:1.5em;  color: #1dc078;">궁금한 점이 있으신가요?<br> 아래의 자주 묻는 질문 FAQ 리스트를 확인 해주세요</th>
								</tr>
							</thead>
							<tbody class="board-body">
								<tr>
									<td><a href="javascript:doDisplay();" style="color:gray">[계정]이메일 계정을 변경하고 싶어요</a>
									<div id="myDIV">
										<p>다른 이메일 주소로 변경하고 싶을 경우 방법은 아래와 같아요. 
											
											1.[대시보드]-[프로필]-[이메일]에서 새로운 이메일 입력
											2. 안내된 인증 절차를 거치면 계정 변경 완료
											
											※ 소셜 계정으로 가입한 경우 로그아웃 상태에서 '비밀번호 찾기'를 통해 비밀번호를 먼저 설정 후 진행해 주셔야 해요.</p>
									</div><td>
								</tr>		
								<tr>
									<td><a href="javascript:doDisplay2();"style="color:gray">[계정]비밀번호를 찿고 싶어요</a>
									<div id="myDIV2">
										<p>로그인 화면에서 '비밀번호 찾기'를 클릭해주세요.
											사용 중인 계정을 입력하면 이메일을 통해 비밀번호 변경 링크를 보내드려요.
											
											※ 혹시, 소셜 계정으로 연동해 사용 중이신가요? (카카오톡/페이스북/구글/깃허브/애플)
											소셜 계정의 경우 D.C.T에서는 여러분의 비밀번호를 보관하고 있지 않아요.
											D.C.T에서 사용하는 별도의 비밀번호를 생성하고 싶으시다면 프로필 설정에서 새로운 비밀번호를 발급받아주세요.
											
											※ 소셜 계정으로 가입한 경우 로그아웃 상태에서 '비밀번호 찾기'를 통해 비밀번호를 먼저 설정 후 진행해 주셔야 해요.</p>
									</div><td>
								</tr>								
								<tr>
									<td><a href="javascript:doDisplay3();"style="color:gray">[강의]동시 접속이 가능한가요?</a>
									<div id="myDIV3">
										<p>수강 중 동시 접속은 제한하고 있어요.
											즉, 학습페이지는 1대에서만 접속할 수 있으며 다른 곳에서 동시 학습할 경우 학습이 제한될 수 있어요.
											해당 내용은 이용약관에 동시 접속 부정이용에 대하여 명시하였기에 법적 제재를 받으실 수 있는 점 참고해 주세요.</p>
									</div><td>
								</tr>
								<tr>
									<td><a href="javascript:doDisplay4();"style="color:gray">[강의]진도율을 초기화 할수 있나요?</a>
									<div id="myDIV4">
										<p>진도율은 환불 및 수료증 발급과 밀접하게 관련된 정보로 초기화 기능이 제공되지 않아요.

											※ 혹시 이미 완강한 강의를 복습하고 계신가요?
											재수강 진도율 체크가 불편할 땐 '강의 노트 기능'을 사용해보세요. 언제, 어디까지 강의를 들었는지 메모할 수 있어요.</p>
									</div><td>
								</tr>
								<tr>
									<td><a href="javascript:doDisplay5();"style="color:gray">[계정]구매했던 강의가 전부 사라졌어요.</a>
									<div  id="myDIV5">
										<p>D.C.T은 여러 개의 계정을 동시에 사용할 수 있어요. 소유하신 다른 계정이 있다면 확인 부탁드려요.
											
											※ 혹시 다른 계정 확인 후에도 구매한 강의를 찾지 못하셨나요?
											우측 하단의 1:1 문의하기로 내용 남겨주시면 확인 후 계정을 찾아드릴게요 :-)</p>
									</div><td>
								</tr>
								<tr>
									<td><a href="javascript:doDisplay6();"style="color:gray">[결제]강의를 환불하고 싶어요.</a>
									<div  id="myDIV6">
										<p>수강 신청한 유료강의를 환불하고 싶으신가요?
										프로필 > 구매내역에서 환불을 원하는 '주문명'를 클릭하시면 직접 환불하실 수 있어요. 단, 환불 조건에 부합하지 않는 경우 취소 버튼이 비활성화되니 참고해 주세요!
										
										D.C.T의 환불 원칙은 다음과 같습니다.
										1) 강의 구매일 1주 이내에 진도율 7% 미만일 경우 전액 환불이 가능합니다.
										2) 강의 구매일이 1주일이 넘었거나, 진도율이 7% 이상일 경우 환불이 불가합니다.
										3) 1강으로 구성된 개별강의는 원칙적으로 환불이 불가능 합니다.
										4) 강의 자료를 다운로드 받는 경우, 환불이 불가합니다.
										5) 특별강의는 이벤트성 강의, 비정규 강의, 특별기획 강의 등으로서 이는 별도의 수강 취소, 변경 및 환불규정이 적용될 수 있습니다.
										
										※ 더 자세한 내용은 이용약관 제20조 청약철회에서 확인하실 수 있어요.</p>
									</div><td>
								</tr>
								<tr>
									<td><a href="javascript:doDisplay7();"style="color:gray">[결제]할인과 쿠폰은 중복적용이 가능한가요?</a>
									<div  id="myDIV7">
										<p>모든 할인 및 쿠폰은 하나만 적용이 가능해요.
											할인 중인 강의라면 강의 할인이 우선 적용되어 쿠폰 적용이 안되는 점 참고해 주세요.
											더욱 자세한 쿠폰 & 할인 이용 안내는 쿠폰함 우측 상단에서 확인해 주세요.</p>
									</div><td>
								</tr>
								<tr>
									<td><a href="javascript:doDisplay8();"style="color:gray">[멘토링]멘토링 서비스가 궁금해요.</a>
									<div  id="myDIV8">
										<p>D.C.T 멘토링은 멘토와 멘티를 연결해 약속을 잡아주는 기능이에요.
											커리어 상담부터 코드, 포트폴리오 리뷰까지 멘토가 필요할 땐 D.C.T 멘토링을 이용해 보세요. 지식공유자와 학습자가 더 쉽게 지식을 나누며 성장할 수 있답니다.</p>
									</div><td>
								</tr>
								

							</tbody>
						</table>
					</div>




				</div>
			</div>
		</div>
	</section>

</div>

<%@ include file="../include/footer.jsp"%>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script>

$(window).load(function() {
	$('body').sakura();
});

(function ($) {
    // requestAnimationFrame Polyfill
    (function () {
        var lastTime = 0;
        var vendors = ['ms', 'moz', 'webkit', 'o'];

        for (var x = 0; x < vendors.length && !window.requestAnimationFrame; ++x) {
            window.requestAnimationFrame = window[vendors[x] + 'RequestAnimationFrame'];
            window.cancelAnimationFrame = window[vendors[x] + 'CancelAnimationFrame'] || window[vendors[x] + 'CancelRequestAnimationFrame'];
        }

        if (!window.requestAnimationFrame)
            window.requestAnimationFrame = function (callback, element) {
                var currTime = new Date().getTime();
                var timeToCall = Math.max(0, 16 - (currTime - lastTime));
                var id = window.setTimeout(function () {
                        callback(currTime + timeToCall);
                    },
                    timeToCall);
                lastTime = currTime + timeToCall;

                return id;
            };

        if (!window.cancelAnimationFrame)
            window.cancelAnimationFrame = function (id) {
                clearTimeout(id);
            };
    }());

    // Sakura function.
    $.fn.sakura = function (options) {
        // We rely on these random values a lot, so define a helper function for it.
        function getRandomInt(min, max) {
            return Math.floor(Math.random() * (max - min + 1)) + min;
        }

        // Helper function to attach cross-browser events to an element.
        var prefixes = ['moz', 'ms', 'o', 'webkit', ''];
        var prefCount = prefixes.length;

        function prefixedEvent(element, type, callback) {
            for (var i = 0; i < prefCount; i++) {
                if (!prefixes[i]) {
                    type = type.toLowerCase();
                }

                element.get(0).addEventListener(prefixes[i] + type, callback, false);
            }
        }

        // Defaults for the option object, which gets extended below.
        var defaults = {
            blowAnimations: ['blow-soft-left', 'blow-medium-left', 'blow-hard-left', 'blow-soft-right', 'blow-medium-right', 'blow-hard-right'],
            className: 'sakura',
            fallSpeed: 0.4,
            maxSize: 14,
            minSize: 9,
            newOn: 300,
            swayAnimations: ['sway-0', 'sway-1', 'sway-2', 'sway-3', 'sway-4', 'sway-5', 'sway-6', 'sway-7', 'sway-8']
        };

        var options = $.extend({}, defaults, options);

        // Declarations.
        var documentHeight = $(document).height();
        var documentWidth = $(document).width();
        var sakura = $('<div class="' + options.className + '" />');

        // Set the overflow-x CSS property on the body to prevent horizontal scrollbars.
        $('body').css({ 'overflow-x': 'hidden' });

        // Function that inserts new petals into the document.
        var petalCreator = function () {
            setTimeout(function () {
                requestAnimationFrame(petalCreator);
            }, options.newOn);

            // Get one random animation of each type and randomize fall time of the petals.
            var blowAnimation = options.blowAnimations[Math.floor(Math.random() * options.blowAnimations.length)];
            var swayAnimation = options.swayAnimations[Math.floor(Math.random() * options.swayAnimations.length)];
            var fallTime = (Math.round(documentHeight * 0.007) + Math.random() * 5) * options.fallSpeed;

            var animations = 'fall ' + fallTime + 's linear 0s 1' + ', ' +
                blowAnimation + ' ' + (((fallTime > 30 ? fallTime : 30) - 20) + getRandomInt(0, 20)) + 's linear 0s infinite' + ', ' +
                swayAnimation + ' ' + getRandomInt(2, 4) + 's linear 0s infinite';
            var petal = sakura.clone();
            var size = getRandomInt(options.minSize, options.maxSize);
            var startPosLeft = Math.random() * documentWidth - 100;
            var startPosTop = -((Math.random() * 20) + 15);

            // Apply Event Listener to remove petals that reach the bottom of the page.
            prefixedEvent(petal, 'AnimationEnd', function () {
                $(this).remove();
            });

            // Apply Event Listener to remove petals that finish their horizontal float animation.
            prefixedEvent(petal, 'AnimationIteration', function (ev) {
                if ($.inArray(ev.animationName, options.blowAnimations) != -1) {
                    $(this).remove();
                }
            });

            petal
                .css({
                    '-webkit-animation': animations,
                    '-o-animation': animations,
                    '-ms-animation': animations,
                    '-moz-animation': animations,
                    animation: animations,
                    height: size,
                    left: startPosLeft,
                    'margin-top': startPosTop,
                    width: size
                })
                .appendTo('body');
        };


        // Recalculate documentHeight and documentWidth on browser resize.
        $(window).resize(function () {
            documentHeight = $(document).height();
            documentWidth = $(document).width();
        });

        // Finally: Start adding petals.
        requestAnimationFrame(petalCreator);
    };
}(jQuery));

</script>