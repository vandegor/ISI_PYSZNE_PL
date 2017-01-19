package Model.Portal;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.Portal.RestauracjaDaoImpl;

@DatabaseTable(daoClass = RestauracjaDaoImpl.class)
public class Restauracja {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField
	private String nazwa;

	public Restauracja(String nazwa) {
		super();
		this.nazwa = nazwa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Restauracja() {
		super();
	}

}
