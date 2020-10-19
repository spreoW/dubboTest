package user.provider.impl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Service;
import service.UserService;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....3");
		UserAddress address1 = new UserAddress(1,"余杭","1","张三","123456","Y");
		UserAddress address2 = new UserAddress(2,"江干","1","李四","56789","N");
		return Arrays.asList(address1,address2);
	}
}
