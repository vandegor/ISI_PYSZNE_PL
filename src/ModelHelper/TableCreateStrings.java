package ModelHelper;

public enum TableCreateStrings {
	/***/
	PRODUKT("			CREATE TABLE `produkt` 				(`id` INTEGER PRIMARY KEY AUTOINCREMENT ,  `nazwa` VARCHAR ,  `cena` DOUBLE PRECISION )"),
	/***/
	STATUS("			CREATE TABLE `status` 				(`id` INTEGER PRIMARY KEY AUTOINCREMENT ,  `status` VARCHAR )"),
	/***/
	ZAMOWIENIE("		CREATE TABLE `zamowienie` 			(`id` INTEGER PRIMARY KEY AUTOINCREMENT , `status_id` INTEGER NOT NULL , `adres_id` INTEGER NOT NULL , `dataZamowienia` TIMESTAMP , `dataDostawy` TIMESTAMP,  FOREIGN KEY(adres_id) REFERENCES adres(id),  FOREIGN KEY(status_id) REFERENCES status(id) )"),
	/***/
	POZYCJA_ZAMOWIENIA("CREATE TABLE `pozycjazamowienia` 	(`id` INTEGER PRIMARY KEY AUTOINCREMENT ,  `zamowienie_id` INTEGER NOT NULL ,  `nrPozycji` INTEGER NOT NULL ,  `produkt_id` INTEGER NOT NULL ,  `ilosc` INTEGER NOT NULL ,  `cenaJednostkowa` INTEGER NOT NULL ,  FOREIGN KEY(produkt_id) REFERENCES produkt(id),  FOREIGN KEY(zamowienie_id) REFERENCES zamowienie(id))"),
	/***/
	LOKAL("				CREATE TABLE `lokal` 				(`id` INTEGER PRIMARY KEY AUTOINCREMENT , `nazwaLokalu` VARCHAR , `adres_id` INTEGER NOT NULL,  FOREIGN KEY(adres_id) REFERENCES adres(id) )"),
	/***/
	ADRES("				CREATE TABLE `adres` 				(`id` INTEGER PRIMARY KEY AUTOINCREMENT , `miejscowosc` VARCHAR , `ulica` VARCHAR , `kodpocztowy` VARCHAR , `numerBudynku` INTEGER , `numerlokalu` INTEGER )"),
	/***/
	KONTO("				CREATE TABLE `konto` 				(`id` INTEGER PRIMARY KEY AUTOINCREMENT , `nrKonta` VARCHAR , `osobaFizyczna_id` INTEGER NOT NULL , `osobaPrawna_id` INTEGER NOT NULL,  FOREIGN KEY(osobaFizyczna_id) REFERENCES osobaFizyczna(id),  FOREIGN KEY(osobaPrawna_id) REFERENCES osobaPrawna(id) )"),
	/***/
	OSOBA_FIZYCZNA("	CREATE TABLE `osobafizyczna` 		(`id` INTEGER PRIMARY KEY AUTOINCREMENT , `nip` VARCHAR , `regon` VARCHAR , `firmaPrzedsiêbiorcy` VARCHAR , `adres_id` INTEGER NOT NULL,  FOREIGN KEY(adres_id) REFERENCES adres(id) )"),
	/***/
	OSOBA_PRAWNA("		CREATE TABLE `osobaprawna` 			(`id` INTEGER PRIMARY KEY AUTOINCREMENT , `imie` VARCHAR , `nazwisko` VARCHAR , `pesel` VARCHAR , `dataUrodzenia` TIMESTAMP , `adres_id` INTEGER NOT NULL,  FOREIGN KEY(adres_id) REFERENCES adres(id) )"),
	/***/
	TRANZAKCJA("		CREATE TABLE `tranzakcja` 			(`id` INTEGER PRIMARY KEY AUTOINCREMENT , `kontoPlus_id` INTEGER NOT NULL , `kontoMinus_id` INTEGER NOT NULL , `kwota` FLOAT , `data` TIMESTAMP,  FOREIGN KEY(kontoMinus_id) REFERENCES konto(id),  FOREIGN KEY(kontoPlus_id) REFERENCES konto(id) )"),
	/***/
	RESTAURACJA("		CREATE TABLE `restauracja` 			(`id` INTEGER PRIMARY KEY AUTOINCREMENT , `nazwa` VARCHAR )");
	private String createString;

	private TableCreateStrings(String createString) {
		this.createString = createString;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public String getCreateString() {
		return createString;
	}
}
