package action;

import com.opensymphony.xwork2.ActionSupport;
import pojo.User;
import service.IUserService;

public class RegistAction extends ActionSupport{
	private User user;
	private IUserService userService;
	private String comments;
	
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

	public String execute() {
		System.out.println("×¢²á..." + user.getUname());
		if(this.userService.findUserById(user.getUid())) {
			setComments("ÓÃ»§ÒÑ´æÔÚ");
			return ERROR;
		}
		else {
			boolean flag=this.userService.saveUser(user);
			if(flag) {
				return "ok";
			}
			else {
				setComments("×¢²áÊ§°Ü");
				return ERROR;
			}
		}
	}
	
}
