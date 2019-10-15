package dao;

import java.util.List;

import pojo.NewsInfo;

public interface INewsDao {
	public  List<NewsInfo> findNews(int nid);
}
