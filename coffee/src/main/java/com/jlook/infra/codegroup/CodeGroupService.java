package com.jlook.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {

	@Autowired
	CodeGroupDao dao;
	
	public List<CodeGroupDto> selectList(){
		return dao.selectList();
		}
	
	public CodeGroupDto selectOne(CodeGroupDto dto) {
		return dao.selectOne(dto);
	}
	
	public int insert(CodeGroupDto dto) {
		return dao.insert(dto);
	}
	
	public int update(CodeGroupDto dto) {
		return dao.update(dto);
	}
	
	public int uelete(CodeGroupDto dto) {
		return dao.uelete(dto);
	}
	public int delete(CodeGroupDto dto) {
		return dao.delete(dto);
	}

}
