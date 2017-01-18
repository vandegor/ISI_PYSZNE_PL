package Model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;

import ModelEnum.StatusEnum;

public class Status {
	@DatabaseField(id = true, dataType = DataType.ENUM_STRING)
	StatusEnum status;

	public Status() {

	}

	public Status(StatusEnum status) {
		super();
		this.status = status;
	}

}
