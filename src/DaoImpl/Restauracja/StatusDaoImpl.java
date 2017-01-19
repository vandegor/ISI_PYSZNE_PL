package DaoImpl.Restauracja;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import DaoInterface.Restauracja.StatusDao;
import Model.Restauracja.Status;
import ModelEnum.StatusEnum;

public class StatusDaoImpl  extends BaseDaoImpl<Status,StatusEnum > implements StatusDao {

	public StatusDaoImpl(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Status.class);
	}
}
