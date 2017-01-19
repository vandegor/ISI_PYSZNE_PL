package ModelHelper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import DaoImpl.AdresDaoImpl;
import DaoImpl.Bank.KontoDaoImpl;
import DaoImpl.Bank.OsobaFizycznaDaoImpl;
import DaoImpl.Bank.OsobaPrawnaDaoImpl;
import DaoImpl.Bank.TranzakcjaDaoImpl;
import DaoImpl.Portal.RestauracjaDaoImpl;
import DaoImpl.Restauracja.LokalDaoImpl;
import DaoImpl.Restauracja.PozycjaZamowieniaDaoImpl;
import DaoImpl.Restauracja.ProduktDaoImpl;
import DaoImpl.Restauracja.StatusDaoImpl;
import DaoImpl.Restauracja.ZamowienieDaoImpl;
import DaoInterface.AdresDao;
import DaoInterface.Bank.KontoDao;
import DaoInterface.Bank.OsobaFizycznaDao;
import DaoInterface.Bank.OsobaPrawnaDao;
import DaoInterface.Bank.TranzakcjaDao;
import DaoInterface.Portal.RestauracjaDao;
import DaoInterface.Restauracja.LokalDao;
import DaoInterface.Restauracja.PozycjaZamowieniaDao;
import DaoInterface.Restauracja.ProduktDao;
import DaoInterface.Restauracja.StatusDao;
import DaoInterface.Restauracja.ZamowienieDao;
import Model.Adres;
import Model.Portal.Restauracja;
import Model.Restauracja.Lokal;
import Model.Restauracja.Produkt;
import Model.Restauracja.Status;
import ModelEnum.StatusEnum;

public class TableCreator {
	ConnectionSource connectionSource = ConnectionSourceEnum.ISI_PYSZNE_PL.getConnectionSource();
	ProduktDao productDao = new ProduktDaoImpl(connectionSource);
	StatusDao statusDao = new StatusDaoImpl(connectionSource);
	ZamowienieDao zamowienieDao = new ZamowienieDaoImpl(connectionSource);
	PozycjaZamowieniaDao pozycjaZamowieniaDao = new PozycjaZamowieniaDaoImpl(connectionSource);
	LokalDao lokalDao = new LokalDaoImpl(connectionSource);
	AdresDao adresDao = new AdresDaoImpl(connectionSource);
	OsobaFizycznaDao osobaFizycznaDao = new OsobaFizycznaDaoImpl(connectionSource);
	OsobaPrawnaDao osobaPrawna = new OsobaPrawnaDaoImpl(connectionSource);
	KontoDao kontoDao = new KontoDaoImpl(connectionSource);
	TranzakcjaDao tranzakcjaDao = new TranzakcjaDaoImpl(connectionSource);
	RestauracjaDao restauracjaDao = new RestauracjaDaoImpl(connectionSource);

	ArrayList<Dao<?, ?>> listaDao = new ArrayList<Dao<?, ?>>();

	public TableCreator() throws SQLException {
		listaDao.add(productDao);
		listaDao.add(statusDao);
		listaDao.add(zamowienieDao);
		listaDao.add(pozycjaZamowieniaDao);
		listaDao.add(lokalDao);
		listaDao.add(adresDao);
		listaDao.add(osobaFizycznaDao);
		listaDao.add(osobaPrawna);
		listaDao.add(kontoDao);
		listaDao.add(tranzakcjaDao);
		listaDao.add(restauracjaDao);
	}

	public TableCreator createTablesIfNotExists() throws SQLException {
		for (Dao<?, ?> dao : listaDao) {
			TableUtils.createTableIfNotExists(connectionSource, dao.getDataClass());
		}
		return this;
	}

	public TableCreator createRestauracjaTablesIfNotExists() throws SQLException {
		TableUtils.createTableIfNotExists(connectionSource, restauracjaDao.getDataClass());
		restauracjaDao.create(new Restauracja("daGrasso"));
		restauracjaDao.create(new Restauracja("dominium"));
		return this;

	}

	public TableCreator addSampleData() throws SQLException {
		productDao.create(new Produkt("Peperoni 30", 15.0));
		productDao.create(new Produkt("Peperoni 40", 25.0));
		productDao.create(new Produkt("Peperoni 50", 35.0));

		productDao.create(new Produkt("Hawajska 30", 15.0));
		productDao.create(new Produkt("Hawajska 40", 25.0));
		productDao.create(new Produkt("Hawajska 50", 35.0));

		productDao.create(new Produkt("Salsicia 30", 15.0));
		productDao.create(new Produkt("Salsicia 40", 25.0));
		productDao.create(new Produkt("Salsicia 50", 35.0));

		Adres adres = new Adres("Warszawa", "Krucza", "11123", 13, 13);
		adresDao.create(adres);
		lokalDao.create(new Lokal("daGrasso", adres));
		adres = new Adres("Warszawa", "Kaliskiego", "11123", 10, null);
		adresDao.create(adres);
		adres = new Adres("Warszawa", "Kaliskiego", "11123", 10, null);
		adresDao.create(adres);

		for (StatusEnum statusEnum : Arrays.asList(StatusEnum.values())) {
			statusDao.create(new Status(statusEnum));
		}

		restauracjaDao.create(new Restauracja("daGrasso"));
		restauracjaDao.create(new Restauracja("dominium"));

		return this;
	}

	public TableCreator createTablesWithRawSQL() throws SQLException {
		for (TableCreateStrings createString : TableCreateStrings.values()) {
			productDao.executeRaw(createString.getCreateString());
		}
		return this;

	}

}
