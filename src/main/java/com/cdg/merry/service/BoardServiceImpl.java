package com.cdg.merry.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdg.merry.domain.Board;
import com.cdg.merry.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	public void write(Board board) {
		
		long boardNo = makeBoardNo();
		board.setBoardNo(boardNo);
		board.setUserNo(0);
		
		boardMapper.insertBoard(board);
	}

	//게시판 글번호를 생성한다.
	protected long makeBoardNo() {
		return Long.parseLong(DateFormatUtils.format(new Date(), "yyMMddhhmm"));
	}

	public List<Board> getList() {
		return boardMapper.selectBoardList();
	}

}
