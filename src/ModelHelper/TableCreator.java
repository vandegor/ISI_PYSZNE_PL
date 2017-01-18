package ModelHelper;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import DatabaseHelper.ProductDaoImpl;
import DatabaseHelperInterface.ProductDao;
import Model.Produkt;
import Model.Status;
import ModelEnum.StatusEnum;

public class TableCreator {

	public static void createTablesIfNotExists(ConnectionSource connectionSource) throws SQLException {
		ProductDao productDao = new ProductDaoImpl(connectionSource);
		Dao<Status, StatusEnum> statusDao = DaoManager.createDao(connectionSource, Status.class);

		TableUtils.createTableIfNotExists(connectionSource, Produkt.class);
		TableUtils.createTableIfNotExists(connectionSource, Status.class);
		Produkt produkt = new Produkt("Peperoni 30", 15.0);
		productDao.create(produkt);
		produkt = new Produkt("Peperoni 40", 25.0);
		productDao.create(produkt);
		produkt = new Produkt("Peperoni 50", 35.0);
		productDao.create(produkt);

		for (StatusEnum statusEnum : Arrays.asList(StatusEnum.values())) {
			statusDao.create(new Status(statusEnum));
		}

	}

}
