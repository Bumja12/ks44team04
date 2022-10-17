package ks44team04.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.Alert;
import ks44team04.dto.AlertSend;

@Mapper
public interface AlertMapper {
	
	//알림 등록
	public int addAlert(Alert alert);
	
	//마지막 알림코드
	public String getAlertNewCode();
	
	//알림 전송내역 조회
	public List<AlertSend> getAlertSendList();
	
	//알림 목록 조회
	public List<Alert> getAlertList();
	
}
