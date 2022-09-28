package ks44team04.admin.controller;

import ks44team04.service.ReportService;
import ks44team04.util.CodeIndex;
import ks44team04.dto.Report;
import ks44team04.dto.UserSuspend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ReportController {

	private ReportService reportService;
	private static final Logger log = LoggerFactory.getLogger(ReportController.class);

	public ReportController(ReportService reportService) {
		this.reportService = reportService;
	}
	
	/*
	 * @PostMapping("/report/reportProcessing") public String
	 * reportProcessing(Report report) {
	 * 
	 * 
	 * return "redirect:/admin/report/reportList"; }
	 */
	
	//신고 처리
	@GetMapping("/report/reportProcessing")
	public String reportProcessing(Model model) {
		
		model.addAttribute("titel", "신고처리");
		
		return "admin/report/reportProcessing";
	}
	
	// 신고등록
	@GetMapping("/report/report")
	public String getReport(Report report) {

		String repoterId = "buyer01";
		String HistoryCode = reportService.getHistoryCode();
		CodeIndex codeIndex = new CodeIndex();
		HistoryCode = codeIndex.codeIndex(HistoryCode, 15);
		log.info("---------------------------------사용자가 입력한 정보", report);
		report.setReportHistoryCode(HistoryCode);
		report.setReportingId(repoterId);
		reportService.setReport(report);
		log.info("---------------------------------, {}", HistoryCode);

		/* model.addAttribute("title", "신고하기"); */
		/* model.addAttribute("reportList", reportList); */
		return "redirect:/admin/report/reportList";
	}

	// 신고리스트
	@GetMapping("/report/reportList")
	public String getReportList(Model model) {
		log.info("/admin/reportList getReportList ReportController.java");
		List<Report> reportList = reportService.getReportList();

		model.addAttribute("title", "신고목록");
		model.addAttribute("reportList", reportList);

		return "admin/report/reportList";
	}

	// 정지리스트
	@GetMapping("/report/userSuspendList")
	public String getUserSuspendList(Model model) {
		
		
		
		  List<UserSuspend> userSuspendList = reportService.getuserSuspendList();
		  log.info("/admin/report/suspendList userSuspendList ReportController.java");
		  
		  model.addAttribute("title", "정지목록"); model.addAttribute("userSuspendList",
		  userSuspendList);
		

		return "admin/report/userSuspendList";
	}

}
