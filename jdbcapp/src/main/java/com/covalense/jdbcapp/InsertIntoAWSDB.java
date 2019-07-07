package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import lombok.extern.java.Log;

@Log
public final class InsertIntoAWSDB {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rs=0 ;
				
		
//			Driver driver=new Driver();
//			DriverManager.deregisterDriver(driver);
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException |IllegalAccessException|ClassNotFoundException e) {
				log.info(" ");
			}
			
			
//			
			try {
			String dburl="jdbc:mysql://mysqlsoundarya.cdejzmhrk26n.ap-south-1.rds.amazonaws.com:3306/mysqlsoundarya";
			con=DriverManager.getConnection(dburl, "root", "Soundaryaan1996");
			
			log.info("Connection Impl class =======>"+con.getClass());
			
			
			String query="insert into empinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, (args[1]));
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4,(args[3]));
			pstmt.setDouble(5, Double.parseDouble(args[4]));
			pstmt.setInt(6, Integer.parseInt(args[5]));
			pstmt.setString(7,args[6]);
			pstmt.setInt(8, Integer.parseInt(args[7]));
			pstmt.setString(9, (args[8]));
			pstmt.setString(10,(args[9]));
			pstmt.setString(11, args[10]);
			pstmt.setInt(12, Integer.parseInt(args[11]));
			pstmt.setInt(13, Integer.parseInt(args[12]));
			rs=pstmt.executeUpdate();
			log.info("Profile updated "+rs);
			
			} catch (SQLException e) {
				e.printStackTrace();
			}catch(Exception e){
				log.info(" "+e);
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
