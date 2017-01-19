package DaoImpl.Bank;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Bank.OsobaFizycznaDao;
import Model.Bank.OsobaFizyczna;

public class OsobaFizycznaDaoImpl extends BaseDaoImpl<OsobaFizyczna, Integer> implements OsobaFizycznaDao {

	public OsobaFizycznaDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, OsobaFizyczna.class);
	}
}
