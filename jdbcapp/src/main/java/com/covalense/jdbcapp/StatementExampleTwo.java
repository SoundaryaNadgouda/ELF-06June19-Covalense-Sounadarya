package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import lombok.extern.java.Log;

@Log
public final class StatementExampleTwo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		int rs=0 ;
				
		
//			Driver driver=new Driver();
//			DriverManager.deregisterDriver(driver);
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException |IllegalAccessException|ClassNotFoundException e) {
				log.info(" ");
			}
			
			
//			String dburl="jdbc:mysql://localhost:3306/covalense?user=root&password=root";
//			con=DriverManager.getConnection(dburl);
			try {
			String dburl="jdbc:mysql://localhost:3306/covalense";
			con=DriverManager.getConnection(dburl, "root", "root");
			
			log.info("Connection Impl class =======>"+con.getClass());
			
			String query="insert into dept_info values(23,'civil')";
			stmt=con.createStatement();
			rs=stmt.executeUpdate(query);
			log.info("Profile updated "+rs);
			
			} catch (SQLException e) {
				e.printStackTrace();
			}catch(Exception e){
				log.info(" ");
			}
		
		}
	}


/*
 * while(rs.next()) { log.info(" Id   ===>"+rs.getInt("Id"));
 * log.info("Name    ===>"+rs.getString("Name"));
 * log.info("Age    ===>"+rs.getInt("Age"));
 * log.info("Gender      ===>"+rs.getString("Gender"));
 * log.info(" salary   ===>"+rs.getDouble("Salary"));
 * log.info("Phone  ===> "+rs.getInt("Phone"));
 * log.info("Joining_Date 	===> "+rs.getDate("joiningDate"));
 * log.info("Account_Number  ===> "+rs.getInt("acno"));
 * log.info(" Email     ===>"+rs.getString("email"));
 * log.info(" Designation	===>"+rs.getString("designation"));
 * log.info("Date_Of_Birth   ===>"+rs.getDate("dob"));
 * log.info("Dept_Id   ===>"+rs.getInt("deptid"));
 * log.info("Manager_Id     ===>"+rs.getInt("managerid"));
 * 
 * } } catch (SQLException e) { log.info(" "); }finally { try { if(con!=null) {
 * con.close(); } if(stmt!=null) { stmt.close(); if(rs!=null) { rs.close(); } }
 * } catch (SQLException e) { log.info(" "); }
 */