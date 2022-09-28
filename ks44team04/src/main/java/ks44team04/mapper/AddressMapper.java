package ks44team04.mapper;

import ks44team04.dto.AddressList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AddressMapper {



    public List<AddressList> getAddressList(Map<String, String> addressInfo);

    public String getAddressListCode();

    public void addressRegister(AddressList userAddress);

    public void addressModify(AddressList addressList);

    public void addressDelete(String addressList);
    
    
}
