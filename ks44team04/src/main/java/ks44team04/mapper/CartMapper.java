package ks44team04.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Cart;

@Mapper
public interface CartMapper {
	
	//장바구니 목록 조회
	public List<Cart> getCartList(String userId);
	
	//장바구니 추가
	public int cartAdd(Cart cart);
	
	//장바구니 추가시 새로운 코드
	public String cartNewCode(String buyerId);
	
	//장바구니 확인
	public Cart cartCheck(Cart cart);
	
	//장바구니 수량 수정
	public int cartModify(Cart cart);
	
	//장바구니에서 상품 삭제
	public void cartRemove(Cart cart);

}