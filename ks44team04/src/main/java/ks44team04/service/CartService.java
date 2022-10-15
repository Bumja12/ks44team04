package ks44team04.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ks44team04.dto.Cart;
import ks44team04.mapper.CartMapper;

@Service
@Transactional
public class CartService {
	
	//의존성 주입
	private final CartMapper cartMapper;
	public CartService(CartMapper cartMapper) {
	this.cartMapper = cartMapper;
	}
		
	//장바구니 목록 조회
	public List<Cart> getCartList(String userId) {
		List<Cart> cartList = cartMapper.getCartList(userId);
		return cartList;
	}
	
	//장바구니 추가
	public int cartAdd(Cart cart) {
		int result = cartMapper.cartAdd(cart);
		return result;
	}
	
	//장바구니 추가 시 코드 증가
	public String cartNewCode(String buyerId) {
		String cartNewCode = cartMapper.cartNewCode(buyerId);
		return cartNewCode;
	}
	
	//장바구니 확인
	public Cart cartCheck(Cart cart) {
		cartMapper.cartCheck(cart);
		return cart;
	}
	
	//장바구니 수량 수정
	public int cartModify(Cart cart) {
		int result = cartMapper.cartModify(cart);
		return result;
	}
	
	//장바구니 상품 삭제
	public void cartRemove(Cart cart) {
		cartMapper.cartRemove(cart);
	}
	
}