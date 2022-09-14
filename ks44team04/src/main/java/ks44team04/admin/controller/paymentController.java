package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class paymentController {

	    @GetMapping("/paymentList")
	    public String paymentList(Model model) {
	    	
	    	model.addAttribute("title", "결제내역");
	    	
	        return "admin/paymentList";
	    }
	    
	    @GetMapping("/paymentDetail")
	    public String paymentDetail(Model model) {
	    	
	    	model.addAttribute("title", "결제상세내역");
	    	
	    	return "admin/paymentDetail";
	    }
}
