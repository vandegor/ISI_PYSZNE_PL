package DaoImpl;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.AdresDao;
import Model.Adres;

public class AdresDaoImpl extends BaseDaoImpl<Adres, Integer> implements AdresDao {

	public AdresDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Adres.class);
	}
}
