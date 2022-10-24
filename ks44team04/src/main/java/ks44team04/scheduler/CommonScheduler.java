package ks44team04.scheduler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import ks44team04.dto.UserSuspend;
import ks44team04.service.ReportService;
import ks44team04.service.UserService;

@Component
public class CommonScheduler {
	
	
	private static final Logger log = LoggerFactory.getLogger(CommonScheduler.class);

	
	private final ReportService reportService;
	private final UserService userService;
	
	public CommonScheduler(ReportService reportService, UserService userService) {
		this.reportService = reportService;
		this.userService = userService;
	}
	
	// 특정 시간에 정지 날짜 비교후 해제 
	@Scheduled(cron = " 0 1 0 * * *")
	public void suspendDay() {
		//1. 목록
		List<UserSuspend> userSuspendUpdateList = reportService.getUserSuspendUpdateList();
		log.info("해제 리스트 확인 : {}", userSuspendUpdateList);
		if(userSuspendUpdateList != null && userSuspendUpdateList.size() > 0){
			//2. 업데이트(신고 상태 업데이트),업데이트(회원상태 업데이트)
			reportService.unStopping(userSuspendUpdateList);
		}
	}
	
    // 10/17 휴면 처리 (1.회원상태 '휴면'으로 / 2.휴면 테이블에 insert)
    @Scheduled(cron = "0 0 0 * * *")
	public void dormantProcess() {
    	//휴면 대상 아이디 List
		List<String> userIds = userService.getDormantId();
		log.info("휴면 대상 아이디 List : {}", userIds);
		
		for(String userId : userIds) {
			// tb_user - user_status '휴면'으로 update
			userService.normalToDormant(userId);
			// tb_dormant에 insert
			userService.insertDormant(userId);
		}
	}
    
    // 10/23 구매자/판매자 등급관리
    /*
    @Scheduled(cron = "0 0 0 * * *")
    public void levelAccum() {
    	//관리 대상 아이디 List
    	List<String> buyerTotalList = userService.buyerTotalList();
    	
    	for(String buyerId : buyerTotalList) {
    		userService.buyerTotal(buyerId);
    	}
    }
    */
    
}
