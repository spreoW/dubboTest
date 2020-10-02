package service.impl;

import bean.UserAddress;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 * @author w
 * @date 2020/10/12
 */
public class OrderServiceImpl implements OrderService {

    UserService userService;
    @Override
    public void initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }
}
