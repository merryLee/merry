package com.cdg.merry.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdg.merry.domain.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-root.xml")
public class BoardMapperTest {

	@Autowired
	private BoardMapper mapper;
	
	@Test
	@Ignore
	public void test() throws Exception {
		//Given
		Board board = new Board();
		board.setBoardNo(0);
		board.setTitle("hello");
		board.setContents("hello");
		board.setUserNo(0);
		
		//When
		mapper.insertBoard(board);
		
		//Then

	}

	@Test
	@Ignore
	public void testSelectBoardList() throws Exception {
		//Given
		
		//When
		List<Board> actual = mapper.selectBoardList();
		
		//Then
		assertTrue(CollectionUtils.isNotEmpty(actual));
	}
	
	@Test
	@Ignore
	public void testUpdateBoard() throws Exception {
		//Given
		Board board = new Board();
		board.setBoardNo(0);
		board.setTitle("test update");
		board.setContents("1234");
		
		//When
		mapper.updateBoard(board);
		
		//Then
		
	}
	
	@Test
	public void testDeleteBoard() throws Exception {
		//Given
		
		//When
		mapper.deleteBoard(0);
		
		//Then
		
	}
	
}
