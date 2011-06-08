package ts.service;

import java.util.List;

import ts.domain.User;

public interface UserService {
	
	public void createUser(User user);
	
	public User readUser(Long userId);
	
	public void updateUser(User user);
	
	public void deleteUser(User user);
	
	public List<User> listUser();

}
