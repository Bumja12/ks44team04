package ks44team04.service;

import ks44team04.mapper.ReportMapper;
import ks44team04.dto.Report;
import ks44team04.dto.UserSuspend;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ReportService {
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

    //신고 리스트 
    public List<Report> getReportList(){
    	List<Report> reportList = reportMapper.getReportList();
    	log.info("신고리스트");
    	
		return reportList;
	}
    
    //신고 등록 코드 증가 
    public String getReportHistoryCode() {
    	String reportHistoryCode = reportMapper.getReportHistoryCode();
    	return reportHistoryCode;
    }
    
    //정지 리스트 
    public List<UserSuspend> getuserSuspendList(){
    	
    	List<UserSuspend> userSuspendList = reportMapper.getUserSuspendList();
    	
    	log.info("정지리스트");
    	
    	return userSuspendList;
    }

}
