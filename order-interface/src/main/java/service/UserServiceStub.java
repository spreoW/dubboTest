package service;

import bean.UserAddress;

import java.util.List;

/**
 * @author wangquan
 * @date 2020/10/13
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub.....");
        if (userId != null && !"".equals(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
