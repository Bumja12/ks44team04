package ks44team04.mapper;

import ks44team04.dto.Report;
import ks44team04.dto.ReportRule;
import ks44team04.dto.User;
import ks44team04.dto.UserSuspend;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ReportMapper {

    //신고 리스트
    public List<Report> getReportList();
    
    //신고 하기 
    public int setReport(Report report);
    
    //신고등록 코드 증가 
    public String getHistoryCode();
    
    //특정 신고리스트 
    public Report getReportHostryCode(String reportHistoryCode);
    
    //신고 처리 
    public int reportProcessing(Report report);
    
    // 유저 벌점 업데이트 
    public int reportPoint(User user);
    
    //신고 검색 
    public List<Report> getReportSearch(Map<String, Object> searchMap);
    
    //정지 리스트
    public List<UserSuspend> getUserSuspendList();
    
    //정지 검색 
    public List<UserSuspend> getSuspendSearch(Map<String, Object> searchMap);
    
    //정지 등록
    public int suspendAdd(UserSuspend userSuspend);
    
    //정지 일수 업데이트
    public int suspendDayUp(UserSuspend userSuspend);
    
    //정지 등록 코드 증가
    public String getUserSuspendCods();
    
    //벌점 기준 목록
    public List<ReportRule> reportRuleList();
    
    //정지 등록시 필요한 유저 아이디 / 닉네임 값 가져오기 
    public List<User> userList();

}
