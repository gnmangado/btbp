package net.gmclabs.bringthebackpack.api.rest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.gmclabs.bringthebackpack.api.rest.controllers.utils.ResponseBuilder;
import net.gmclabs.bringthebackpack.models.BaseModel;
import net.gmclabs.bringthebackpack.models.BaseResponse;
import net.gmclabs.bringthebackpack.models.DeleteModel;
import net.gmclabs.bringthebackpack.services.BaseModelService;

public abstract class AbstractCrudRestController<T extends BaseModel> {

	private static final Logger logger = LoggerFactory.getLogger(AbstractCrudRestController.class);

	@Autowired
	private ResponseBuilder<T> responseBuilder;

	private Class<?> clazz;

	private BaseModelService<T> baseModelService;

	/**
	 * Subclasses MUST call this constructor in order to provide the information of the underlying type for this controller instance.
	 * 
	 * @param baseModelService The "@Service" to be used by this controller instance.
	 * @param clazz The class to which this controller instance applies. Only used for logging purposes.
	 */
	public AbstractCrudRestController(BaseModelService<T> baseModelService, Class<?> clazz) {
		this.baseModelService = baseModelService;
		this.clazz = clazz;
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody BaseResponse<T> findAll() {
		logger.info("API - Returning all resource instances of type {}.", clazz.getSimpleName());

		List<T> resources = baseModelService.findAll();

		BaseResponse<T> response = responseBuilder.buildSuccessResponse(resources);

		return response;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody BaseResponse<T> getById(@PathVariable(value = "id") Integer id) {
		logger.info("API - Returning resource instance id = {} and type = {}.", id, clazz.getSimpleName());

		T resource = baseModelService.findById(id);

		BaseResponse<T> response = responseBuilder.buildSuccessResponse(resource);

		return response;
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody BaseResponse<T> create(@RequestBody T model) {
		logger.info("API - Creating resource instance of type = {}.", clazz.getSimpleName());
		logger.debug("API - Resource representation = {}", model);

		T created = baseModelService.store(model);

		BaseResponse<T> response = responseBuilder.buildSuccessResponse(created);

		return response;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody BaseResponse<T> update(@PathVariable(value = "id") Integer id, @RequestBody T model) {
		logger.info("API - Updating resource instance of type = {} with id = {}.", clazz.getSimpleName(), model.getId());
		logger.debug("API - Resource representation = {}", model);

		T updated = baseModelService.update(model);

		BaseResponse<T> response = responseBuilder.buildSuccessResponse(updated);

		return response;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody BaseResponse<DeleteModel> delete(@PathVariable(value = "id") Integer id) {
		logger.info("API - Deleting resource instance with id = {} and type = {}.", id, clazz.getSimpleName());

		Boolean deleted = baseModelService.delete(id);

		BaseResponse<DeleteModel> response = responseBuilder.buildSuccessResponseForDelete(deleted);

		return response;
	}
}
