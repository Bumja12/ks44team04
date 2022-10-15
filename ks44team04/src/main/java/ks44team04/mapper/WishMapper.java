package ks44team04.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Wishlist;

@Mapper
public interface WishMapper {
	
	//찜 목록 조회
	public List<Wishlist> getWishlist(String userId);
	
	//찜 추가
	public int wishAdd(Wishlist wishlist);
	
	//찜 추가시 새로운 코드
	public String wishNewCode(String buyerId);
	
	//찜목록에서 상품 삭제
	public void wishRemove(Wishlist wishlist);

}