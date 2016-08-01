package net.gmclabs.bringthebackpack.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BaseResponse<T extends BaseModel> implements Serializable {

	private static final long serialVersionUID = 1L;

	private String responseCode;
	private String responseMessage;
	private Date timestamp;
	private List<T> data;

	public BaseResponse() {
		super();
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
