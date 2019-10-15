package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import pojo.NewsInfo;


public class NewsDao implements INewsDao {
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public List<NewsInfo> findNews(int nid) {
		Session session = sessionFactory.getCurrentSession();
		String hql="from NewsInfo where news_Id=:uuid";
		Query query= session.createQuery(hql);
		query.setParameter("uuid", nid);
		List<NewsInfo> list= query.list();
	    return list;
	}

}
