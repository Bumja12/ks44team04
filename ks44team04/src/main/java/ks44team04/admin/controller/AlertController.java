package ks44team04.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.admin.service.AlertService;
import ks44team04.dto.Alert;
import ks44team04.dto.AlertSend;

@Controller
@RequestMapping("/admin")
public class AlertController {
	
	private AlertService alertService;
    private final Logger log = LoggerFactory.getLogger(getClass());

    public AlertController(AlertService alertService) {
    	this.alertService = alertService;
    }
    
	@GetMapping("/alert/alertSendList")
	public String getAlertSendList(Model model) {
		List<AlertSend> alertSendList = alertService.getAlertSendList();
		List<Alert> alertList = alertService.getAlertList();

		log.info("알림전송내역 ::: {}", alertSendList);
		model.addAttribute("alertList", alertList);
		model.addAttribute("alertList", alertSendList);
		model.addAttribute("title", "알림전송내역");
		
		return "admin/alert/alertSendList";
	}
	
	@GetMapping("/alert/alertList")
	public String getAlertList1(Model model) {
		List<Alert> alertList = alertService.getAlertList();
		log.info("알림 목록 ::: {}", alertList);
		model.addAttribute("alertList", alertList);
		model.addAttribute("title", "알림목록");
		
		return "admin/alert/alertList";
	}

}
