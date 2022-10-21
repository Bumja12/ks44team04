package ks44team04.service;

import ks44team04.dto.PointDeal;
import ks44team04.dto.PointDetail;
import ks44team04.dto.User;
import ks44team04.mapper.PointMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PointService {

	private final Logger log = LoggerFactory.getLogger(getClass());
	private final PointMapper pointMapper;

	public PointService(PointMapper pointMapper) {
		this.pointMapper = pointMapper;
	}

	@PostConstruct
	public void pointService() {
		log.info("PointService bean 생성");
	}

	public List<PointDeal> searchPointHistory(Map<String, Object> searchMap){

		List<PointDeal> pointHistory = pointMapper.searchPointHistory(searchMap);

		return pointHistory;

	}

	//전체회원 포인트조회
	public List<User> searchUserList(Map<String, Object> searchMap){

		List<User> userList = pointMapper.searchUserList(searchMap);

		if(userList != null) {
			for(User user : userList) {

				String userLevel = user.getUserLevel();

				if(userLevel != null) {
					String lvName = userLevel.substring(userLevel.length() - 2);

					if(userLevel.contains("Buyer")) {
						if(lvName.equals("01")) {
							user.setUserLevelName("씨앗");
						}else if(lvName.equals("02")) {
							user.setUserLevelName("새싹");
						}else if(lvName.equals("03")) {
							user.setUserLevelName("잎새");
						}else if(lvName.equals("04")) {
							user.setUserLevelName("열매");
						}
					}else if(userLevel.contains("Seller")) {
						if(lvName.equals("01")) {
							user.setUserLevelName("물방울");
						}else if(lvName.equals("02")) {
							user.setUserLevelName("시냇물");
						}else if(lvName.equals("03")) {
							user.setUserLevelName("호수");
						}else if(lvName.equals("04")) {
							user.setUserLevelName("강");
						}
					}
				}else {
					user.setUserLevelName("-");
				}
				log.info("user.getUserLevelName(), {}", user.getUserLevelName());
			}
		}

		return userList;
	}

	public List<PointDeal> pointHistory() {

		List<PointDeal> pointHistory = pointMapper.pointHistory();

		return pointHistory;
	}

	public int getUserPoint(String userId) {
		return pointMapper.getUserPoint(userId);
	}

	public String addPointDeal(PointDeal pointDeal) {
		pointMapper.addPointDeal(pointDeal);
		return pointDeal.getPointDealId();
	}
	public void addPointDetailPlus(PointDetail pointDetail) {
		pointMapper.addPointDetailPlus(pointDetail);
	}
	public void addPointDetailMinus(String dealId) {
		pointMapper.addPointDetailMinus(dealId);
	}

}
