package DaoImpl.Restauracja;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Restauracja.ProduktDao;
import Model.Restauracja.Produkt;

public class ProduktDaoImpl extends BaseDaoImpl<Produkt, Integer> implements ProduktDao {

	public ProduktDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Produkt.class);
	}

}
