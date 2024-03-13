package com.jlook.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {

	@Autowired
	CodeDao dao;	//implements 느낌?
	
	public List<CodeDto> selectList(){
		return dao.selectList();
		}
	
	public CodeDto selectOne(CodeDto dto) {
		return dao.selectOne(dto);
	}
	
	public int insert(CodeDto dto) {
		return dao.insert(dto);
	}
	
	public int update(CodeDto dto) {
		return dao.update(dto);
	}
	
	public int uelete(CodeDto dto) {
		return dao.uelete(dto);
	}
	
	public int delete(CodeDto dto) {
		return dao.delete(dto);
	}
}
