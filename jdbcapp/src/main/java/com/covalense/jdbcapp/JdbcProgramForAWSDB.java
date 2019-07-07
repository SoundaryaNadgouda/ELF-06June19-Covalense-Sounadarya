package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;
import lombok.extern.java.Log;

@Log
public final class JdbcProgramForAWSDB {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {
		Driver driver=new Driver();
		DriverManager.deregisterDriver(driver);
			
			
			
			
		String dburl="jdbc:mysql://mysqlsoundarya.cdejzmhrk26n.ap-south-1.rds.amazonaws.com:3306/mysqlsoundarya?user=root&password=Soundaryaan1996";
			con=DriverManager.getConnection(dburl);
			
		
			
			log.info("Connection Impl class =======>"+con.getClass());
			
			String query="select * from empinfo";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			while(rs.next()) {
//				log.info(" Id   ===>"+rs.getInt("Id"));
//				log.info("Name    ===>"+rs.getString("Name"));
				
				log.info(" Id   ===>"+rs.getInt(1));
				log.info("Name    ===>"+rs.getString(2));
				log.info("Age    ===>"+rs.getInt("Age"));
				log.info("Gender      ===>"+rs.getString("Gender"));
				log.info(" salary   ===>"+rs.getDouble("Salary"));
				log.info("Phone  ===> "+rs.getInt("Phone"));
				log.info("Joining_Date 	===> "+rs.getDate("joiningDate"));
				log.info("Account_Number  ===> "+rs.getInt("acno"));
				log.info(" Email     ===>"+rs.getString("email"));
				log.info(" Designation	===>"+rs.getString("designation"));
				log.info("Date_Of_Birth   ===>"+rs.getDate("dob"));
				log.info("Dept_Id   ===>"+rs.getInt("deptid"));
				log.info("Manager_Id     ===>"+rs.getInt("managerid"));
						
			}
		} catch (SQLException e) {
			log.info(" ");
		}finally {
				try {
					
					if(con!=null) {
					con.close();
				} 
					if(stmt!=null) {
						stmt.close();
						if(rs!=null) {
							rs.close();
						}
					}
				}
				catch (SQLException e) {
				e.printStackTrace();
				}
				
					}
				}
}	
