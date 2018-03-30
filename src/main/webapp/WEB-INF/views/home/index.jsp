<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	
	<main class="main">
		<section class="note-list">
			<h1 class="hidden">귀걸이 목록</h1>
			<ul class="">
			<c:forEach begin="0" end="9">
				<li>
					<div>노트 제목</div>
					<div>노트 내용 동해물과 백두산이 마르고 닳도록 
						하느님이 보우하사 우리나라만세~
					</div>
					<div><span>분류</span> <span>2018-03-22 15:23</span></div>
				</li>
			</c:forEach>	
			</ul>		
		</section>
	</main>
	
