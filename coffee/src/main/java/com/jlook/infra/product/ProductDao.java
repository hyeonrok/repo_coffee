package com.jlook.infra.product;

import java.util.List;

import com.jlook.common.base.BaseVo;

public interface ProductDao {

public List<ProductDto> selectList(ProductVo vo);
	
	public ProductDto selectOne(ProductDto dto);
	
	public int insert(ProductDto dto);
	
	public int update(ProductDto dto);
	
	public int uelete(ProductDto dto);

	public int delete(ProductDto dto);
	
	public int selectOneCount(ProductVo vo);
}
