package ks44team04.admin.mapper;

import ks44team04.dto.Report;
import ks44team04.dto.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public String userLogin(String userId);
    public User getLoginUserInfo(String userId);
    
    //신고 리스트
    public List<Report> getReportList();
    
   
}
