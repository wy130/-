package service;

import java.util.List;

import pojo.NewsInfo;

public interface INewsService {
	public boolean checkNews(int nid);
	public List<NewsInfo> findNews(int nid);
}
