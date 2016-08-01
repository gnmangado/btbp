package net.gmclabs.bringthebackpack.services;

import java.util.List;

import net.gmclabs.bringthebackpack.models.Continent;

public interface IContinentsService extends BaseModelService<Continent> {

	public List<Continent> findAll();

	public Continent findById(Integer id);

	public Continent store(Continent model);

	public Continent update(Continent model);

	public Boolean delete(Integer id);
}
