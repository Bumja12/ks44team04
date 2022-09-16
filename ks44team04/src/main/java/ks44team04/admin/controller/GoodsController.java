package ks44team04.admin.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team04.admin.service.GoodsService;
import ks44team04.dto.Goods;

@Controller
@RequestMapping(value = "/admin/goods")
public class GoodsController {
	
	//의존성 주입
	private GoodsService goodsService;
	public GoodsController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	//상품 수정
	@PostMapping("/modifyGoods")
	public String modifyGoods(Goods goods) {
		goodsService.modifyGoods(goods);
		return "redirect:/goods/goodsList";
	}
	
	//상품 수정	
	@GetMapping("/modifyGoods")
	public String modifyGoods(@RequestParam(value="goodsCode", required = false) String goodsCode, Model model) {
		//특정회원의 정보
		Goods goodsInfo = goodsService.getGoodsInfoByCode(goodsCode);
		//model 셋팅
		model.addAttribute("title", "상품수정");
		model.addAttribute("goodsInfo", goodsInfo);
		
		return "goods/modifyGoods";
	}

	//상품 목록 조회
	@GetMapping("/goodsList")
	public String getGoodsList(Model model) {
		List<Goods> goodsList = goodsService.getGoodsList();
		
		model.addAttribute("title", "상품목록");
		model.addAttribute("goodsList", goodsList);
		
		return "admin/goods/goodsList";
	}
}
