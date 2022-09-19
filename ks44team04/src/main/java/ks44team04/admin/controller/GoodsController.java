package ks44team04.admin.controller;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team04.admin.service.GoodsService;
import ks44team04.dto.Goods;

@Controller
@RequestMapping(value = "/admin")
public class GoodsController {
	
	//의존성 주입
	private GoodsService goodsService;
	public GoodsController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	@PostConstruct
	public void goodsControllerInit() {
	}
	
	//상품 삭제
	@PostMapping("/goods/removeGoods")
	public String goodsRemove(String goods) {
		goodsService.goodsRemove(goods);
		return "redirect:/admin/goods/removeGoods";
	}
	
	//상품 삭제
	@GetMapping("/goods/removeGoods")
	public String goodsRemove(@PathVariable(value = "goodsCode") String goodsCode, Model model) {
		
		model.addAttribute("title", "상품삭제");
		model.addAttribute("goodsCode", goodsCode);

		return "admin/goods/goodsList";
	}
	
	
	//상품 수정 쿼리 실행
	@PostMapping("/goods/goodsModify")
	public String goodsModify(Goods goodsCode) {
		goodsService.goodsModify(goodsCode);
		return "redirect:/admin/goods/goodsList";
	}
	
	//상품 수정을 위해 수정페이지에 정보 불러오기
	@GetMapping("/goods/goodsModify")
	public String goodsModify(@RequestParam(name="goodsCode", required = false) String goodsCode
							 ,@RequestParam(name="selldId", required = false) String selldId
							 ,@RequestParam(name="goodsName", required = false) String goodsName
							 ,@RequestParam(name="goodsContent", required = false) String goodsContent
							 ,@RequestParam(name="goodsPrice", required = false) String goodsPrice
							 ,@RequestParam(name="goodsDiscountRate", required = false) String goodsDiscountRate
							 ,@RequestParam(name="goodsStock", required = false) String goodsStock
							 ,@RequestParam(name="goodsPostPrice", required = false) String goodsPostPrice
							 ,@RequestParam(name="goodsReportAmount", required = false) String goodsReportAmount
							 ,@RequestParam(name="soldoutCheck", required = false) String soldoutCheck
							 ,@RequestParam(name="stopSaleCheck", required = false) String stopSaleCheck
							 ,@RequestParam(name="packagePostCheck", required = false) String packagePostCheck
							 ,@RequestParam(name="regularDeliverCheck", required = false) String regularDeliverCheck,
							  Model model) {
		
		//특정회원의 정보
		Goods goodsInfo = goodsService.getGoodsInfoByCode(goodsCode);
		//model 셋팅
		model.addAttribute("title", "상품수정");
		model.addAttribute("goodsInfo", goodsInfo);
		model.addAttribute("goodsCode", goodsCode);
		model.addAttribute("selldId", selldId);
		model.addAttribute("goodsName", goodsName);
		model.addAttribute("goodsContent", goodsContent);
		model.addAttribute("goodsPrice", goodsPrice);
		model.addAttribute("goodsDiscountRate", goodsDiscountRate);
		model.addAttribute("goodsStock", goodsStock);
		model.addAttribute("goodsPostPrice", goodsPostPrice);
		model.addAttribute("goodsReportAmount", goodsReportAmount);
		model.addAttribute("soldoutCheck", soldoutCheck);
		model.addAttribute("stopSaleCheck", stopSaleCheck);
		model.addAttribute("packagePostCheck", packagePostCheck);
		model.addAttribute("regularDeliverCheck", regularDeliverCheck);
		
		return "/admin/goods/goodsModify";
	}

	//상품 목록 조회
	@GetMapping("/goods/goodsList")
	public String getGoodsList(Model model) {
		List<Goods> goodsList = goodsService.getGoodsList();
		
		model.addAttribute("title", "상품목록");
		model.addAttribute("goodsList", goodsList);
		
		return "/admin/goods/goodsList";
	}
}
