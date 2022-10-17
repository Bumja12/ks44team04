package ks44team04.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks44team04.mapper.AlertMapper;
import ks44team04.dto.Alert;
import ks44team04.dto.AlertSend;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.Right;
import ks44team04.dto.User;

@Service
public class AlertService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	private final AlertMapper alertMapper;
	public AlertService(AlertMapper alertMapper) {
		this.alertMapper = alertMapper;
	}
	
    //알림 등록
    public void addAlert(Alert alert) {
    	int addAlertResult = alertMapper.addAlert(alert);
    	System.out.println("회원가입 결과:" + addAlertResult);
    }
    
	//알림 코드 증가
	public String getAlertNewCode() {
		String alertNewCode = alertMapper.getAlertNewCode();
		return alertNewCode;
	}
	
	//알림 전송내역 조회
	public List<AlertSend> getAlertSendList() {
		List<AlertSend> alertSendList = alertMapper.getAlertSendList();
		return alertSendList;
	}
	
    //알림 목록 조회
    public List<Alert> getAlertList() {
    	List<Alert> alertList = alertMapper.getAlertList();
    	
    	if(alertList != null) {
			for(Alert alert : alertList) {
				String modifyId = alert.getModifyId();
				String modifyDate = alert.getModifyDate();
				
				if(modifyId == null) {
					alert.setModifyId("-");
				}
				if(modifyDate == null) {
					alert.setModifyDate("-");
				}
			}
		}
    	return alertList;
    }
	
}
