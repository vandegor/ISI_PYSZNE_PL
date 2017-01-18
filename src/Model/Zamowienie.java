package Model;

import java.sql.Date;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.ProduktDaoImpl;
import DaoImpl.ZamowienieDaoImpl;

@DatabaseTable(daoClass = ZamowienieDaoImpl.class)
public class Zamowienie {
	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField(canBeNull = false, foreign = true)
	private Status status;
	@DatabaseField
	private Date dataZamowienia;
	@DatabaseField
	private Date dataDostawy;
	@ForeignCollectionField(eager = true,orderColumnName="nrPozycji")
	private ForeignCollection<PozycjaZamowienia> pozycjeZamowienia;

	public Zamowienie() {
		super();
	}

	public Zamowienie(Status status, Date dataZamowienia, Date dataDostawy,
			ForeignCollection<PozycjaZamowienia> pozycjeZamowienia) {
		super();
		this.status = status;
		this.dataZamowienia = dataZamowienia;
		this.dataDostawy = dataDostawy;
		this.pozycjeZamowienia = pozycjeZamowienia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getDataZamowienia() {
		return dataZamowienia;
	}

	public void setDataZamowienia(Date dataZamowienia) {
		this.dataZamowienia = dataZamowienia;
	}

	public Date getDataDostawy() {
		return dataDostawy;
	}

	public void setDataDostawy(Date dataDostawy) {
		this.dataDostawy = dataDostawy;
	}

	public ForeignCollection<PozycjaZamowienia> getPozycjeZamowienia() {
		return pozycjeZamowienia;
	}

	public void setPozycjeZamowienia(ForeignCollection<PozycjaZamowienia> pozycjeZamowienia) {
		this.pozycjeZamowienia = pozycjeZamowienia;
	}

}
