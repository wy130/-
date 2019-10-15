package service;

import java.sql.SQLException;
import java.util.List;

import dao.IUserDao;
import pojo.Star;
import pojo.User;

public class UserService implements IUserService{
	//ʹ��springע���userdao
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
			//�û��Ѵ���
			return true;
		}
		else {
			//�û������� ����ע��
			return false;
		}
	}
	@Override
	public boolean findManager(int id) {
		if(this.userDao.findManagerById(id)) {
			//����Ա�Ѵ���
			return true;
		}
		else {
			//����Ա������ �����û���¼
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
			//�û��Ѵ���
			return true;
		}
		else {
			//�û������� ��Ҫע��
			return false;
		}
	}

}
