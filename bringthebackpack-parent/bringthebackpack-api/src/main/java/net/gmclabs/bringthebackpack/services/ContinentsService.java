package net.gmclabs.bringthebackpack.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.gmclabs.bringthebackpack.models.Continent;
import net.gmclabs.bringthebackpack.persistence.mappers.ContinentDao;

@Service
public class ContinentsService implements IContinentsService {

	private static final Logger logger = LoggerFactory.getLogger(ContinentsService.class);

	@Autowired
	private ContinentDao continentDao;

	public List<Continent> findAll() {
		return continentDao.getAllContinents();
	}

	@Override
	public Continent findById(Integer id) {
		return continentDao.getContinentById(id);
	}

	@Override
	@Transactional
	public Continent store(Continent model) {
		Integer affectedRows = continentDao.insertContinent(model);
		logger.info("Inserted: {}", affectedRows == 1);

		return model;
	}

	@Override
	public Continent update(Continent model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Integer id) {
		Integer affectedRows = continentDao.deleteContinent(id);
		return affectedRows == 1;
	}

}
