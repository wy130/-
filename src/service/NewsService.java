package service;

import java.util.List;

import dao.INewsDao;
import dao.NewsDao;
import pojo.NewsInfo;

public class NewsService implements INewsService {
	INewsDao newsDao= new NewsDao();
	public INewsDao getNewsDao() {
		return newsDao;
	}
	public void setNewsDao(INewsDao newsDao) {
		this.newsDao = newsDao;
	}
	public boolean checkNews(int nid) {
		if(newsDao.findNews(nid).size() > 0)
			return true;
		else
			return false;
	}
	@Override
	public List<NewsInfo> findNews(int nid) {
		
		return newsDao.findNews(nid);
	}

}
