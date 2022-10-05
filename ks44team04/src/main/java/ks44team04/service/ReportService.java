package ks44team04.service;

import ks44team04.mapper.ReportMapper;
import ks44team04.dto.Report;
import ks44team04.dto.ReportRule;
import ks44team04.dto.User;
import ks44team04.dto.UserSuspend;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ReportService {
	//의존성 주입
	 private final ReportMapper	reportMapper;
	 
	private static final Logger log = LoggerFactory.getLogger(ReportService.class);

    public ReportService(ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }
    
    //신고하기
    public void setReport(Report report) {
    	   int result = reportMapper.setReport(report);
    	   log.info("신고 결과:" + result);
    }
    
    //신고 처리
    public void reportProcessing(Report report) {
    	reportMapper.reportProcessing(report);
    }
    
    //유저 벌점 업데이트 
    public void reportPoint(User user) {
    	reportMapper.reportPoint(user);
    }
    
    
    //특정 신고 리스트 가져오기 
    public Report getReportHostryCode(String reportHistoryCode) {
    	Report report = reportMapper.getReportHostryCode(reportHistoryCode);
    	return report;
    }

    //신고 리스트 
    public List<Report> getReportList(){
    	List<Report> reportList = reportMapper.getReportList();
    	log.info("신고리스트");
    	
		return reportList;
	}
    
    //신고 검색
    public List<Report> getReportSearch(Map<String, Object> paramMap){
    	List<Report> reportList = reportMapper.getReportSearch(paramMap);
    	return reportList;
    }
    
    
    //신고 등록 코드 증가 
    public String getHistoryCode() {
    	String HistoryCode = reportMapper.getHistoryCode();
    	return HistoryCode;
    }
    
    
    //정지 리스트 
    public List<UserSuspend> getuserSuspendList(){
    	
    	List<UserSuspend> userSuspendList = reportMapper.getUserSuspendList();
    	
    	log.info("정지리스트");
    	
    	return userSuspendList;
    }

    //정지 검색
    public List<UserSuspend> getSuspendSearch(Map<String, Object> paramMap){
    	List<UserSuspend> SuspendList = reportMapper.getSuspendSearch(paramMap);
    	return SuspendList;
    }
    
    //벌점 기준 목록
    public List<ReportRule> reportRuleList(){
    	List<ReportRule> reportRuleList = reportMapper.reportRuleList();
    	return reportRuleList;
    }
    
}
