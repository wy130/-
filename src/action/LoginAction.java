package action;

import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import pojo.Star;
import pojo.User;
import service.IStarService;
import service.IUserService;

public class LoginAction extends ActionSupport{
	private User user;
	private List<User> users;
	private List<Star> stars;
	private String comments;
	private IUserService userService;
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Star> getStars() {
		return stars;
	}

	public void setStars(List<Star> stars) {
		this.stars = stars;
	}

	
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() throws SQLException {
		if(this.userService.findManager(user.getUid())){
			setComments("登陆管理员成功");
			 users=this.userService.getUsers();
			 stars=this.userService.getStars();
			return "success";
			
		}
		else {
	    if(this.userService.findUser(user)) {
	    		setComments("登录成功");
	    		return "ok";
	    	}
	    	
	    		else {
	    			setComments("登录失败");
	    			return ERROR;
	    		}
	    	}
	}
	}

