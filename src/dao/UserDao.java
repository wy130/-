package dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import pojo.Star;
import pojo.User;

public class UserDao implements IUserDao {
	//使用spring注入的session
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		int i=(int) session.save(user);
		if(i > 0)
			return true;
		else
			return false;
	}

	public List<User> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User");
		List<User> list = query.getResultList();
		return list;
	}

	@Override
	public boolean findUserByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		String hql="from User where uid=:uuuid";
		Query query= session.createQuery(hql);
		query.setParameter("uuuid", id);
		List<User> list= query.list();
		if(list.size() > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean findManagerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		String hql="from Admin where aid=:aaaid";
		Query query= session.createQuery(hql);
		query.setParameter("aaaid", id);
		List<User> list= query.list();
		if(list.size() > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Star> getStars() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Star");
		List<Star> list = query.getResultList();
		return list;
	}

	@Override
	public boolean findUser(User user) throws SQLException {
		Session session = sessionFactory.getCurrentSession();
		String hql="from User where uid=:uuuid and upwd=:uuupwd";
		Query query= session.createQuery(hql);
		query.setParameter("uuuid", user.getUid());
		query.setParameter("uuupwd", user.getUpwd());
		List<User> list= query.list();
		if(list.size() > 0)
			return true;
		else
			return false;
	}
}
