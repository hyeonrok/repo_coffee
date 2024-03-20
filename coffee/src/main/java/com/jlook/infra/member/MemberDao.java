package com.jlook.infra.member;

import java.util.List;

public interface MemberDao {

	public List<MemberDto> selectList(MemberVo vo);
	
	public MemberDto selectOne(MemberDto dto);
	
	public int insert(MemberDto dto);
	
	public int update(MemberDto dto);
	
	public int uelete(MemberDto dto);

	public int delete(MemberDto dto);
}
