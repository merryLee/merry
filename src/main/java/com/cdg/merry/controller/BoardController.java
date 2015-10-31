package com.cdg.merry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdg.merry.domain.Board;
import com.cdg.merry.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/board/writeForm")
	public String getWriteForm() {
		return "board/writeForm";
	}
	
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String write(Board board) {	
		boardService.write(board);
		
		return "redirect:/board/writeForm";		//writeForm->을 list로 바꿔도됨.
	}
	
	@RequestMapping("/board/list")
	public String getList(Model model) {
		
		List<Board> boardList = boardService.getList();
		
		model.addAttribute("boardList",boardList);
		
		return "board/list";
	}
}
