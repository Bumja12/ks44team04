package ks44team04.admin.controller;

import ks44team04.admin.service.ReportService;
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
    private final Logger log = LoggerFactory.getLogger(getClass());

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }
    
    @PostMapping("/report/report")
    public String report(Report report){
    	reportService.report(report);
    
    	return "redirect:/admin/report/reportList";
    }
    
    @GetMapping("/report/report")
    public String getReport(Model model) {
    	log.info("/admin/repor getReport ReportController.java");
    	List<Report> reportList = reportService.getReportList();
    	
    	model.addAttribute("title", "신고하기");
		model.addAttribute("reportList", reportList);
    	return "/admin/report/report";
    }

    @GetMapping("/report/reportList")
    public String getReportList(Model model) {
    	log.info("/admin/reportList getReportList ReportController.java");
    	List<Report> reportList = reportService.getReportList();
    	
    	model.addAttribute("title", "신고목록");
		model.addAttribute("reportList", reportList);

    	return "/admin/report/reportList";
    }
  
}
