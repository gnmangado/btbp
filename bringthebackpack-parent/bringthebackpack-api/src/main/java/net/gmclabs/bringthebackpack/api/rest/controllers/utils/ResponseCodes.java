package net.gmclabs.bringthebackpack.api.rest.controllers.utils;

public enum ResponseCodes {

	SUCCESS("1", "Success"), ERROR_UNKNOWN("2", "An unknown error has ocurred by processing the request.");

	private String code;
	private String message;

	private ResponseCodes(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
