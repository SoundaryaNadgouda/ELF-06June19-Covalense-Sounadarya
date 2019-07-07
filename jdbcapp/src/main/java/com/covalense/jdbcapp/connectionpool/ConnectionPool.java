package com.covalense.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Vector;
import static com.covalense.jdbcapp.connectionpool.ConnectionPoolConstants.*;

public class ConnectionPool {
	private Vector<Connection> pool = new Vector<>();
	private int poolSize;
	private String dbUrl;
	private String userNm;
	private String password;
	private Connection con;
	private String driverClassNM;
	private static ConnectionPool poolRef;

	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	public void loadProperties() throws Exception {
		
		  Properties prop = new Properties(); FileInputStream fi = new
		  FileInputStream("ConfigurationDetails.properties"); prop.load(fi);
		 

		poolSize = Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty(POOL_SIZE));
		dbUrl = PropertyUtil.getPropertyUtil().getProperty(DB_URL);
		userNm = PropertyUtil.getPropertyUtil().getProperty(USERNM);
		password =PropertyUtil.getPropertyUtil().getProperty(PASSWORD);
		driverClassNM = PropertyUtil.getPropertyUtil().getProperty(DRIVER_CLASS);
	}

	private void initialisePool() throws Exception {
		pool =new Vector();
		Connection con=null;
		Class.forName(driverClassNM);
		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(dbUrl, userNm, password);
			pool.add(con);
		}
	}

	public ConnectionPool() throws Exception {
		loadProperties();
		initialisePool();
	}

	public Connection getConnectionFromPool() {
		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}
}
