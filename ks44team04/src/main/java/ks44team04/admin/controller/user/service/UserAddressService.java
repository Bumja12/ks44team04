package ks44team04.admin.controller.user.service;

import ks44team04.admin.controller.user.mapper.UserAddressMapper;
import ks44team04.dto.AddressList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserAddressService {

    private final UserAddressMapper userAddressMapper;

    public UserAddressService(UserAddressMapper userAddressMapper) {
        this.userAddressMapper = userAddressMapper;
    }

    public List<AddressList> getAddressList(String userId) {
        List<AddressList> addressList = userAddressMapper.getAddressList(userId);
        return addressList;
    }

    public String getAddressListCode() {
        String addressListCode = userAddressMapper.getAddressListCode();
        return addressListCode;
    }

    public void addressRegister(AddressList addressList) {
        userAddressMapper.addressRegister(addressList);
    }


}
