package org.potential.persistence;

import java.util.List;

import org.potential.domain.BoardVO;

public interface BoardDAO {
	
	
	public void create(BoardVO vo) throws Exception;

	public BoardVO read(Integer bno) throws Exception;

	public void delete(Integer bno) throws Exception;

	public void update(BoardVO vo) throws Exception;
	
	public List<BoardVO> listAll(Integer page) throws Exception;
	
	public Integer getAllCount() throws Exception;
	
	public List<BoardVO> listSearch(Integer page) throws Exception;
	
	public Integer getSearchCount() throws Exception;
	
	public void upViewCount() throws Exception;
	
	public void upReplyCount() throws Exception;

	public void downReplyCount() throws Exception;

}
