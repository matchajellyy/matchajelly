package com.spring.dct.mentoring.mapper;

import java.util.List;
import java.util.Map;

import com.spring.dct.util.PageVO;
import com.spring.dct.vo.MentoringReplyVO;
import com.spring.dct.vo.MentoringsVO;

public interface IMentoringMapper {

	// 글 등록
	void regist(MentoringsVO vo);

	// 글 목록
	List<MentoringsVO> getList(PageVO vo);

	// 총 게시물 수
	int getTotal(PageVO vo);

	// 상세보기
	MentoringsVO getContent(int mentoringNo);

	// 수정
	void update(MentoringsVO vo);

	// 삭제
	void delete(int MentoringNo);
	
	//댓글 등록
	void replyRegist(MentoringReplyVO vo);
	
	//댓글 목록
	List<MentoringReplyVO> replyList(Map<String, Object> data);
	
	//댓글 총 개수
	int getReplyTotal(int mentoringNo);
	
	//특정 멘토링 글 모든 별점 얻어오기
	List<Integer> getAllRatings(int mentoringNo);
	
	//댓글 수정
	void replyUpdate(MentoringReplyVO vo);
	
	//댓글 삭제
	void replyDelete(int rno);
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
