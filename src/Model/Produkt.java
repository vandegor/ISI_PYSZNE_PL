package Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DatabaseHelper.ProductDaoImpl;

@DatabaseTable(daoClass = ProductDaoImpl.class)
public class Produkt {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField
	private String nazwa;
	@DatabaseField
	private Double cena;

	public Produkt() {

	}

	public Produkt(String nazwa, Double cena) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;
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

	public Double getCena() {
		return cena;
	}

	public void setCena(Double cena) {
		this.cena = cena;
	}

}
