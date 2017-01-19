package Model.Bank;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.Bank.OsobaFizycznaDaoImpl;
import Model.Adres;

@DatabaseTable(daoClass = OsobaFizycznaDaoImpl.class)
public class OsobaFizyczna {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField
	private String nip;
	@DatabaseField
	private String regon;
	@DatabaseField
	private String firmaPrzedsiêbiorcy;
	@DatabaseField(canBeNull = false, foreign = true)
	private Adres adres;

	public OsobaFizyczna() {
		super();
	}

	public OsobaFizyczna(String nip, String regon, String firmaPrzedsiêbiorcy, Adres adres) {
		super();
		this.nip = nip;
		this.regon = regon;
		this.firmaPrzedsiêbiorcy = firmaPrzedsiêbiorcy;
		this.adres = adres;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getRegon() {
		return regon;
	}

	public void setRegon(String regon) {
		this.regon = regon;
	}

	public String getFirmaPrzedsiêbiorcy() {
		return firmaPrzedsiêbiorcy;
	}

	public void setFirmaPrzedsiêbiorcy(String firmaPrzedsiêbiorcy) {
		this.firmaPrzedsiêbiorcy = firmaPrzedsiêbiorcy;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

}
