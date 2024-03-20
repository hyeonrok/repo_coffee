package com.jlook.infra.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;
	
public List<ProductDto> selectList(ProductVo vo) {
		
		return dao.selectList(vo);
	}
	
	public ProductDto selectOne(ProductDto dto) {
	
		return dao.selectOne(dto);
	}

	public int insert(ProductDto dto) {
		
		return dao.insert(dto);
	}
	
	public int update(ProductDto dto) {
			
			return dao.update(dto);
		}
	
	public int uelete(ProductDto dto) {
		
		return dao.uelete(dto);
	}
	
	public int delete(ProductDto dto) {
		
		return dao.delete(dto);
	}
	
}