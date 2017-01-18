package DatabaseHelper;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DatabaseHelperInterface.ProductDao;
import Model.Produkt;

public class ProductDaoImpl extends BaseDaoImpl<Produkt, Integer> implements ProductDao {

	public ProductDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Produkt.class);
	}

}
