package springmvcs.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvcs.controller.model.User;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(User user) {
		
		Integer id=(Integer) this.hibernateTemplate.save(user);
		return id;
	}
}
