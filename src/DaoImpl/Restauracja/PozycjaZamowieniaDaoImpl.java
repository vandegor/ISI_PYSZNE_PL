package DaoImpl.Restauracja;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Restauracja.PozycjaZamowieniaDao;
import Model.Restauracja.PozycjaZamowienia;

public class PozycjaZamowieniaDaoImpl extends BaseDaoImpl<PozycjaZamowienia, Integer> implements PozycjaZamowieniaDao {

	public PozycjaZamowieniaDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, PozycjaZamowienia.class);
	}
}
