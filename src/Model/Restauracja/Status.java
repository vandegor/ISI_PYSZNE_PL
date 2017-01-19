package Model.Restauracja;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.Restauracja.ZamowienieDaoImpl;
import ModelEnum.StatusEnum;

@DatabaseTable(daoClass = ZamowienieDaoImpl.class)
public class Status {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField(dataType = DataType.ENUM_STRING)
	private StatusEnum status;

	public Status() {
		super();
	}

	public Status(StatusEnum status) {
		super();
		this.status = status;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
}
