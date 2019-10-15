package service;

import java.sql.SQLException;
import java.util.List;

import dao.IUserDao;
import pojo.Star;
import pojo.User;

public class UserService implements IUserService{
	//使用spring注入的userdao
	private IUserDao userDao;


	public IUserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	public boolean saveUser(User user) {
		userDao.saveUser(user);
		if(userDao.saveUser(user)) {
			return true;
		}else {
			return false;
		}
		
	}	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return this.userDao.getUsers();
	}

	@Override
	public boolean findUserById(int id) {		
		if(userDao.findUserByID(id)) {
			//用户已存在
			return true;
		}
		else {
			//用户不存在 可以注册
			return false;
		}
	}
	@Override
	public boolean findManager(int id) {
		if(this.userDao.findManagerById(id)) {
			//管理员已存在
			return true;
		}
		else {
			//管理员不存在 返回用户登录
			return false;
		}
	}
	@Override
	public List<Star> getStars() {
		return this.userDao.getStars();
	}
	@Override
	public boolean findUser(User user) throws SQLException {
		if(this.userDao.findUser(user)) {
			//用户已存在
			return true;
		}
		else {
			//用户不存在 需要注册
			return false;
		}
	}

}
