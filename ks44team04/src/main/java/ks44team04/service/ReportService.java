package ks44team04.service;

import ks44team04.mapper.ReportMapper;
import ks44team04.dto.Report;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ReportService {

    private final ReportMapper	reportMapper;
    
    public ReportService(ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }
    
    //신고하기
    public void setReport(Report report) {
    	   int result = reportMapper.setReport(report);
           System.out.println("신고 결과:" + result);
    }

    //신고 리스트 
    public List<Report> getReportList(){
    	List<Report> reportList = reportMapper.getReportList();
    	System.out.println("신고리스트");
		return reportList;
	}

}
