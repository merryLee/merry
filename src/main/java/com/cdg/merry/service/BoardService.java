package com.cdg.merry.service;

import java.util.List;

import com.cdg.merry.domain.Board;

public interface BoardService {
	void write(Board board);

	List<Board> getList();
}
