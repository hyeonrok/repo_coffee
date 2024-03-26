package com.jlook.infra.member;

import java.util.List;

import com.jlook.infra.BaseVo;

public interface MemberDao {

	public List<MemberDto> selectList(BaseVo vo);
	
	public MemberDto selectOne(MemberDto dto);
	
	public int insert(MemberDto dto);
	
	public int update(MemberDto dto);
	
	public int uelete(MemberDto dto);

	public int delete(MemberDto dto);
}
