package Model.Restauracja;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.Restauracja.LokalDaoImpl;
import Model.Adres;

@DatabaseTable(daoClass = LokalDaoImpl.class)
public class Lokal {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField
	private String nazwaLokalu;
	@DatabaseField(canBeNull = false, foreign = true)
	private Adres adres;

	public Lokal() {
		super();
	}

	public Lokal(String nazwaLokalu, Adres adres) {
		super();
		this.nazwaLokalu = nazwaLokalu;
		this.adres = adres;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNazwaLokalu() {
		return nazwaLokalu;
	}

	public void setNazwaLokalu(String nazwaLokalu) {
		this.nazwaLokalu = nazwaLokalu;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

}
