package DaoImpl.Bank;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Bank.OsobaPrawnaDao;
import Model.Bank.OsobaPrawna;

public class OsobaPrawnaDaoImpl extends BaseDaoImpl<OsobaPrawna, Integer> implements OsobaPrawnaDao {

	public OsobaPrawnaDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, OsobaPrawna.class);
	}
}
