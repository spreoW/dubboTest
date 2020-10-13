package service.impl;

import bean.UserAddress;
import service.UserService;

import java.util.Arrays;
import java.util.List;


public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("开始");
		System.out.println("UserServiceImpl......old");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UserAddress address1 = new UserAddress(1,"余杭","1","鱼鱼","123456","Y");
		UserAddress address2 = new UserAddress(2,"江干","1","心心","56789","N");
		return Arrays.asList(address1,address2);
	}
}
