package service;

import java.sql.SQLException;
import java.util.List;

import dao.IStarDao;
import pojo.Star;

public class StarService implements IStarService {

	private IStarDao starDao;
	
	public IStarDao getStarDao() {
		return starDao;
	}

	public void setStarDao(IStarDao starDao) {
		this.starDao = starDao;
	}

	@Override
	public boolean saveStar(Star star) {
		starDao.saveStar(star);
		if(starDao.saveStar(star)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean findStarById(int sid) {
		if(starDao.findStarById(sid)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean DeleteStar(Star star) {
		if(starDao.DeleteStar(star)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Star> getStars() {
		return this.starDao.getStars();
	}

	@Override
	public boolean UpdateStar(Star star) {
		if(starDao.UpdateStar(star)) {
			return true;
		}
		else {
			return false;
		}
	}


}
