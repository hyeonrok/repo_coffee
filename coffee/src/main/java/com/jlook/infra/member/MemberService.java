package com.jlook.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlook.infra.BaseVo;

@Service
public class MemberService {

	@Autowired
	MemberDao dao;
	
	public List<MemberDto> selectList(BaseVo vo) {
		
		return dao.selectList(vo);
	}
	
	public MemberDto selectOne(MemberDto dto) {
	
		return dao.selectOne(dto);
	}

	public int insert(MemberDto dto) {
		
		return dao.insert(dto);
	}
	
	public int update(MemberDto dto) {
			
			return dao.update(dto);
		}
	
	public int uelete(MemberDto dto) {
		
		return dao.uelete(dto);
	}
	
	public int delete(MemberDto dto) {
		
		return dao.delete(dto);
	}
	
}
