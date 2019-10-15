package service;

import java.sql.SQLException;
import java.util.List;

import pojo.Star;


public interface IStarService {
	public boolean saveStar(Star star);
	public boolean findStarById(int sid);
	public boolean DeleteStar(Star star);
	public List<Star> getStars();
	public boolean UpdateStar(Star star);
}
