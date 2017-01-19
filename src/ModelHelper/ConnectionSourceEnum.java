package ModelHelper;

import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public enum ConnectionSourceEnum {

	ISI_PYSZNE_PL("ISI_PYSZNE_PL"),
	RESTAURACJA1("RESTAURACJA1"),
	RESTAURACJA2("RESTAURACJA2");

	public static final String DATABASE_URL = "jdbc:sqlite:";
	public static final String DATABASE_EXTENSION = ".sqlite";
	private final HomeEnum homeEnum = HomeEnum.ADAM_WORK_HOME;
	private String connectionString;
	private String databaseName;

	ConnectionSourceEnum(String databaseName) {
		this.databaseName = databaseName;
		this.connectionString = DATABASE_URL + homeEnum + databaseName + DATABASE_EXTENSION;
	}
	
	public ConnectionSource getConnectionSource() throws SQLException {
		return new JdbcConnectionSource(connectionString);
	}

	public String getConnectionString() {
		return connectionString;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public HomeEnum getHomeEnum() {
		return homeEnum;
	}

}
