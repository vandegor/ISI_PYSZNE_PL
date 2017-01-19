package Model.Bank;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import DaoImpl.Bank.KontoDaoImpl;

@DatabaseTable(daoClass = KontoDaoImpl.class)
public class Konto {

	@DatabaseField(generatedId = true)
	private Integer id;
	@DatabaseField
	private String nrKonta;
	@DatabaseField(canBeNull = false, foreign = true)
	private OsobaFizyczna osobaFizyczna;
	@DatabaseField(canBeNull = false, foreign = true)
	private OsobaPrawna osobaPrawna;

	public Konto() {
		super();
	}

	public Konto(String nrKonta, OsobaFizyczna osobaFizyczna, OsobaPrawna osobaPrawna) {
		super();
		this.nrKonta = nrKonta;
		this.osobaFizyczna = osobaFizyczna;
		this.osobaPrawna = osobaPrawna;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNrKonta() {
		return nrKonta;
	}

	public void setNrKonta(String nrKonta) {
		this.nrKonta = nrKonta;
	}

	public OsobaFizyczna getOsobaFizyczna() {
		return osobaFizyczna;
	}

	public void setOsobaFizyczna(OsobaFizyczna osobaFizyczna) {
		this.osobaFizyczna = osobaFizyczna;
	}

	public OsobaPrawna getOsobaPrawna() {
		return osobaPrawna;
	}

	public void setOsobaPrawna(OsobaPrawna osobaPrawna) {
		this.osobaPrawna = osobaPrawna;
	}

}
