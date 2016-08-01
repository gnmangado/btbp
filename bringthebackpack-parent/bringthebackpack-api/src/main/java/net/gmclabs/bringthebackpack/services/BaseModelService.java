package net.gmclabs.bringthebackpack.services;

import java.util.List;

import net.gmclabs.bringthebackpack.models.BaseModel;

public interface BaseModelService<T extends BaseModel> {

	public List<T> findAll();

	public T findById(Integer id);

	public T store(T model);

	public T update(T model);

	public Boolean delete(Integer id);
}
