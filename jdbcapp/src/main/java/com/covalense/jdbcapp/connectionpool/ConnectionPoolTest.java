package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public final class ConnectionPoolTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool = null;

		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/covalense?user=root&password=root";
			con = DriverManager.getConnection(dburl);

			log.info("Connection Impl class =======>" + con.getClass());

			String query = "select * from empinfo";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				log.info(" Id   ===>" + rs.getInt(1));
				log.info("Name    ===>" + rs.getString(2));
				log.info("Age    ===>" + rs.getInt("Age"));
				log.info("Gender      ===>" + rs.getString("Gender"));
				log.info(" salary   ===>" + rs.getDouble("Salary"));
				log.info("Phone  ===> " + rs.getInt("Phone"));
				log.info("Joining_Date 	===> " + rs.getDate("joiningDate"));
				log.info("Account_Number  ===> " + rs.getInt("acno"));
				log.info(" Email     ===>" + rs.getString("email"));
				log.info(" Designation	===>" + rs.getString("designation"));
				log.info("Date_Of_Birth   ===>" + rs.getDate("dob"));
				log.info("Dept_Id   ===>" + rs.getInt("deptid"));
				log.info("Manager_Id     ===>" + rs.getInt("managerid"));

			}
		} catch (Exception e) {
			log.info(" " + e);
		} finally {
			try {
				pool.returnConnectionToPool(con);

				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			}

			catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}