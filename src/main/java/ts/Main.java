package ts;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ts.dao.UserDao;
import ts.dao.UserDaoImpl;
import ts.domain.User;

public class Main {

	public static void main (String [] args){
		
		final Logger logger = LoggerFactory.getLogger(Main.class);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User user = new User();
		user.setEmail("student@fh-hof.de");
		user.setPassword("password");
		user.setRegDate(new Date());
		
		UserDao userDao = (UserDao) context.getBean("userDao");
		
		userDao.createUser(user);
		List<User> uList = userDao.listUser();
		
		for (User a : uList) {
            System.out.println(a.getUserId() + ":" + a.getEmail() + ":" + a.getPassword() + ":" + a.getRegDate());
            
            //userDao.deleteUser(a);
            //System.out.println("User " + a.getEmail() + " is removed");
            
            
		}
	}
}
