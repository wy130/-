package action;

import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import pojo.Star;
import pojo.User;
import service.IStarService;
import service.IUserService;

public class StarAction extends ActionSupport{
	private Star star;
	private String comments;
	private List<Star> stars;
	private List<User> users;
	private IStarService starService;
    public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	private IUserService userService;
	
	public IStarService getStarService() {
		return starService;
	}

	public void setStarService(IStarService starService) {
		this.starService = starService;
	}

	public Star getStar() {
		return star;
	}

	public void setStar(Star star) {
		this.star = star;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<Star> getStars() {
		return stars;
	}

	public void setStars(List<Star> stars) {
		this.stars = stars;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String execute() throws SQLException {
		 if(starService.findStarById(star.getSid())) {
			 if(starService.DeleteStar(star)) {
				 users=this.userService.getUsers();
				 stars=this.userService.getStars();
					setComments("删除成功");
					return "ok";
			 }else {
				 starService.UpdateStar(star);
				 users=this.userService.getUsers();
				 stars=this.userService.getStars();
				setComments("修改成功");
			 return "ok";}
		 }
		 else if(starService.saveStar(star)) {
			 
			 users=this.userService.getUsers();
			 stars=this.userService.getStars();
				setComments("新增成功");
			 return "ok";
		 }
		 else {
			 setComments("修改失败");
			 return "error";
		 }
		
	}
}
