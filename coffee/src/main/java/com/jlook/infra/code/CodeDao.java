package com.jlook.infra.code;

import java.util.List;

import com.jlook.common.base.BaseVo;

public interface CodeDao {

	 public List<CodeDto> selectList(CodeVo vo);
	public List<CodeDto> selectList();
	public CodeDto selectOne(CodeDto dto);
	
	public int insert(CodeDto dto);
	
	public int update(CodeDto dto);
	
	public int uelete(CodeDto dto);
	
	public int delete(CodeDto dto);
	
	
	public List<CodeDto> selectListCachedCodeArrayList();
	
	public int selectOneCount(CodeVo vo);
}
