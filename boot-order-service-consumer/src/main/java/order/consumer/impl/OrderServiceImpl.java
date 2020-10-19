package order.consumer.impl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author w
 * @date 2020/10/12
 */

@Service
public class OrderServiceImpl implements OrderService {

//  dubbo直连  @Reference(url = "127.0.0.1:20880")
    @Reference(loadbalance = "roundrobin")
    UserService userService;

    @HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }

    public List<UserAddress> hello(String userId) {
        return Arrays.asList(new UserAddress(1,"测试","测试","测试","测试","测试"));
    }
}
