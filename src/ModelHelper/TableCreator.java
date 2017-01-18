package ModelHelper;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import DaoImpl.LokalDaoImpl;
import DaoImpl.PozycjaZamowieniaDaoImpl;
import DaoImpl.ProduktDaoImpl;
import DaoImpl.RestauracjaDaoImpl;
import DaoImpl.StatusDaoImpl;
import DaoImpl.ZamowienieDaoImpl;
import DaoInterface.LokalDao;
import DaoInterface.PozycjaZamowieniaDao;
import DaoInterface.ProduktDao;
import DaoInterface.RestauracjaDao;
import DaoInterface.StatusDao;
import DaoInterface.ZamowienieDao;
import Model.Lokal;
import Model.PozycjaZamowienia;
import Model.Produkt;
import Model.Restauracja;
import Model.Status;
import Model.Zamowienie;
import ModelEnum.StatusEnum;

public class TableCreator {
	ConnectionSource connectionSource = getConnectionSource();
	ProduktDao productDao = new ProduktDaoImpl(connectionSource);
	StatusDao statusDao = new StatusDaoImpl(connectionSource);
	ZamowienieDao zamowienieDao = new ZamowienieDaoImpl(connectionSource);
	PozycjaZamowieniaDao pozycjaZamowieniaDao = new PozycjaZamowieniaDaoImpl(connectionSource);
	LokalDao lokalDao = new LokalDaoImpl(connectionSource);
	RestauracjaDao restauracjaDao = new RestauracjaDaoImpl(connectionSource);

	public TableCreator() throws SQLException {

	}

	public ConnectionSource getConnectionSource() throws SQLException {
		String databaseUrl = "jdbc:sqlite:D:\\workspace_mars\\ISI_PYSZNE_PL_T\\ISI_PYSZNE_PL.sqlite";
		return new JdbcConnectionSource(databaseUrl);
	}

	public TableCreator createTablesIfNotExists() throws SQLException {
		TableUtils.createTableIfNotExists(connectionSource, productDao.getDataClass());
		TableUtils.createTableIfNotExists(connectionSource, statusDao.getDataClass());
		TableUtils.createTableIfNotExists(connectionSource, zamowienieDao.getDataClass());
		TableUtils.createTableIfNotExists(connectionSource, pozycjaZamowieniaDao.getDataClass());
		TableUtils.createTableIfNotExists(connectionSource, lokalDao.getDataClass());
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

		lokalDao.create(new Lokal("daGrasso", "Warszawa", "Krucza", "11123", 13, 13));

		for (StatusEnum statusEnum : Arrays.asList(StatusEnum.values())) {
			statusDao.create(new Status(statusEnum));
		}
		return this;
	}

	public TableCreator createTablesWithRawSQL() throws SQLException {
		productDao.executeRaw(
				"CREATE TABLE `produkt` (`id` INTEGER PRIMARY KEY AUTOINCREMENT ,  `nazwa` VARCHAR ,  `cena` DOUBLE PRECISION )");
		statusDao.executeRaw("CREATE TABLE `status` (`id` INTEGER PRIMARY KEY AUTOINCREMENT ,  `status` VARCHAR )");
		zamowienieDao.executeRaw(
				"CREATE TABLE `zamowienie` (`id` INTEGER PRIMARY KEY AUTOINCREMENT ,  `status_id` INTEGER NOT NULL ,  `dataZamowienia` TIMESTAMP ,  `dataDostawy` TIMESTAMP ,   FOREIGN KEY(status_id) REFERENCES status(id))");
		pozycjaZamowieniaDao.executeRaw(
				"CREATE TABLE `pozycjazamowienia` (`id` INTEGER PRIMARY KEY AUTOINCREMENT ,  `zamowienie_id` INTEGER NOT NULL ,  `nrPozycji` INTEGER NOT NULL ,  `produkt_id` INTEGER NOT NULL ,  `ilosc` INTEGER NOT NULL ,  `cenaJednostkowa` INTEGER NOT NULL ,  FOREIGN KEY(produkt_id) REFERENCES produkt(id),  FOREIGN KEY(zamowienie_id) REFERENCES zamowienie(id))");
		lokalDao.executeRaw(
				"CREATE TABLE `lokal` (`id` INTEGER PRIMARY KEY AUTOINCREMENT ,  `nazwaLokalu` VARCHAR ,  `miejscowosc` VARCHAR ,  `ulica` VARCHAR ,  `kodpocztowy` VARCHAR ,  `numerBudynku` INTEGER ,  `numerlokalu` INTEGER )");
		return this;

	}

}
