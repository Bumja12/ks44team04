package ks44team04.admin.mapper;

import ks44team04.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public String userLogin(String userId);
    public User getLoginUserInfo(String userId);
}
