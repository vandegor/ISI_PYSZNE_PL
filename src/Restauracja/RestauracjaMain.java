package Restauracja;

import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class RestauracjaMain {
	public static void main(String[] args) {
		try {
			String databaseUrl = "jdbc:sqlite:ISI_PYSZNE_PL.sqlite";
			ConnectionSource connectionSource;
			connectionSource = new JdbcConnectionSource(databaseUrl);

			ModelHelper.TableCreator.createTablesIfNotExists(connectionSource);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
