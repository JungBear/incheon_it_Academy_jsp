package com.koreak.tier.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.koreak.tier.dto.OrderDTO;
import com.koreak.tier.vo.OrderVO;

@Service
public interface OrderService {
	
	// 주문하기
	public void order(OrderVO orderVO);
	
	// 주문 내역 조회하기
	public List<OrderDTO> list(String sort);
}
