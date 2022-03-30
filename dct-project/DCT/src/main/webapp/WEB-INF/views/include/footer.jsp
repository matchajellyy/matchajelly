<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dream Come True</title>
    
       <!-- font awesome -->
    <script src="https://kit.fontawesome.com/ec7c1dce8a.js" crossorigin="anonymous"></script>
    
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
    <link rel="stylesheet" href="<c:url value='/css/bootstrap.css' />">
    <link rel="stylesheet" href="<c:url value='/css/main.css' />">
    
       <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <script src="<c:url value='/js/bootstrap.js' />"></script>
    
</head>
    <footer>
        <div>
            <div class="container">
                <div class="container-line"></div>
                <ul class="costom">
                    <li class="first-address" style="margin-right: -20">
                        <div class="footer-info">
                            <h3>COMPANY. D.C.T</h3>
                            <p>
                            <span>owner. 김아무개</span>
                            <span>E-MAIL: info@info.com</span>
                            <span>business no. 123-45-67890 </span>
                            <span>개인정보보호책임자: 김아무개</span>
                            </p>
                            <p>
                            <span>통신판매업: 2022-서울마포-0001</span>
                            <span>주소: 서울특별시 마포구 대흥동</span>
                            <address>&copy; Dream Come True. ALL RIGHTS RESERVED</address>
                            </p>
                        </div>
                    </li>
                    <li>
                        <div class="footer-box">
                            <h3>CS CENTER</h3>
                            <h4>02-222-2222</h4>
                            <p>OPEN : am10:00 - pm17:00</p>
                            <p>BREAK : pm12:00-pm13:00</p>
                            <p>(sat / sun / holiday OFF)</p>
                        </div>
                    </li>

                    <li>
                        <div class="footer-box">
                            <h3>BANK ACCOUNT</h3>
                            <p>국민 196-00000000-000</p>
                            <p>예금주:(주)DCT</p>
                        </div>
                    </li>
                    <li style="margin-left: -20; margin-right: 20;">
                        <div class="footer-box">
                            <h3>소비자피해보상보험</h3>
                            <p>고객님은 안전거래를 위해 현금 결제 시, DCT 에서 가입한
                                소비자피해보상보험 서비스를 이용하실 수 있습니다.</p>
                            <p>보상대상 : 환불거부/부도</p>
                        </div>
                    </li>
                    <li>
                        <div class="footer-box">
                            <h3>구매안전서비스</h3>
                            <p>고객님은 안전거래를 위해 현금 등으로 5만원 이하 소액거래(전체거래) 결제 시 저희 DCT가 가입한 PG 에스크로 구매안전 서비스를 이용하실 수 있습니다.</p>
                            <p>결제대금예치업 등록번호 02-000-00000 [가입사실확인]</p>
                        </div>
                    </li>
                </ul>
            </div>
                <div class="copyright">
                    <ul class="footer-menu">
                        <li><a href="<c:url value='/' />">홈으로</a></li>
                        <li><a href="<c:url value='/notice/introduce' />">사이트소개</a></li>
                        <li><a href="<c:url value='/' />">이용약관</a></li>
                        <li><a href="<c:url value='/notice/frequentqna' />">자주 묻는 질문</a></li>
                        <li><a href="<c:url value='/' />">개인정보취급방침</a></li>
                    </ul>
                </div>
        </div>
    </footer>