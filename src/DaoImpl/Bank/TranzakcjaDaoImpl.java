package DaoImpl.Bank;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Bank.TranzakcjaDao;
import Model.Bank.Tranzakcja;

public class TranzakcjaDaoImpl extends BaseDaoImpl<Tranzakcja, Integer> implements TranzakcjaDao {

	public TranzakcjaDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Tranzakcja.class);
	}

}
