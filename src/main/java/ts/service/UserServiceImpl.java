package ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ts.dao.UserDao;
import ts.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void createUser(User user) {
		userDao.createUser(user);

	}

	@Transactional
	public User readUser(Long userId) {
		return userDao.readUser(userId);
	}

	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);

	}

	@Transactional
	public void deleteUser(User user) {
		userDao.deleteUser(user);

	}

	@Transactional
	public List<User> listUser() {
		return userDao.listUser();
		
	}

}
