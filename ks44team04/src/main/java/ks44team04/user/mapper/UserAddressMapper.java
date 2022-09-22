package ks44team04.user.mapper;

import ks44team04.dto.AddressList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserAddressMapper {

    public List<AddressList> getAddressList(Map addressInfo);

    public String getAddressListCode();

    public void addressRegister(AddressList userAddress);

    public void addressModify(AddressList addressList);
    
    
}
