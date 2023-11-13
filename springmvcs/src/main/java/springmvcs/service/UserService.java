package springmvcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvcs.controller.model.User;
import springmvcs.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	public int createUser(User user)
	{
		return this.userDao.insert(user);
	}
}
