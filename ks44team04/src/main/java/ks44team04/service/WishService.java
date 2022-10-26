package ks44team04.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ks44team04.dto.Wishlist;
import ks44team04.mapper.WishMapper;

@Service
@Transactional
public class WishService {
	
	//의존성 주입
	private final WishMapper wishMapper;
	public WishService(WishMapper wishMapper) {
	this.wishMapper = wishMapper;
	}
	
	//찜 목록 조회
	public List<Wishlist> getWishlist(String userId) {
		List<Wishlist> wishlist = wishMapper.getWishlist(userId);
		return wishlist;
	}
	
	//장바구니 확인
	public int wishCheck(Wishlist wishlist) {
		return wishMapper.wishCheck(wishlist);
	}
	
	//찜 추가
	public int wishAdd(Wishlist wishlist) {
		int result = wishMapper.wishAdd(wishlist);
		return result;
	}
	
	//찜 추가 시 코드 증가
	public String wishNewCode(String buyerId) {
		String wishNewCode = wishMapper.wishNewCode(buyerId);
		return wishNewCode;
	}
	
	//찜 목로게서 상품 삭제
	public void wishRemove(Wishlist wishlist) {
		wishMapper.wishRemove(wishlist);
	}
	
}