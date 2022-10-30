package ks44team04.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.service.AlertService;
import ks44team04.util.CodeIndex;
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

	
	
	/* 알림등록 쿼리실행 */
	@PostMapping("/alert/addAlert")
    public String addAlert(Alert alert) {
		
		String alertNewCode = alertService.getAlertNewCode();
		alertNewCode = CodeIndex.codeIndex(alertNewCode, 5);
		log.info("알림코드 증가 :::{}" , alertNewCode);
		
		alert.setAlertCode(alertNewCode);
		alertService.addAlert(alert);
        
        return "redirect:/admin/alert/alertList";
    }
	
	/* 알림등록 화면연결 */
	@GetMapping("/alert/addAlert")
	public String addAlertForm(Model model) {

		model.addAttribute("title", "알림등록");
		
		return "admin/alert/addAlert";
	}
	
	/* 알림 전송 내역 */
	@GetMapping("/alert/alertSendList")
	public String getAlertSendList(Model model) {
		List<AlertSend> alertSendList = alertService.getAlertSendList();
		List<Alert> alertList = alertService.getAlertList();

		log.info("알림전송내역 ::: {}", alertSendList);
		model.addAttribute("alertList", alertList);
		model.addAttribute("alertSendList", alertSendList);
		model.addAttribute("title", "알림전송내역");

		/*
		 * if(alertSendList != null) { for(AlertSend alertSend : alertSendList) { String
		 * alertCode = alertSend.getAlertCode(); for(Alert alert : alertList) {
		 * if(alertCode.contains("0001")) {
		 * alertSend.setAlertCode(alert.getAlertTitle()); }else
		 * if(alertCode.contains("0002")) {
		 * alertSend.setAlertCode(alert.getAlertTitle());
		 * 
		 * } } } }
		 */

		return "admin/alert/alertSendList";
	}

	/* 알림 목록 */
	@GetMapping("/alert/alertList")
	public String getAlertList1(Model model) {
		List<Alert> alertList = alertService.getAlertList();
		log.info("알림 목록 ::: {}", alertList);
		model.addAttribute("alertList", alertList);
		model.addAttribute("title", "알림목록");

		return "admin/alert/alertList";
	}

}
