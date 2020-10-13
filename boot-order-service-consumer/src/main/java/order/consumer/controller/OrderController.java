package order.consumer.controller;

import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.OrderService;

import java.util.List;

/**
 * @author wangquan
 * @date 2020/10/2
 */

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("initOrder")
    public List<UserAddress> initOrder(@RequestParam("userId") String userid){
        return orderService.initOrder(userid);
    }
}
