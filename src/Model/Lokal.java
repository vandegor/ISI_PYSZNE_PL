package Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.LokalDaoImpl;
import DaoImpl.ProduktDaoImpl;

@DatabaseTable(daoClass = LokalDaoImpl.class)
public class Lokal {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField
	private String nazwaLokalu;
	@DatabaseField
	private String miejscowosc;
	@DatabaseField
	private String ulica;
	@DatabaseField(width = 5)
	private String kodpocztowy;
	@DatabaseField
	private Integer numerBudynku;
	@DatabaseField
	private Integer numerlokalu;

	public Lokal() {
		super();
	}
	

	public Lokal(String nazwaLokalu, String miejscowosc, String ulica, String kodpocztowy, Integer numerBudynku,
			Integer numerlokalu) {
		super();
		this.nazwaLokalu = nazwaLokalu;
		this.miejscowosc = miejscowosc;
		this.ulica = ulica;
		this.kodpocztowy = kodpocztowy;
		this.numerBudynku = numerBudynku;
		this.numerlokalu = numerlokalu;
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

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getKodpocztowy() {
		return kodpocztowy;
	}

	public void setKodpocztowy(String kodpocztowy) {
		this.kodpocztowy = kodpocztowy;
	}

	public Integer getNumerBudynku() {
		return numerBudynku;
	}

	public void setNumerBudynku(Integer numerBudynku) {
		this.numerBudynku = numerBudynku;
	}

	public Integer getNumerlokalu() {
		return numerlokalu;
	}

	public void setNumerlokalu(Integer numerlokalu) {
		this.numerlokalu = numerlokalu;
	}

}
