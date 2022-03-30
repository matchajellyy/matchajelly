<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ include file="../include/header.jsp" %>


<style>

/* ========== lec-detail ========== */
.detail-info {
	margin-bottom: 120px;
}
.detail-info .detail-title {
	font-size: 24px;
}
.detail-info .detail-price {
	font-size: 30px;
	border-top: 1px solid #ddd;
	border-bottom: 1px solid #ddd;
	padding: 10px 0;
}

.detail-star{
	color: orange;
	font-size: xx-large;
}
.star-empty {
	color: #eee;
	font-size: xx-large;
}

.detail-info .detail-delivery {
	color: #888;
}

.detail-control .left {
	float: left;
}
.detail-control .right {
	float: right;
}
.detail-control .detail-total-price .total-left {
	font-size: 18px;
	line-height: 45px;
}
.detail-control .detail-total-price .total-right {
	font-size: 30px;
}


.detail-control .detail-order .left,
.detail-control .detail-order .right {
	width: 50%;
	height: 60px;
	font-size: 18px;
}

/* ========== content ==========*/
.detail-reply .detail-content-wrap {
	margin: 0 auto;
	float: none;
}

.detail-content-wrap #content {
	resize: none;
}


/* ========== 댓글 ========== */
.detail-reply-wrap {
	background: #f5f5f5;
	padding: 15px;
	border: 1px solid #ddd;
	position: relative;
	width: 877.5px;
	margin-left: -15.2px;
}

.detail-reply-wrap .detail-reply-image {
	position: absolute;
	left: 15px;
	top: 15px;
}

.detail-reply-wrap .detail-reply-content {
	padding-left: 60px;
}

.detail-reply-content textarea {
	resize: none;
	width: 100%;
	margin-bottom: 10px;
}

.detail-reply-input > .form-control {
	width: 200px;
	margin-bottom: 5px;
}

.detail-reply-input {
	float: left;
}

.detail-reply-group button {
	float: right;
}

.detail-reply-group small {
	margin-left: 10px;
	height: 20px;
	line-height: 20px;
}

.detail-reply-group a {
	text-decoration: none;
	color: #777;
	float: right;
}

.reply-star-point{
	background: #f5f5f5;
	float: left;
	width: 277.5px;
	height: 167.5px;
	padding-top: 15px;
	text-align: center;
	border: 1px solid #ddd;
	margin: 0 auto;
	position: relative;
	
}

  .star {
    position: relative;
    font-size: 2rem;
    color: #ddd;
  }
  
  .star input {
    width: 100%;
    height: 100%;
    position: absolute;
    left: 0;
    opacity: 0;
    cursor: pointer;
  }
  
  .star span {
    width: 0;
    position: absolute; 
    left: 0;
    color: orange;
    overflow: hidden;
    pointer-events: none;
  }
  .star input[type="range"] {
  	display: inline;
  }


.reply-star {
	color: orange;
	font-size: large;
	
}

.reply-star-graph{
	background: #f5f5f5;
	padding-top: 15px;
	border: 1px solid #ddd;
	padding-right: 0;
	width: 600px;
	position: relative;

}

#graph-point{
	float: left;
	margin-right: 10px;
	
}

#graph {
	margin-bottom: 10px;
}

.reply-star-graph > .progress > .progress-bar {
	height: 10px;
	float: left;
	width: 70%;

}

.video {
	margin-top: 40px;
	scale: 0.5;
}

#detail-middle{
	margin: 0; 
	padding: 0;
}

.detail-order,
.detail-text{
	float: right;
}

.detail-text {
	margin-top: 30px;
	margin-bottom: 40px;
	padding-right: 0;
}

.user-star{
	text-align: center;
	margin: 10px 0;
}

.user-star-check{
	color: orange;
	font-size: large;
  
}

#modify-modal {
	margin-top: 0px;
}


</style>







<div id="wrapper">
				
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-xs-12">
                        <h2>멘토링<small></small></h2>
                        <hr>
                    </div>

					<div class="col-md-2"></div>
                    <div class="col-md-8 col-xs-12">
                        <div class="detail-info">
                            <p class="detail-title">${mentoringArticle.mentoringTitle }</p>
                            <p class="detail-price"><strong><fmt:formatNumber value="${mentoringArticle.mentoringPrice}" pattern="#,###" />원 </strong></p>
                            
                            <c:forEach var="num" begin="1" end="${mentoringArticle.mentoringLike}">
                            	<span class="glyphicon glyphicon-star detail-star"></span>
                            </c:forEach>
                            
                            <c:if test="${mentoringArticle.mentoringLike != 5}">
                            	<c:forEach var="num" begin="1" end="${5 - mentoringArticle.mentoringLike}">
                            		<span class="glyphicon glyphicon-star star-empty"></span>
                            	</c:forEach>
                            </c:if>
                            
                            <p class="detail-delivery">
                                무료배송<br>
                                상품별배송 | 택배배송 | 당일출고, 12시 이전 결제 건까지 해당 (주말, 공휴일 제외)
                            </p>
                        </div>
                    

                        <div class="detail-control">
                            <div class="detail-total-price clearfix">
                                <p class="left total-left">총 상품금액</p>
                                <p class="right total-right"><strong><fmt:formatNumber value="${mentoringArticle.mentoringPrice}" pattern="#,###" />원</strong></p>
                            </div>
                            <div class="detail-order clearfix">
                                <button class="left btn btn-default detail-btn">장바구니</button>
                                <button class="right btn btn-primary detail-btn">구매하기</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-2"></div>
                </div>
            </div>
        </section>

        <hr>
        <section>
            <div class="container">
                <div class="row">
                    
                    
                    
                <div class="row clearfix">
                    <div class="container" id="detail-middle">
                        
                        
                        <div class="col-md-12 detail-text"> 
                        	<div id="viewer"></div>
                            	<input type="hidden" id="view" value="${mentoringArticle.mentoringContent }">                           	
                        </div>
                        
                    </div> 
                </div>
                    

                </div>
            </div>
        </section>

        <section class="detail-reply">
            <div class="container">
                <div class="row">
                    <div class="col-md-9 col-xs-12 detail-content-wrap">
                        <!-- 평점 공간-->
                        <div class="row">
                            <div>
                                <div class="col-md-4 reply-star-point">
                                    <p><h2>${mentoringArticle.mentoringLike} / 5 점</h2></p>
                                    <p>
										<c:forEach var="num" begin="1" end="${mentoringArticle.mentoringLike}">
											<span class="glyphicon glyphicon-star reply-star"></span>
										</c:forEach>
                                    </p>
                                    <p>
                                        수강평수: <span>${ratings.size()}개</span>
                                    </p>
                                </div><!-- 평점 별 있는 곳-->

                                <div class="col-md-8 reply-star-graph clearfix">
                                    <div>                                    
                                        <div id="graph-point"><span>5점</span></div>
                                        <div class="progress" id="graph">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="${percentage[4]}" aria-valuemin="0" aria-valuemax="100" style="width: ${percentage[4]}%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div>                                    
                                        <div id="graph-point"><span>4점</span></div>
                                        <div class="progress" id="graph">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="${percentage[3]}" aria-valuemin="0" aria-valuemax="100" style="width: ${percentage[3]}%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div>                                    
                                        <div id="graph-point"><span>3점</span></div>
                                        <div class="progress" id="graph">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="${percentage[2]}" aria-valuemin="0" aria-valuemax="100" style="width: ${percentage[2]}%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div>                                    
                                        <div id="graph-point"><span>2점</span></div>
                                        <div class="progress" id="graph">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="${percentage[1]}" aria-valuemin="0" aria-valuemax="100" style="width: ${percentage[1]}%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div>                                    
                                        <div id="graph-point"><span>1점</span></div>
                                        <div class="progress" id="graph">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="${percentage[0]}" aria-valuemin="0" aria-valuemax="100" style="width: ${percentage[0]}%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>        

                        </div> <!--평점공간 close-->

                        <!-- 댓글 작성 공간 -->
                        <div class="detail-reply-wrap">
                            
                            <div class="detail-reply-content">
                                <div class="user-star"> 
									<span class="star">
									  ★★★★★
									  <span>★★★★★</span>
									  <input type="range" onchange="drawStar(this)" value="0" step="2" min="0" max="10">
									</span>                                    
									<p>별을 클릭하시면 별점 주기가 가능합니다.</p>
                                </div>
                                       
                                <textarea class="form-control" rows="3" placeholder="수강평을 써주세요" id="reply"></textarea>
                                        
                                <div class="detail-reply-group clearfix">
                                    <div class="reply-input">
                                        
                                    </div>
                                    <button class="btn btn-info" id="replyRegist">등록하기</button>
                                </div>
                            </div>
                        </div>
                        <div id="replyList">
	                        <!-- 댓글이 달릴 공간
	                        <div class="detail-reply-wrap">
	                          
	                            <div class="detail-reply-content">
	                                <div class="detail-reply-group clearfix">
	                                    <strong class="left">honggildong</strong>
	                                    <small class="left">2022/01/06</small>
	    
	                                    <a class="right" href="#"><span class="glyphicon glyphicon-pencil"></span>수정</a>
	                                    <a class="right" href="#"><span class="glyphicon glyphicon-remove"></span>삭제</a>
	                                </div>
	                                <p>여기는 댓글 영역</p>
	                            </div>
	                        </div>
	                         -->
                        </div>
                        <button class="form-control" id="moreList">더보기(페이징)</button>
                    </div>
                </div>
            </div>
        </section>
        
    <!-- 모달 -->
	<div class="modal fade" id="replyModal" role="dialog">
		<div class="modal-dialog modal-md">
			<div class="modal-content" style="width: 600px;">
				<div class="modal-header">
					<button type="button" class="btn btn-default pull-right" data-dismiss="modal">닫기</button>
					<h4 class="modal-title">댓글수정</h4>
				</div>
				<div class="modal-body" id="modify-modal">
					<!-- 수정폼 id값을 확인하세요-->
					<div class="reply-content">
						<textarea class="form-control" rows="4" id="modalReply" placeholder="내용입력"></textarea>
						<div class="reply-group">
							<div class="reply-input">
								<div class="user-star"> 
									<span class="star">
									  ★★★★★
									  <span>★★★★★</span>
									  <input id="replyModifyRating" type="range" onchange="drawStar(this)" value="0" step="2" min="0" max="10">
									</span>                                    
									<p id="replyModText" style="font-size: 15px;">별을 클릭하시면 별점 수정이 가능합니다.</p>
                                </div>
								
							    <input type="hidden" id="modalRno">
							</div>
							<button class="right btn btn-info" id="modalModBtn">수정하기</button>
						</div>
					</div>
					<!-- 수정폼끝 -->
				</div>
			</div>
		</div>
	</div>
    

 </div> <!-- wrapper close -->
 
 <script>
 	var view = $('#view').val()
 
 	const viewer = toastui.Editor.factory({
 		  el: document.querySelector('#viewer'),
          viewer: true,
          height: '500	px',
          initialValue: view
 	});
 	
 	console.log(view)
 
 	
 	
 	 function ToView()
     {
         viewer.getMarkdown(viewer.setHTML());
     };	
     
     const drawStar = (target) => {
    	 console.log(target.value/2);
    	 const value = target.value * 10;
    	 $('.star span').css('width', value + '%');
    	 $('.user-star p').text((target.value/2) + '점');    
   	 }
     
     
     $(function() {
		
    	 $('#replyRegist').click(function() {
			const writer = '${login.userId}'; //댓글쓴이
			const reply = $('#reply').val();  //댓글 내용
			const mentor_no = ${mentoringArticle.mentoringNo};
			const rating = $('input[type=range]').val() / 2;
			
			console.log(writer);
			console.log(reply);
			console.log(mentor_no);
			console.log(rating / 2);
			
			if(reply === '') {
				alert('댓글을 입력해 주세요~');
				return;
			} else if(writer === '') {
				alert('비회원은 글을 작성할 수 없습니다.');
				return;
			} else if(rating === 0) {
				alert('별점은 필수 사항입니다. 최소 1점은 주셔야 합니다.');
				return;
			}
			
			$.ajax({
				type: 'post',
				url: '<c:url value="/mentor/replyRegist" />',
				data: JSON.stringify({
					"writer" : writer,
					"content" : reply,
					"mentoringNo" : mentor_no,
					"rating" : rating
				}),
				dataType: 'text', 
				contentType: 'application/json',
				success: function(data) {
					console.log('통신 성공! ' + data);
					$('#reply').val('');
					$('input[type=range]').val(0);
					location.reload(); // 등록 성공 후 새로고침 실행.
				},
				error: function() {
					alert('등록에 실패했습니다. 관리자에게 문의하세요!');
				}
			}); // end ajax
			
		});
    	
    	//더보기 버튼 처리(클릭 시 전역변수 페이지번호에 +1값을 전달)
 		$('#moreList').click(function() {
 			getList(++page, false);
 		}); 
    	 
    	
    	let page = 1;
    	let str = '';
    	
    	getList(1, true); 
    	
    	function getList(pageNum, reset) {
			
    		const mentoringNo = ${mentoringArticle.mentoringNo};
    		console.log(mentoringNo);
    		
    		$.getJSON(
    			'<c:url value="/mentor/replyList/" />' + mentoringNo + '/' + pageNum,
    			function(data) {
					console.log(data);
					
					let total = data.total;
					let replyList = data.list;
										
					if(reset === true) {
						str = '';
						page = 1;
					}
					
					console.log('현재 페이지: ' + page);
					if(total <= page * 5) {
						$('#moreList').css('display', 'none');
					} else {
						$('#moreList').css('display', 'block');
					}
					
					if(replyList.length <= 0) {
						return;
					}
					
					for(let i=0; i<replyList.length; i++) {
						str += `<div class="detail-reply-wrap" style="display: none;">
                        <div class="detail-reply-content">
                            <div class="detail-reply-group clearfix">
                                <strong id="reply-writer" class="left">` + replyList[i].writer + `</strong>
                                <small class="left">` + timeStamp(replyList[i].regDate) + `</small>
								
                                <a class="right replyDelete" style="margin-left: 10px;" href="` + replyList[i].rno + `"><span class="glyphicon glyphicon-remove"></span>삭제</a>
                                <a class="right replyModify" href="` + replyList[i].rno + `"><span class="glyphicon glyphicon-pencil"></span>수정</a>
                            </div>
                            <p>` + replyList[i].content + `</p>
                        </div>
                    </div>`
					}
					$('#replyList').html(str);
					$('.detail-reply-wrap').fadeIn(500);
					$('#reply-cnt').text(replyList.length + '개');
    				
				}
    		);		
		}
    	
    	
    	$('#replyList').on('click', 'a', function(e) {
			e.preventDefault();
			const rno = $(this).attr('href');
			$('#modalRno').val(rno);
			const mentoringNo = ${param.mentoringNo};
			const writer = $(this).parent().children('#reply-writer').text();
			console.log('수정 writer: ' + writer);
			
			if('${login.userId}' !== writer) {
				alert('본인이 아니면 수정 및 삭제가 불가합니다.');
				return;
			}
			
			//수정임.
			if($(this).hasClass('replyModify')) {
				$('.modal-title').html('댓글 수정');
				$('#modalReply').css('display', 'inline');
				$('#modalModBtn').css('display', 'inline');
				$('#replyModal').modal('show');				
			} else {
				if(confirm('정말 삭제하시겠습니까?')) {
					$.post(
						'<c:url value="/mentor/replyDelete" />', {rno, mentoringNo},
						function(data) {
							location.reload();
						}
					);
				} else return;
			}		
		});
    	
    	$('#modalModBtn').click(function() {
			const content = $('#modalReply').val();
			const rno = $('#modalRno').val();
			const rating = $('#replyModifyRating').val() / 2;
			console.log(content);
			console.log(rno);
			console.log(rating);
			
			if(reply === '') {
				alert('수정할 내용을 입력하셔야 합니다.');
				return;
			} else if(rating === 0) {
				alert('별점은 최소 1점이라도 주셔야 합니다.');
				return;
			}
			
			$.ajax({
				type : "post",
				url : "<c:url value='/mentor/replyUpdate' />",
				contentType : 'application/json',
				data : JSON.stringify({
					'content' : content,
					'rno' : rno,
					'rating' : rating
				}),
				success : function(data) {
					if(data === 'modSuccess') {
						alert('정상 수정되었습니다.');
						$('#modalReply').val('');
						$('#replyModifyRating').val('0');
						$('#replyModifyRating').trigger('onchange');
						$('#replyModText').text('별을 클릭하시면 별점 수정이 가능합니다.');
						$('#replyModal').modal('hide');
						getList(1, true);
					} 
				},
				error : function() {
					alert('수정에 실패했습니다. 관리자에게 문의하세요.');
				}
				
			}); //end ajax(수정)
			
		});
    	
    	
    	// 날짜 처리 함수
		function timeStamp(millis) {
			
			const date = new Date(); //현재 날짜
			//현재 날짜를 밀리초로 변환 - 등록일 밀리초 -> 시간차
			const gap = date.getTime() - millis;
			
			let time; //리턴할 시간
			if(gap < 60 * 60 * 24 * 1000) { //1일 미만인 경우
				if(gap < 60 * 60 * 1000) { //1시간 미만일 경우
					time = '방금 전';
				} else { //1시간 이상일 경우
					time = parseInt(gap / (1000 * 60 * 60)) + '시간 전';
				}
			} else { //1일 이상일 경우
				const today = new Date(millis);
				const year = today.getFullYear(); //년
				const month = today.getMonth() + 1; //월
				const day = today.getDate(); //일
				const hour = today.getHours(); //시
				const minute = today.getMinutes(); //분
				
				time = year + '년 ' + month + '월 ' + day + '일 ' + hour + '시 ' + minute + '분'; 
				
			}
			return time;
		}
    	
    	
    	//별점 가져오기
/*     	function getRating(mentoringNo) {
			
		}
 */    	 
    	 
    	 
    	 
    	 
	}); //end jQuery
     
     
     
     
     
     </script>

	


	
<%@ include file="../include/footer.jsp" %>



















