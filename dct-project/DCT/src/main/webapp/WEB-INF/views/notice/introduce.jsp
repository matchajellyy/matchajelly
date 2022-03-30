<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



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
	margin-top: -40px;
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
	margin-top: 120px;
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
					<h3>사이트 소개</h3>
				</div>
			</div>
		</div>
	</section>


	<section class="community-body">
		<div class="container">
			<div class="row">
				<div class="col-md-2">
					<div class="aside_menu">
						<aside class="sidebar_left">
							<div class="menu_container">
								<p class="menu-label">공지사항</p>
								<ul class="menu-list">
									<li><a class="btn_wrap "
										href="<c:url value='/notice/noticeList' />"> <span>공지사항</span>
									</a></li>
									<li><a class="btn_wrap "
										href="<c:url value='/notice/introduce' />"> <span>사이트
												소개</span>
									</a></li>
								</ul>
								<p class="menu-label">강의</p>
								<ul class="menu-list">
									<li><a class="btn_wrap "
										href="<c:url value='/lecture/lecturePage' />"> <span>전체
												강의</span>
									</a></li>
									<li><a class="btn_wrap "
										href="<c:url value='/lecture/lectureEva' />"> <span>수강평</span>
									</a></li>
								</ul>
								<p class="menu-label">커뮤니티</p>
								<ul class="menu-list">
									<li><a class="btn_wrap "
										href="<c:url value='/board/freeBoardList' />"> <span>자유게시판</span>
									</a></li>
									<li><a class="btn_wrap "
										href="<c:url value='/notice/frequentqna' />"> <span>자주
												묻는 질문</span>
									</a></li>
								</ul>
							</div>
						</aside>
					</div>
				</div>
				<div class="col-md-10" style="margin-top: -70px">
					<p style="font-size: 35px; margin-top: 40px;">우리는 때로 무언가를 배워야 합니다</p>
				</div> 
				<div class="col-md-2" style="padding: -20px"></div>
				<div class="col-md-10">
					<p>
						꿈을 이루기 위해서, 하고 싶은걸 해나가기 위해선 그 분야에 대한 배움이 가장 기본적인 요소이기 때문입니다. 하지만,
						모두에게 배우기 좋은 환경이 보장 되진 않죠.<br> <br> 너무 비싸서, 거리가 멀어서.. 여러
						이유로 당연하다고 생각되어 지는것들이 어떤 누군가에게는 사치가 되기도 합니다. 그런 현실에 도전하려 합니다. D.C.T은
						누구나, 경제적으로 시간적 제약없이 내가 원하는 것을 배우고, 지식을 나눌 수 있는 공간입니다.
					</p>
				</div>
				<div class="col-md-2"></div>
				<div class="col-md-10">
					<p style="font-size: 35px;">우리의 약속</p>
				</div>
				<div class="col-md-2"></div>
				<div class="col-md-10"> 
					<p>
					<h4 style="font-weight: bold">전문성</h4>
					수년~십수년씩 커리어를 쌓고 노력해온 지식공유자들이 지식과 노하우를 공유합니다. 당장 좋은 사수가 없거나, 교육을 받지
					못하더라도 걱정하지 마세요.<br> D.C.T에서 전문가들에게서 지식과 노하우를 배울 수 있습니다.<br>


					<br>
					<h4 style="font-weight: bold">올바름에 대한 추구</h4>
					D.C.T은 눈앞의 돈을 쫓기 보다는 옳은 방향을 찾기위해 노력합니다. D.C.T은 다른 곳들과는 달리 수강생수, 강의평가 등을
					조작이나 선별 없이 공개합니다.<br> 이는 학습자들이 더 좋은 경험을 스스로 찾아서 하게 만들고, 지식공유자가
					더 좋은 학습 콘텐츠를 만들 수 있도록 도와준다고 생각합니다. 학습자, 지식공유자 모두에게 장기적으로 도움이 되는
					생태계를 만들기 위해 노력합니다.<br> <br>
					<h4 style="font-weight: bold">다양성과 경제성</h4>
					학교에서 배우기 어렵거나, 큰 비용을 지불해야만 배울 수 있는 전문적인 지식들을 제공합니다.<br> 우리의 삶은
					다양하고, 그만큼 다양한 꿈을 꿀 수 있습니다.<br> D.C.T은 다양한 꿈을 이룰 수 있는 폭 넓고 깊은 지식을
					전달하려 노력하겠습니다.<br> 오픈 플랫폼의 이점을 통해 다양성과 경제성을 모두 높입니다.<br> <br>
					<h4 style="font-weight: bold">마케팅보다 좋은 콘텐츠에</h4>
					마케팅보다는 좋은 콘텐츠에 집중합니다.<br> 좋지 않은 콘텐츠라도 홍보와 포장을 통해 이윤을 남길 수 있지만,
					우리는 콘텐츠에 집중합니다.<br> 좋은 콘텐츠를 통해 자연스럽게 알려지고, 소개하게 되어 모두 함께 성장하는
					공간을 만들겠습니다.
					</p>

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