package DaoImpl.Restauracja;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Restauracja.LokalDao;
import Model.Restauracja.Lokal;

public class LokalDaoImpl extends BaseDaoImpl<Lokal, Integer> implements LokalDao {

	public LokalDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Lokal.class);
	}
}
