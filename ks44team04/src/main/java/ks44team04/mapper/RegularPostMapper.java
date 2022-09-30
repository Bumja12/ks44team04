package ks44team04.mapper;

import ks44team04.dto.RegularPostHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RegularPostMapper {

    public List<RegularPostHistory> getRegularPostHistory(String userId);

    public void setOrderDetailStatus(Map<String, String> orderProcess);

}
