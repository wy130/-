package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import pojo.NewsInfo;
import service.INewsService;
import service.IUserService;

public class NewsAction extends ActionSupport{
	private int nid;
	private List<NewsInfo> list;
	private String comments;
	private INewsService newsService;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public INewsService getNewsService() {
		return newsService;
	}
	public void setNewsService(INewsService newsService) {
		this.newsService = newsService;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	

	public List<NewsInfo> getList() {
		return list;
	}
	public void setList(List<NewsInfo> list) {
		this.list = list;
	}
	public String execute() {
		if(this.newsService.checkNews(nid)) {
			list=this.newsService.findNews(nid);
			return "ok";
		}else {
			return ERROR;
		}
	}
}
