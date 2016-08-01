package net.gmclabs.bringthebackpack.api.rest.controllers.utils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import net.gmclabs.bringthebackpack.models.BaseModel;
import net.gmclabs.bringthebackpack.models.BaseResponse;
import net.gmclabs.bringthebackpack.models.DeleteModel;

@Service
public class ResponseBuilder<T extends BaseModel> {

	public BaseResponse<T> buildSuccessResponse(List<T> resources) {
		BaseResponse<T> response = new BaseResponse<>();
		response.setResponseCode(ResponseCodes.SUCCESS.getCode());
		response.setResponseMessage(ResponseCodes.SUCCESS.getMessage());
		response.setTimestamp(new Date());
		response.setData(resources);
		return response;
	}

	public BaseResponse<T> buildSuccessResponse(T resource) {
		BaseResponse<T> response = new BaseResponse<>();
		response.setResponseCode(ResponseCodes.SUCCESS.getCode());
		response.setResponseMessage(ResponseCodes.SUCCESS.getMessage());
		response.setTimestamp(new Date());
		response.setData(Arrays.asList(resource));
		return response;
	}

	public BaseResponse<DeleteModel> buildSuccessResponseForDelete(Boolean deleted) {
		BaseResponse<DeleteModel> response = new BaseResponse<>();
		response.setResponseCode(ResponseCodes.SUCCESS.getCode());
		response.setResponseMessage(ResponseCodes.SUCCESS.getMessage());
		response.setTimestamp(new Date());

		DeleteModel deleteModel = new DeleteModel();
		deleteModel.setDeleted(deleted);

		response.setData(Arrays.asList(deleteModel));

		return response;
	}

}
