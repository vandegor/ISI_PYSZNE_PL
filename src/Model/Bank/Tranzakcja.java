package Model.Bank;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.Bank.TranzakcjaDaoImpl;

@DatabaseTable(daoClass = TranzakcjaDaoImpl.class)
public class Tranzakcja {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField(canBeNull = false, foreign = true)
	private Konto kontoPlus;
	@DatabaseField(canBeNull = false, foreign = true)
	private Konto kontoMinus;
	@DatabaseField
	private Float kwota;
	@DatabaseField
	private Date data;

	public Tranzakcja() {
		super();
	}

	public Tranzakcja(Konto kontoPlus, Konto kontoMinus, Float kwota, Date data) {
		super();
		this.kontoPlus = kontoPlus;
		this.kontoMinus = kontoMinus;
		this.kwota = kwota;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Konto getKontoPlus() {
		return kontoPlus;
	}

	public void setKontoPlus(Konto kontoPlus) {
		this.kontoPlus = kontoPlus;
	}

	public Konto getKontoMinus() {
		return kontoMinus;
	}

	public void setKontoMinus(Konto kontoMinus) {
		this.kontoMinus = kontoMinus;
	}

	public Float getKwota() {
		return kwota;
	}

	public void setKwota(Float kwota) {
		this.kwota = kwota;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
