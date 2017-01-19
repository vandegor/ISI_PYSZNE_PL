package DaoImpl.Restauracja;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Restauracja.ZamowienieDao;
import Model.Restauracja.Zamowienie;

public class ZamowienieDaoImpl extends BaseDaoImpl<Zamowienie, Integer> implements ZamowienieDao {

	public ZamowienieDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Zamowienie.class);
	}

}
