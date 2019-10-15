
package dao;

import java.sql.SQLException;
import java.util.List;
import pojo.Star;
import pojo.User;

public interface IUserDao {
	public boolean saveUser(User user) ;
	
	public List<User> getUsers();
	
	public boolean findUserByID(int id);
	
	public boolean findManagerById(int id); 
	
	public List<Star> getStars();
	
	public boolean findUser(User user) throws SQLException;
}
