package ks44team04.admin.controller;

import ks44team04.service.ReportService;
import ks44team04.util.CodeIndex;
import ks44team04.dto.Report;
import ks44team04.dto.ReportRule;
import ks44team04.dto.User;
import ks44team04.dto.UserSuspend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
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
	 * getreportProcessing(Report report) {
	 * 
	 * reportService.getReportHostryCode(reportHistoryCode);
	 * 
	 * return "redirect:/admin/report/reportList"; }
	 */
	

	
	//상세 처리  
	@PostMapping("/report/reportParticulars")
	public String reportParticulars(@RequestParam(value = "reportResult" , required = false) String reportResult, 
										@RequestParam(value = "penaltyPoint", required = false) int penaltyPoint, 
										@RequestParam(value = "totalPenaltyPoint" , required = false) int totalPenaltyPoint, Report report , User user) {
											
			
		log.info("reportResult ::::::::::: {}",reportResult);
		log.info("penaltyPoint ::::::::::: {}",penaltyPoint);
		log.info("totalPenaltyPoint ::::::::::: {}",totalPenaltyPoint);
		
		reportService.reportProcessing(report);
		reportService.reportPoint(user);
		
		return "redirect:/admin/report/reportList";
	}
	
	//상세 처리  
	@GetMapping("/report/reportParticulars")
	public String reportParticulars(@RequestParam(value = "reportHistoryCode" , required = false) String
            reportHistoryCode, Report report, Model model) {
		
		//특정 신고목록
		Report Report = reportService.getReportHistoryCode(reportHistoryCode);
		model.addAttribute("titel", "신고상세수정");
		model.addAttribute("Report", Report);
		
		
		return "admin/report/reportParticulars";
	}
	
	//신고 처리  
	@PostMapping("/report/reportProcessing")
	public String getreportProcessing(@RequestParam(value = "reportResult" , required = false) String reportResult, 
										@RequestParam(value = "penaltyPoint", required = false) int penaltyPoint, 
										@RequestParam(value = "totalPenaltyPoint" , required = false) int totalPenaltyPoint, Report report, User user) {
											
			
		log.info("reportResult ::::::::::: {}",reportResult);
		log.info("penaltyPoint ::::::::::: {}",penaltyPoint);
		log.info("totalPenaltyPoint ::::::::::: {}",totalPenaltyPoint);
		
		
		reportService.reportProcessing(report);
		reportService.reportPoint(user);
		
		return "redirect:/admin/report/reportList";
	}
	
	//신고 처리
	@GetMapping("/report/reportProcessing")
	public String getreportProcessing(@RequestParam(value = "reportHistoryCode" , required = false) String
            reportHistoryCode, Report report ,Model model) {
		
		//특정 신고목록
		Report Report = reportService.getReportHistoryCode(reportHistoryCode);
		
		model.addAttribute("titel", "신고처리");
		model.addAttribute("Report", Report);
		
		return "admin/report/reportProcessing";
	}
	
	// 신고등록
	@GetMapping("/report/report")
	public String getReport(Report report) {

		String repoterId = "buyer01";
		String HistoryCode = reportService.getHistoryCode();
		HistoryCode = CodeIndex.codeIndex(HistoryCode, 15);
		log.info("---------------------------------사용자가 입력한 정보", report);
		report.setReportHistoryCode(HistoryCode);
		report.setReportingId(repoterId);
		reportService.setReport(report);
		log.info("---------------------------------, {}", HistoryCode);

		/* model.addAttribute("title", "신고하기"); */
		/* model.addAttribute("reportList", reportList); */
		return "redirect:/admin/report/reportList";
	}
	
	//신고 리스트 검색 
	@PostMapping("/report/reportList")
	public String getReportSearch(@RequestParam(name="reportSearchKey")String sk 
								 ,@RequestParam(name="reportSearchValue")String sv
								 ,@RequestParam(name="fromDate", required = false, defaultValue="") String fromDate
								 ,@RequestParam(name="toDate", required = false, defaultValue= "") String toDate
								 , Model model) {
		if("reportHistoryCode".equals(sk)) {
			sk= "report_history_code";
		}else if("reportedId".equals(sk)) {
			sk= "reported_id";
		}else if("reportApproveId".equals(sk)) {
			sk= "report_approve_id";
		}else if("reportResult".equals(sk)) {
			sk= "report_result";
		}else if("reportReason".equals(sk)) {
			sk= "report_reason";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sk", sk);
		paramMap.put("sv", sv);
		paramMap.put("fd", fromDate);
		paramMap.put("td", toDate);
		
		List<Report> reportList = reportService.getReportSearch(paramMap);
	
		model.addAttribute("title", "신고목록조회");
		model.addAttribute("reportList", reportList);
		
		return "admin/report/reportList";
	}
	

	
	// 신고리스트
	@GetMapping("/report/reportList")
	public String getReportList(Model model) {
		log.info("/admin/reportList getReportList ReportController.java");
		List<Report> reportList = reportService.getReportSearch(null);
		log.info("신고목록  :::: {}", reportList);
		model.addAttribute("title", "신고목록");
		model.addAttribute("reportList", reportList);

		return "admin/report/reportList";
	}
	
	//정지 등록 (관리자)
	@PostMapping("/report/suspandAdd")
	public String suspendAdd(UserSuspend userSuspend, User user) {
		
		String getUserSuspendCods = reportService.getUserSuspendCode();
		getUserSuspendCods = CodeIndex.codeIndex(getUserSuspendCods, 13);
		
		userSuspend.setUserSuspendCode(getUserSuspendCods);
		reportService.suspendAdd(userSuspend);
		
		//정지 일수 업데이트
		reportService.suspendDayUp(userSuspend);
		
		//정지 유저 상태 업데이트
		reportService.reportUserUp(user);
		return "redirect:/admin/report/userSuspendList";
	}
	
	//정지 리스트 검색 
	@PostMapping("/report/userSuspendList")
	public String getSuspendSearch(@RequestParam(name="reportSearchKey")String sk 
								  ,@RequestParam(name="reportSearchValue", required = false, defaultValue="")String sv
								  ,@RequestParam(name="SearchKey", required = false, defaultValue="")String dk
								  ,@RequestParam(name="fromDate", required = false, defaultValue="") String fromDate
								  ,@RequestParam(name="toDate", required = false, defaultValue= "") String toDate
								  ,Model model) {
		if("userSuspendCode".equals(sk)) {
			sk= "user_suspend_code";
		}else if("suspendId".equals(sk)) {
			sk= "suspend_id";
		}else if("approveId".equals(sk)) {
			sk= "approve_id";
		}else if("suspendResult".equals(sk)) {
			sk= "suspend_result";
		}
		
		
		if("startSuspend".equals(dk)) {
			dk= "start_suspend";
		}else if("endSuspend".equals(dk)) {
			dk= "end_suspend";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sk", sk);
		paramMap.put("sv", sv);
		paramMap.put("dk", dk);
		paramMap.put("fd", fromDate);
		paramMap.put("td", toDate);
		
		System.out.println(paramMap);
		
		List<UserSuspend> userSuspendList = reportService.getSuspendSearch(paramMap);
	
		model.addAttribute("title", "정정 조회");
		model.addAttribute("userSuspendList", userSuspendList);
		
		return "admin/report/userSuspendList";
	}
	
	// 정지리스트
	@GetMapping("/report/userSuspendList")
	public String getUserSuspendList(Model model) {
		
		  List<UserSuspend> userSuspendList = reportService.getSuspendSearch(null);
		  log.info("/admin/report/suspendList userSuspendList ReportController.java");
		//정지 등록시 필요한 유저 아이디 / 닉네임 값 가져오기 
		  List<User> userList = reportService.userList();
		 
		  
		  model.addAttribute("title", "정지목록");
		  model.addAttribute("userList", userList);
		  model.addAttribute("userSuspendList", userSuspendList);
		

		return "admin/report/userSuspendList";
	}
	
	//특정 정지 목록
	@GetMapping("/report/userSuspendListUp")
	public String suspendListUp(@RequestParam(value = "userSuspendCode" , required = false) String userSuspendCode, Model model) {
		
		UserSuspend userSuspend = reportService.SuspendUpList(userSuspendCode);
		log.info("::::::::::::::::{}" , userSuspendCode);
		model.addAttribute("title", "특정 정지 목록");
		model.addAttribute("userSuspend", userSuspend);

		
		return "admin/report/userSuspendListUp";
	}
	
	//특정 정지 목록 수정
	@PostMapping("/report/userSuspendListUp")
	public String suspendUp(UserSuspend userSuspend) {
		
		reportService.suspendListUp(userSuspend);
		
		return "redirect:/admin/report/userSuspendList";
	}
	
	// 벌점 기준 목록
	@GetMapping("/report/reportRuleList")
	public String reportRuleList(Model model) {
		
		List<ReportRule> reportRuleList = reportService.reportRuleList();
		model.addAttribute("title", "벌점 기준 목록");
		model.addAttribute("reportRuleList", reportRuleList);
		
		return "admin/report/reportRuleList";
	}
	
	//벌점 기준 목록 검색
	@PostMapping("/report/reportRuleList")
	public String ruleListSaerch(@RequestParam(name="reportSearchKey")String sk 
								 ,@RequestParam(name="reportSearchValue", required = false, defaultValue="")String sv
								 ,@RequestParam(name="fromDate", required = false, defaultValue="") String fromDate
								 ,@RequestParam(name="toDate", required = false, defaultValue= "") String toDate
								 ,Model model){
		
		if("reportCode".equals(sk)) {
			sk= "report_code";
		}else if("reportReason".equals(sk)) {
			sk= "report_reason";
		}else if("userId".equals(sk)) {
			sk= "user_id";
		}else if("penaltyPoint".equals(sk)) {
			sk= "penalty_point";
		}
		
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sk", sk);
		paramMap.put("sv", sv);
		paramMap.put("fd", fromDate);
		paramMap.put("td", toDate);
		
		System.out.println(paramMap);
		
		List<ReportRule> reportRuleList = reportService.ruleListSaerch(paramMap);
	
		model.addAttribute("title", "벌점 기준 목록 검색");
		model.addAttribute("reportRuleList", reportRuleList);
		
		return "admin/report/reportRuleList";
	}
	
	//벌점 기준 목록 등록 
	@GetMapping("/report/reportRuleAdd")
	public String reportRuleAdd(ReportRule reportRule) {
		
			String reportRuleCode = reportService.reportRuleCode();
			reportRuleCode = CodeIndex.codeIndex(reportRuleCode, 14);
			
			reportRule.setReportCode(reportRuleCode);
			reportService.reportRuleAdd(reportRule);
			
		return "redirect:/admin/report/reportRuleList";
	}
	
	//벌점 기준 목록 삭제
	@GetMapping("/report/reportRuleDelete")
	public String reportRuleDelete(ReportRule reportRule) {
		
		reportService.reportRuleDelete(reportRule);
		
		return "redirect:/admin/report/reportRuleList";
	}
	
	//벌점 기준 특정 목록 조회 
	@GetMapping("/report/ruleUpList")
	public String reportRuleUpList(@RequestParam(value = "reportCode" , required = false) String
			reportCode, Model model ) {
		
		ReportRule reportRule = reportService.reportRuleUpList(reportCode);
		log.info("::::::::::::::::{}" , reportCode);
		model.addAttribute("title", "특정 벌점 기준 목록");
		model.addAttribute("reportRule", reportRule);

		
		return "admin/report/ruleUpList";
	}
	
	//벌점 기준목록 수정 
	@PostMapping("/report/ruleUp")
	public String ruleUp(ReportRule reportRule) {
		
		reportService.reportRuleUp(reportRule);
		
		return "redirect:/admin/report/reportRuleList";
	}
	
}
