package com.jlook.infra.member;

import java.util.List;

public interface MemberDao {

	public List<MemberDto> selectList(MemberVo vo);
}
