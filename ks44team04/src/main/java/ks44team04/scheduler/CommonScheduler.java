package ks44team04.scheduler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import ks44team04.dto.UserSuspend;
import ks44team04.service.ReportService;

@Component
public class CommonScheduler {
	
	
	private static final Logger log = LoggerFactory.getLogger(CommonScheduler.class);

	
	private final ReportService reportService;
	
	public CommonScheduler(ReportService reportService) {
		this.reportService = reportService;
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

}
