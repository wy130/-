package pojo;
/**
 * 新闻类
 * @author 玥
 *
 */
public class NewsInfo {
private int news_Id;//新闻编号
private String news_Title;//新闻标题
private String news_Content;//新闻内容
private String news_Date;//发布时间
private String news_Author;//新闻编辑
private String news_Image1;//新闻来源
private String news_Image2;//新闻图片
public NewsInfo() {
	super();
}
public NewsInfo(int newsId, String news_Title, String news_Content, String news_Date,
		String news_Author, String news_Image1, String news_Image2) {
	super();
	this.news_Id = newsId;
	this.news_Title = news_Title;
	this.news_Content = news_Content;
	this.news_Date = news_Date;
	this.news_Author = news_Author;
	this.news_Image1 = news_Image1;
	this.news_Image2 = news_Image2;
}

public int getNews_Id() {
	return news_Id;
}
public void setNews_Id(int news_Id) {
	this.news_Id = news_Id;
}

public String getNews_Title() {
	return news_Title;
}
public void setNews_Title(String news_Title) {
	this.news_Title = news_Title;
}
public String getNews_Content() {
	return news_Content;
}
public void setNews_Content(String news_Content) {
	this.news_Content = news_Content;
}
public String getNews_Date() {
	return news_Date;
}
public void setNews_Date(String news_Date) {
	this.news_Date = news_Date;
}
public String getNews_Author() {
	return news_Author;
}
public void setNews_Author(String news_Author) {
	this.news_Author = news_Author;
}
public String getNews_Image1() {
	return news_Image1;
}
public void setNews_Image1(String news_Image1) {
	this.news_Image1 = news_Image1;
}
public String getNews_Image2() {
	return news_Image2;
}
public void setNews_Image2(String news_Image2) {
	this.news_Image2 = news_Image2;
}


}
