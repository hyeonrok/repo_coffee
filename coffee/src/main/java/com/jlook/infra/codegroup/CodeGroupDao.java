package com.jlook.infra.codegroup;

import java.util.List;

import templates.xdm.infra.CodeGroupVo;

public interface CodeGroupDao {

	 public List<CodeGroupDto> selectList(CodeGroupVo vo);
	public List<CodeGroupDto> selectList();
	public CodeGroupDto selectOne(CodeGroupDto dto);
	
	public int insert(CodeGroupDto dto);
	
	public int update(CodeGroupDto dto);
	
	public int uelete(CodeGroupDto dto);
	
	public int delete(CodeGroupDto dto);
}
