package com.koreak.tier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreak.tier.vo.ProductVO;

@Mapper
public interface ProductMapper {
	
	// 상품 추가
	public void insert(ProductVO productVO);
	
	// 상품 리스트 조회
	public List<ProductVO> selectAll(); 
	
}