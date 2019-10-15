package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import pojo.Star;

public class StarDao implements IStarDao{
	//使用spring注入的session
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean saveStar(Star star) {
		Session session = sessionFactory.getCurrentSession();
		session.save(star);
		int i=(int) session.save(star);
		if(i > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean findStarById(int sid) {
		Session session = sessionFactory.getCurrentSession();
		String hql="from Star where sid=:sssid";
		Query query= session.createQuery(hql);
		query.setParameter("sssid", sid);
		List<Star> list= query.list();
		if(list.size() > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean DeleteStar(Star star) {
		Session session = sessionFactory.getCurrentSession();
		String hql="delete from Star where sid=:sssid and scontent=:ssscontent";
		Query query= session.createQuery(hql);
		query.setParameter("sssid", star.getSid());
		query.setParameter("ssscontent", star.getScontent());
		int ret=query.executeUpdate();
		if(ret > 0)
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
	public boolean UpdateStar(Star star) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.update(star);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}
}
