package ts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import ts.dao.UserDao;
import ts.domain.User;

public class TestDAO {

	public ApplicationContext context;
	
	@Before
	public void setUp(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void notNull(){
		
		UserDao userDao = (UserDao) context.getBean("userDao");
		assertNotNull(":Test userDao is Null", userDao);
	}
	
	@Test
	public void equals(){
	UserDao userDao = (UserDao) context.getBean("userDao");
	User user = new User();
	user.setEmail("Test");
	user.setPassword("password");
	userDao.createUser(user);
    assertEquals(":Test userDao is assertEquals falled",user.getUserId(),userDao.listUser().get(0).getUserId());
	}

}
