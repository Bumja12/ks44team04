package ks44team04.mapper;

import ks44team04.dto.RegularPostHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RegularPostMapper {

    public List<RegularPostHistory> getRegularPostHistory(String userId);

    public void setOrderDetailStatus(@Param(value = "orderDetailCode") String orderDetailCode,
                                     @Param(value = "orderStatus") String orderStatus);

}
