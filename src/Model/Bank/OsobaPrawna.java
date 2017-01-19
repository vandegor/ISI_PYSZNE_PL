package Model.Bank;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.Bank.OsobaPrawnaDaoImpl;
import Model.Adres;

@DatabaseTable(daoClass = OsobaPrawnaDaoImpl.class)
public class OsobaPrawna {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField
	private String imie;
	@DatabaseField
	private String nazwisko;
	@DatabaseField
	private String pesel;
	@DatabaseField
	private Date dataUrodzenia;
	@DatabaseField(canBeNull = false, foreign = true)
	private Adres adres;

	public OsobaPrawna() {
		super();
	}

	public OsobaPrawna(String imie, String nazwisko, String pesel, Date dataUrodzenia, Adres adres) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
		this.dataUrodzenia = dataUrodzenia;
		this.adres = adres;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

}
