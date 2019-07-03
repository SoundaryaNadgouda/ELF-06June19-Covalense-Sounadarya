package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public final class PreparedStatementExampleTwo {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
				
		try {
//			Driver driver=new Driver();
//			DriverManager.deregisterDriver(driver);
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException |IllegalAccessException|ClassNotFoundException e) {
				log.info(" ");
			}
			
			
//			String dburl="jdbc:mysql://localhost:3306/covalense?user=root&password=root";
//			con=DriverManager.getConnection(dburl);
			
			String dburl="jdbc:mysql://localhost:3306/covalense";
			con=DriverManager.getConnection(dburl, "root", "root");
			
			log.info("Connection Impl class =======>"+con.getClass());
			
			String query="select * from empinfo "
					+"where id=? "
					+" and managerid=? ";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setInt(2, Integer.parseInt(args[1]));
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				log.info(" Id   ===>"+rs.getInt("Id"));
				log.info("Name    ===>"+rs.getString("Name"));
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
					if(con!=null)
					con.close();
					if(pstmt!=null) {
						pstmt.close();
						if(rs!=null) {
							rs.close();
						}
					}
				}
				catch (SQLException e) {
					log.info(" ");
				}
				
					}
				}
}	
