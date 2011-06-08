package ts.dao;

import java.util.List;

/*
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.hibernate.SessionFactory;


import ts.domain.*;
import ts.utils.HibernateUtil;


@Repository 
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void createUser(User user) {
		getSessionFactory().getCurrentSession().save(user);
		
	}

	
	public User readUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void updateUser(User user) {
		getSessionFactory().getCurrentSession().saveOrUpdate(user);
		
	}
	
	
	public void deleteUser(User user) {
		getSessionFactory().getCurrentSession().delete(user);
		
	}




	
	public List<User> listUser() {
		return sessionFactory.getCurrentSession().createQuery("from User ").list();
		
	}




	

}
