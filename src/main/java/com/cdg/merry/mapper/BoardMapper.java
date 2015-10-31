package com.cdg.merry.mapper;

import java.util.List;

import com.cdg.merry.domain.Board;

public interface BoardMapper {

	public void insertBoard(Board board);
	
	public List<Board> selectBoardList();

	public void updateBoard(Board board);
	
	public void deleteBoard(int boardNo);
}
