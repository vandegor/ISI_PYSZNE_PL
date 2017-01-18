package DaoImpl;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.ProduktDao;
import Model.Produkt;

public class ProduktDaoImpl extends BaseDaoImpl<Produkt, Integer> implements ProduktDao {

	public ProduktDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Produkt.class);
	}

}
