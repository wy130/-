package dao;

import java.util.List;

import pojo.Star;

public interface IStarDao {
	public boolean saveStar(Star star);
	public boolean findStarById(int sid);
	public boolean DeleteStar(Star star);
	public List<Star> getStars();
	public boolean UpdateStar(Star star);
}
