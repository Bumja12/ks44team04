package ks44team04.admin.controller;

import ks44team04.service.ReportService;
import ks44team04.util.CodeIndex;
import ks44team04.dto.Report;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ReportController {

    private ReportService reportService;
    private static final Logger log = LoggerFactory.getLogger(ReportController.class);

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }
    
    @PostMapping("/report/report")
    public String report(Report report){
    	reportService.setReport(report);
    
    	return "redirect:/admin/report/reportList";
    }
    
    @GetMapping("/report/report")
    public String getReport(Report report) {
		 
    	String repoterId = "buyer01";
    	String reportHistoryCode = reportService.getReportHistoryCode();
    	CodeIndex codeIndex = new CodeIndex();
    	reportHistoryCode = codeIndex.codeIndex(reportHistoryCode, 15);
    	log.info("---------------------------------사용자가 입력한 정보",report);
    	report.setReportHistoryCode(reportHistoryCode);
    	report.setReportingId(repoterId);
    	reportService.setReport(report);
    	log.info("---------------------------------, {}",reportHistoryCode);
    	
		/* model.addAttribute("title", "신고하기"); */
		/* model.addAttribute("reportList", reportList); */
    	return "redirect:/admin/report/reportList";
    }

    @GetMapping("/report/reportList")
    public String getReportList(Model model) {
    	log.info("/admin/reportList getReportList ReportController.java");
    	List<Report> reportList = reportService.getReportList();
    	
    	model.addAttribute("title", "신고목록");
		model.addAttribute("reportList", reportList);

    	return "admin/report/reportList";
    }
  
 
}
