package DaoImpl.Bank;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Bank.KontoDao;
import Model.Bank.Konto;

public class KontoDaoImpl  extends BaseDaoImpl<Konto, Integer> implements KontoDao {

	public KontoDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Konto.class);
	}
}
