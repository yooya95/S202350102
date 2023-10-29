package com.oracle.S202350102.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.S202350102.dto.Board;
import com.oracle.S202350102.service.yaService.YaCommunityService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class YaController {
	private final YaCommunityService ycs;
	
	@RequestMapping(value="listBoard")
	public String boardList(Board board, Model model) {
		List<Board> listBoard = ycs.listBoard(board);
		System.out.println("YaController list listBoard.size()?"+listBoard.size());
		
		model.addAttribute("listBoard", listBoard);
		
		return "list";
	}
}
