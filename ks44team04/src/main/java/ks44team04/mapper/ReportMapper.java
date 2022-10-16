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
	
	/*~~~~~~~~~~~~~~~ 신고 ~~~~~~~~~~~~~~~ */
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
    
    
    /*~~~~~~~~~~~~~~~ 정지 ~~~~~~~~~~~~~~~ */
    //정지 리스트
    public List<UserSuspend> getUserSuspendList();
    
    //벌점 정지 리스트 조회 
    public UserSuspend SuspendUpList(String userSuspendCode);
    
    //정지 검색 
    public List<UserSuspend> getSuspendSearch(Map<String, Object> searchMap);
    
    //정지 등록
    public int suspendAdd(UserSuspend userSuspend);
    
    //정지 일수 업데이트
    public int suspendDayUp(UserSuspend userSuspend);
    
    //정지 등록 코드 증가
    public String getUserSuspendCods();
    
    //정지 등록시 필요한 유저 아이디 / 닉네임 값 가져오기 
    public List<User> userList();
    
    // 유저 벌점 업데이트 
    public int reportUserUp(User user);
    
    // 정지 리스트 수정 
    public int suspendListUp(UserSuspend userSuspend);
    
    
    /*~~~~~~~~~~~~~~~ 벌점  ~~~~~~~~~~~~~~~ */
    //벌점 기준 목록
    public List<ReportRule> reportRuleList();
    
    //벌점 기준  검색 
    public List<ReportRule> ruleListSaerch(Map<String, Object> searchMap);
    
    //벌점 기준 목록 등록 
    public int reportRuleAdd(ReportRule reportRule);
    
    //벌점 기준 등록 코드 증가 
    public String reportRuleCode();
    
    //벌점 기준 등록 삭제
    public int reportRuleDelete(ReportRule reportRule);
    
    //벌점 기준 수정 
    public int reportRuleUp(ReportRule reportRule);
    
    //벌점 기준 특정 목록 조회 
     public ReportRule reportRuleUpList(String reportCode);
}
