package ks44team04.user.mapper;

import ks44team04.dto.AddressList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserAddressMapper {

    public List<AddressList> getAddressList(String userId);

    public String getAddressListCode();

    public void addressRegister(AddressList addressList);
}
