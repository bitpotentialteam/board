package org.potential.persistence;

import java.util.List;

import org.potential.domain.ReplyVO;

public interface ReplyDAO {
	

	public void create(ReplyVO vo) throws Exception;

	public ReplyVO read(Integer rno) throws Exception;

	public void delete(Integer rno) throws Exception;

	public void update(ReplyVO vo) throws Exception;

	public List<ReplyVO> listAll(Integer page) throws Exception;

	public Integer getAllCount() throws Exception;

	// reply.searchList 생략...

}
