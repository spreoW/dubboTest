package service;

import bean.UserAddress;

import java.util.List;

/**
 * @author w
 * @date 2020/10/1
 */
public interface OrderService {

    /**
     *
     * @param userId
     * @return
     */
    List<UserAddress> initOrder(String userId);
}
