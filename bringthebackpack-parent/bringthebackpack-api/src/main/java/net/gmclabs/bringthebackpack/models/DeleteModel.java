package net.gmclabs.bringthebackpack.models;

import java.io.Serializable;

public class DeleteModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean deleted;

	public DeleteModel() {
		super();
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

}
