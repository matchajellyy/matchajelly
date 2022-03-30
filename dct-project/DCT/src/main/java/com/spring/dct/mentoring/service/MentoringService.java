package com.spring.dct.mentoring.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dct.mentoring.mapper.IMentoringMapper;
import com.spring.dct.util.PageVO;
import com.spring.dct.vo.MentoringReplyVO;
import com.spring.dct.vo.MentoringsVO;

@Service
public class MentoringService implements IMentoringService {

	@Autowired
	private IMentoringMapper mapper;

	@Override
	public void regist(MentoringsVO vo) {

		mapper.regist(vo);
	}

	@Override
	public List<MentoringsVO> getList(PageVO vo) {

		return mapper.getList(vo);
	}

	@Override
	public int getTotal(PageVO vo) {

		return mapper.getTotal(vo);
	}

	@Override
	public MentoringsVO getContent(int mentoringNo) {

		return mapper.getContent(mentoringNo);
	}

	@Override
	public void update(MentoringsVO vo) {
		mapper.update(vo);
	}


	@Override
	public void delete(int MentoringNo) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void replyRegist(MentoringReplyVO vo) {
		mapper.replyRegist(vo);
	}
	
	@Override
	public List<MentoringReplyVO> replyList(PageVO vo, int mentoringNo) {
		Map<String, Object> data = new HashMap<>();
		data.put("paging", vo);
		data.put("mentoringNo", mentoringNo);
		return mapper.replyList(data);
	}
	
	@Override
	public int getReplyTotal(int mentoringNo) {
		return mapper.getReplyTotal(mentoringNo);
	}
	
	@Override
	public List<Integer> getAllRatings(int mentoringNo) {
		return mapper.getAllRatings(mentoringNo);
	}
	
	@Override
	public void replyUpdate(MentoringReplyVO vo) {
		mapper.replyUpdate(vo);
	}
	
	@Override
	public void replyDelete(int rno) {
		mapper.replyDelete(rno);
	}

}
