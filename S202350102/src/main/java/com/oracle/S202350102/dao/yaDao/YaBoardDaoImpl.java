package com.oracle.S202350102.dao.yaDao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.S202350102.dto.Board;

import lombok.RequiredArgsConstructor;
@Repository
@RequiredArgsConstructor
public class YaBoardDaoImpl implements YaBoardDao {
	
	private final SqlSession session;
	
	@Override
	// board테이블 community 부분 조회
	public List<Board> listBoard(Board board) {
		List<Board> boardList = null;
		System.out.println("YaBoardDaoImpl listBoard start...");
		try {
			boardList = session.selectList("YaCommunityListAll", board);
			System.out.println("YaBoardDaoImpl listBoard boardList.size()?"+boardList.size());
			
		} catch (Exception e) {
			System.out.println("YaBoardDaoImpl listBoard e.getMessage()?"+e.getMessage());
		}
		
		return boardList;
	}

}
