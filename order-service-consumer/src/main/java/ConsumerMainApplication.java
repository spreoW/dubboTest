import bean.UserAddress;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

import java.io.IOException;
import java.util.List;

/**
 * @author w
 * @date 2020/10/1
 */
public class ConsumerMainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService contextBean = context.getBean(OrderService.class);
        List<UserAddress> userAddresses = contextBean.initOrder("1");
        System.in.read();
    }
}
