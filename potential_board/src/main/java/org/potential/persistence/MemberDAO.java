package org.potential.persistence;

import java.util.List;

import org.potential.domain.MemberVO;

public interface MemberDAO {
	
	
	public void create(MemberVO vo) throws Exception;

	public MemberVO read(Integer mno) throws Exception;

	public void delete(Integer mno) throws Exception;

	public void update(MemberVO vo) throws Exception;

	public List<MemberVO> listAll(Integer page) throws Exception;

	public Integer getAllCount() throws Exception;

	// Member.searchList 생략...

}
