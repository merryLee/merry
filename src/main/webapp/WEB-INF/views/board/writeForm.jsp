<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
    <form action="/board/write" method="post">
        <h1>게시판 글쓰기</h1>
        <table>
            <tr>
                <td>제목</td>
                <td><input type="text" name="title"></td>
            <tr>
            <tr>
                <td>내용</td>
                <td><textarea rows="20" cols="30" name="contents"></textarea></td>
        </table>
        <input type="submit" id="btnSubmit" value="submit">
    </form>
</body>
</html>




