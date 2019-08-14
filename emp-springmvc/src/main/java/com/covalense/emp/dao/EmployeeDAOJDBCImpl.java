package com.covalense.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.emp.dto.EmpInfoBean;


import lombok.extern.java.Log;

@Log
public final class EmployeeDAOJDBCImpl implements EmployeeDAO{
	
	public ArrayList<EmpInfoBean> getAllEmployeeInfo() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			String dburl = "jdbc:mysql://localhost:3306/covalense";
			con = DriverManager.getConnection(dburl, "root", "root");

			log.info("Connection Impl class =======>" + con.getClass());

			String query = "select * from empinfo";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			ArrayList<EmpInfoBean> beans=new ArrayList<EmpInfoBean>();
			EmpInfoBean bean=new EmpInfoBean();
			int count=0;
			while (rs.next()) {
				
				bean.setAcno(rs.getLong("acno"));
				bean.setAge(rs.getInt("age"));
				bean.setId(rs.getInt("deptid"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDob(rs.getDate("dob"));
				bean.setEmail(rs.getString("email"));
				bean.setGender(rs.getString("gender"));
				bean.setId(rs.getInt("id"));
				bean.setJoiningDate(rs.getDate("joiningDate"));
				//.setManagerid(rs.getInt("managerid"));
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getLong("phone"));
				//bean.setSalary(rs.getInt("salary"));
				beans.add(bean);
			log.info(++count+"records");
			}
			return beans;
		} catch (SQLException e) {
			log.info(" "+e);
		}
		return null;
	}

	public EmpInfoBean getEmployeeInfo11(String id) {
		try {
			return getEmployeeInfo11(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			log.info(" " + e);
			return null;
		}
	}

	public EmpInfoBean getEmployeeInfo11(int id) {
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			EmpInfoBean bean=null;

			String dburl = "jdbc:mysql://localhost:3306/covalense";
			con = DriverManager.getConnection(dburl, "root", "root");

			String query = "select * from empinfo " + "where id=?  ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			 bean=new EmpInfoBean();
			while (rs.next()) {
			
				bean.setAcno(rs.getLong("acno"));
				bean.setAge(rs.getInt("age"));
				bean.setId(rs.getInt("deptid"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDob(rs.getDate("dob"));
				bean.setEmail(rs.getString("email"));
				bean.setGender(rs.getString("gender"));
				bean.setId(rs.getInt("id"));
				bean.setJoiningDate(rs.getDate("joiningDate"));
				//bean.setManagerid(rs.getInt("managerid"));
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getLong("phone"));
				//bean.setSalary(rs.getInt("salary"));
			}
			return bean;

			
		} catch (SQLException e) {
			log.info(" " + e);
			return null;
		}
		
	

	}

	public boolean createEmpInfo1(EmpInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateEmpInfo1(EmpInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmpInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createEmpInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateEmpInfo11(EmpInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<EmpInfoBean> searchEmployeeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpInfoBean getEmployeeInfo1(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpInfoBean getEmployeeInfo1(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createEmpInfo(EmpInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmpInfo(EmpInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
