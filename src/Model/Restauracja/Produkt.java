package Model.Restauracja;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.Restauracja.ProduktDaoImpl;

@DatabaseTable(daoClass = ProduktDaoImpl.class)
public class Produkt {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField
	private String nazwa;
	@DatabaseField
	private Double cena;

	public Produkt() {
		super();
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
