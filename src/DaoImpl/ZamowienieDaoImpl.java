package DaoImpl;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.ZamowienieDao;
import Model.Zamowienie;

public class ZamowienieDaoImpl extends BaseDaoImpl<Zamowienie, Integer> implements ZamowienieDao {

	public ZamowienieDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Zamowienie.class);
	}

}
