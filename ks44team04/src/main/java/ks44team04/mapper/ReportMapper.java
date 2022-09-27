package ks44team04.mapper;

import ks44team04.dto.Report;
import ks44team04.dto.ReportCategory;
import ks44team04.dto.ReportRule;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportMapper {


    //신고 리스트
    public List<Report> getReportList();
    
    //신고 하기 
    public int setReport(Report report);
    
    //신고등록 코드 증가 
    public String getReportHistoryCode();
    
    //신고 카테고리 조회
    public List<ReportCategory> getReportCategory();
    
    //신고대상코드 조회
    public List<ReportRule> getReportRule();
}
