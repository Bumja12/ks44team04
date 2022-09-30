package ks44team04.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.mapper.PointMapper;
import ks44team04.dto.PointDeal;
import org.springframework.transaction.annotation.Transactional;

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

	public List<PointDeal> pointHistory() {

		List<PointDeal> pointHistory = pointMapper.pointHistory();

		return pointHistory;

	}

	public int getUserPoint(String userId) {
		return pointMapper.getUserPoint(userId);
	}

}
