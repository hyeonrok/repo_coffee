package com.jlook.infra.codegroup;

import java.util.List;

import com.jlook.infra.BaseVo;

public interface CodeGroupDao {

	 public List<CodeGroupDto> selectList(BaseVo vo);
	public List<CodeGroupDto> selectList();
	public CodeGroupDto selectOne(CodeGroupDto dto);
	
	public int insert(CodeGroupDto dto);
	
	public int update(CodeGroupDto dto);
	
	public int uelete(CodeGroupDto dto);
	
	public int delete(CodeGroupDto dto);
	
	public List<CodeGroupDto> selectListWithoutPaging();
}
