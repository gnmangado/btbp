package net.gmclabs.bringthebackpack.persistence.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.gmclabs.bringthebackpack.models.Continent;

public interface ContinentDao {

	public List<Continent> getAllContinents();

	public Continent getContinentById(@Param("id") Integer id);

	public Integer insertContinent(@Param("continent") Continent continent);

	public Continent updateContinent(@Param("continent") Continent continent);

	public Integer deleteContinent(@Param("id") Integer id);
}
