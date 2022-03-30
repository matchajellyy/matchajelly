<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<div class="wrapper">
		<%@ include file="../include/header.jsp"%>

		<section id="id-search">
			<div class="container">
				<div class="row">
					<div class="pw-search-header">
						<h2>비밀번호 찾기</h2>
                    </div>
				</div>
				<div class="row">
                    <div class="pw-search-footer">
                    	<form action="<c:url value='/user/pwNew' />" method="post" id="searchPwForm">
                    		<div class="pw-modify-footer">
                    			<input type="hidden" name="userId" id="userId" class="userId" value="${userInfo.userId}">
	                        	<p class="user_info_p">변경할 비밀번호</p>
	                             <input type="password" id="userPw" type="text" name="userPw" minlength="2" style="font-weight:bold;  border-style:solid  border-width 5px">
	                        	<p class="user_info_p">변경할 비밀번호 확인</p>
	                             <input type="password" id="userPwChk" type="text" name="userPwChk" minlength="2" style="font-weight:bold;  border-style:solid  border-width 5px">
	                            <button type="button" class="btn btn-primary btn-user btn-block" id="updateBtn">변경</button>
                        	</div>
                        </form>
                    </div>
				</div>
			</div>
		</section>

		<%@ include file="../include/footer.jsp"%>
		
<script>

$(function() {
	const regex = /^[A-Za-z0-9+]{4,12}$/;
	
	$('#updateBtn').click(function() {
		console.log('${userInfo.userId}');
		// 비밀번호 검증
		if($('#userPw').val() === '') {
			alert('비밀번호는 필수 입력 입니다.');
			$('#userPw').focus();
			return;
		} else if(!regex.test($('#userPw').val())) {
			alert('비밀번호는 8~16자로 작성해 주세요.');
			$('#userPw').focus();
			return;
		} else if($('#userPw').val() !== $('#userPwChk').val()) {
			alert('비밀번호가 일치하지 않습니다. 비밀번호 확인란을 다시 작성해 주세요.');
			$('#userPwChk').focus();
			return;
		} else {
			
			const check = confirm('수정할까요?');
			if(check) {
				alert('수정이 완료되었습니다.');
				$('#searchPwForm').submit();
			} else {
				return;
			}
		}
	}); // 수정 버튼 이벤트
});
		
</script>

	
