package service;

import java.sql.SQLException;
import java.util.List;

import pojo.Star;
import pojo.User;

public interface IUserService {
	public boolean saveUser(User user);
	public List<User> getUsers();
	public boolean findUserById(int id);
	public boolean findManager(int id);
	public List<Star> getStars();
	
	public boolean findUser(User user) throws SQLException;
}
