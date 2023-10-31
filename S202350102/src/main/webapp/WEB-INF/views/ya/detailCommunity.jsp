<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시글 상세내용 확인</h3>
<form action="" method="post">
<input type="hidden" name="brd_num" value="${board.brd_num }">
<input type="submit" value="수정">
<a href="list">목록</a>
<a href="delete?brd_num=${board.brd_num}">삭제</a>

<!--제목, 닉네임,  조회수, 작성일자, 내용, 댓글창 수정 삭제, 목록이동 -->
<table>
	<tr>
		<th>제목</th>
		<td><input type="text" name="brd_title" value="${board.title}"></td>
	</tr>
	<tr>
		<th>닉네임</th>
		<td>${board.nick}</td>
	</tr>
	<tr>
		<td> 조회수 </td><td> ${board.view_cnt} </td>
	</tr>
	<tr>
		<th>작성일자</th>
		<td>${board.reg_date}</td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea rows="10" name="conts">${board.conts}</textarea> </td>
	</tr>
	
</table>
</form>
</body>
</html>