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
    public Report getReportHistoryCode(String reportHistoryCode) {
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
    
    //정지 등록
    public void suspendAdd(UserSuspend userSuspend) {
 	   int result = reportMapper.suspendAdd(userSuspend);
 	   log.info("정지 등록:" + result);
 	   }
    
    //정지 등록 코드 증가
    public String getUserSuspendCode() {
    	String UserSuspendCode = reportMapper.getUserSuspendCods();
    	return UserSuspendCode;
    
    }
    
    //정지 일수 업데이트
    public void suspendDayUp(UserSuspend userSuspend) {
    	reportMapper.suspendDayUp(userSuspend);
    }
    
    //정지 검색
    public List<UserSuspend> getSuspendSearch(Map<String, Object> paramMap){
    	List<UserSuspend> SuspendList = reportMapper.getSuspendSearch(paramMap);
    	return SuspendList;
    }
    
    //정지 등록시 필요한 유저 아이디 / 닉네임 값 가져오기 
    public List<User> userList(){
    	List<User> userList = reportMapper.userList(); 
    	
    	return userList;
    }
    //정지 리스트 수정 
    public void suspendListUp(UserSuspend userSuspend) {
    	reportMapper.suspendListUp(userSuspend);
    }
    	
    // 특정 시간 마다 확인 후 정지 해제
    public void unStopping(List<UserSuspend> userSuspendUpdateList) {
    	int result = reportMapper.unstopping(userSuspendUpdateList);
    	if(result > 0) reportMapper.suspendUserUpdate(userSuspendUpdateList);
    }
    // 정지 해제 목록조회 
    public List<UserSuspend> getUserSuspendUpdateList (){
    	List<UserSuspend> userSuspendUpdateList = reportMapper.getUserSuspendUpdateList();
    	return userSuspendUpdateList;
    }
    
    //정지 업데이트시 유저 상태 정지로 업데이트  
    public void reportUserUp(User user) {
    	reportMapper.reportUserUp(user);
    }
    
    
    
    //특정 벌점 기준 목록 
    public UserSuspend SuspendUpList(String userSuspendCode){
    	UserSuspend userSuspend = reportMapper.SuspendUpList(userSuspendCode);
 	   
 	   return userSuspend;
    }
    
   
    //벌점 기준 목록
    public List<ReportRule> reportRuleList(){
    	List<ReportRule> reportRuleList = reportMapper.reportRuleList();
    	return reportRuleList;
    }
    
    //벌검 기준 목록 검색
    public List<ReportRule> ruleListSaerch(Map<String, Object> paramMap){
    	List<ReportRule> RuleList = reportMapper.ruleListSaerch(paramMap);
    	return RuleList;
    }
    
    //벌점 기준 목롞 등록
    public void reportRuleAdd(ReportRule reportRule) {
    	int result = reportMapper.reportRuleAdd(reportRule);
    	log.info("벌점 기준 목록 등록:" + result);
    }
    
    //벌점 기준 목록 코드 증가 
    public String reportRuleCode() {
    	String reportRuleCode = reportMapper.reportRuleCode();
    	
    	return reportRuleCode;
    }
    
    //벌점 기준 목록 삭제 
    public void reportRuleDelete(ReportRule reportRule) {
    	int result = reportMapper.reportRuleDelete(reportRule);
    	log.info("벌점 기준 목록 삭제:" + result);
    }
    
    //벌점 기준 목록 수정 
   public void reportRuleUp(ReportRule reportRule) {
	   reportMapper.reportRuleUp(reportRule);
   }
   
   //특정 벌점 기준 목록 
   public ReportRule reportRuleUpList(String reportCode){
	   ReportRule reportRule = reportMapper.reportRuleUpList(reportCode);
	   
	   return reportRule;
	   
   }
 
    
}
