package com.oracle.S202350102.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int 	brd_Num; 		// 게시물등록번호
	private int 	chg_Id; 		// 첼린지등록번호 
	private int 	user_num;		// 회원번호
	private int 	brd_lg;		// 분류번호(대분류)
	private int 	brd_md;		// 분류번호(중분류)
	private String 	title;			// 게시글 제목
	private String 	conts;			// 게시글내용
	private String 	img;			// 게시글 첨부파일
	private int 	view_cnt;		// 게시글 조회 수
	private Date 	reg_date;		// 게시글 작성일자
	private int		price;			// 쉐어링 금액
	private String 	bank_info;		// 쉐어링 은행,계좌번호
	private Date 	bank_duedate;	// 쉐어링 입금기한
	private String 	addr;			// 쉐어링 주소
	private int 	applicants;		// 쉐어링 모집인원
	private int 	participants;	// 쉐어링 참여인원
	private String 	user_tel;		// 쉐어링 연락처정보
	private String 	memo;			// 쉐어링 전달할메모
	private int 	like_cnt;		// 게시판 좋아요수
	private int 	brd_group;		// 게시글그룹
	private int 	brd_step;		// 댓글순서
	private int 	loc_brd_num;	// 지도목록코드번호
	private int 	loc_num;		// 지역코드번호
	
}
