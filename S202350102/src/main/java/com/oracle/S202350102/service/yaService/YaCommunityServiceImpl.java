package com.oracle.S202350102.service.yaService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.S202350102.dao.yaDao.YaBoardDao;
import com.oracle.S202350102.dto.Board;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class YaCommunityServiceImpl implements YaCommunityService {
	
	private final YaBoardDao ybd;

	@Override
	public List<Board> listBoard(Board board) {
		List<Board> boardList = null;
		System.out.println("YaCommunityServiceImpl start... ");
		boardList = ybd.listBoard(board);
		System.out.println("YaCommunitydServiceImpl listBoard boardList.size?"+boardList.size());
		
		return boardList;
	}

}
