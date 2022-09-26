package ks44team04.service;

import ks44team04.mapper.UserAddressMapper;
import ks44team04.dto.AddressList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserAddressService {

    private final UserAddressMapper userAddressMapper;

    public UserAddressService(UserAddressMapper userAddressMapper) {
        this.userAddressMapper = userAddressMapper;
    }

    public List<AddressList> getAddressList(Map addressInfo) {
        List<AddressList> addressLists = userAddressMapper.getAddressList(addressInfo);
        return addressLists;
    }

    public String getAddressListCode() {
        String addressListCode = userAddressMapper.getAddressListCode();
        return addressListCode;
    }

    public void addressRegister(AddressList addressList) {
        userAddressMapper.addressRegister(addressList);
    }

    public void addressModify(AddressList addressList) {
        userAddressMapper.addressModify(addressList);
    }

    public void addressDelete(String addressList) {
        userAddressMapper.addressDelete(addressList);
    }


}
