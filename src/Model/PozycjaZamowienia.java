package Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.PozycjaZamowieniaDaoImpl;
import DaoImpl.ProduktDaoImpl;

@DatabaseTable(daoClass = PozycjaZamowieniaDaoImpl.class)
public class PozycjaZamowienia {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField(canBeNull = false, foreign = true)
	private Zamowienie zamowienie;
	@DatabaseField(canBeNull = false)
	private Integer nrPozycji;
	@DatabaseField(canBeNull = false, foreign = true)
	private Produkt produkt;
	@DatabaseField(canBeNull = false)
	private Integer ilosc;
	@DatabaseField(canBeNull = false)
	private Integer cenaJednostkowa;

	public PozycjaZamowienia() {
		super();
	}

	public PozycjaZamowienia(Zamowienie zamowienie, Integer nrPozycji, Produkt produkt, Integer ilosc,
			Integer cenaJednostkowa) {
		super();
		this.zamowienie = zamowienie;
		this.nrPozycji = nrPozycji;
		this.produkt = produkt;
		this.ilosc = ilosc;
		this.cenaJednostkowa = cenaJednostkowa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Zamowienie getZamowienie() {
		return zamowienie;
	}

	public void setZamowienie(Zamowienie zamowienie) {
		this.zamowienie = zamowienie;
	}

	public Integer getNrPozycji() {
		return nrPozycji;
	}

	public void setNrPozycji(Integer nrPozycji) {
		this.nrPozycji = nrPozycji;
	}

	public Produkt getProdukt() {
		return produkt;
	}

	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}

	public Integer getIlosc() {
		return ilosc;
	}

	public void setIlosc(Integer ilosc) {
		this.ilosc = ilosc;
	}

	public Integer getCenaJednostkowa() {
		return cenaJednostkowa;
	}

	public void setCenaJednostkowa(Integer cenaJednostkowa) {
		this.cenaJednostkowa = cenaJednostkowa;
	}

}
