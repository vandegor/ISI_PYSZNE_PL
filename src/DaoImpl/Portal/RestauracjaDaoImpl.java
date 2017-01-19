package DaoImpl.Portal;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Portal.RestauracjaDao;
import Model.Portal.Restauracja;

public class RestauracjaDaoImpl extends BaseDaoImpl<Restauracja, Integer> implements RestauracjaDao {

	public RestauracjaDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Restauracja.class);
	}

}
