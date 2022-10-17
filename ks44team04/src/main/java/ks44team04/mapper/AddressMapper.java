package ks44team04.mapper;

import ks44team04.dto.AddressList;
import ks44team04.dto.PostInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AddressMapper {

    List<AddressList> getAddressList(Map<String, String> addressInfo);

    String getAddressListCode();

    void addressRegister(AddressList userAddress);

    void addressModify(AddressList addressList);

    void addressDelete(String addressList);

    PostInfo getPostInfo(String postInfo);

    void setPostInfo(PostInfo postInfo);

}
