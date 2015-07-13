package com.xanne.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.xanne.bo.EmployeeBO;
import com.xanne.exception.CaseStudyException;
import com.xanne.exception.ConnectionException;
import com.xanne.util.DBConnection;

public class EmployeeDAO {

	public EmployeeBO getById(int id) throws CaseStudyException {

		Connection connection = null;
		String sql = "SELECT * FROM case_study.employee WHERE id = ?";
		EmployeeBO emp = null;
		try {
			connection = DBConnection.getInstance().getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rst = pstmt.executeQuery();
			if (rst.next()) {
				emp = new EmployeeBO();
				emp.setLastName(rst.getString("last_name"));
				emp.setFirstName(rst.getString("first_name"));
				emp.setMiddleName(rst.getString("middle_name"));
				emp.setPosition(rst.getString("position"));
			}
		} catch (SQLException e) {
			throw new CaseStudyException(e);
		} catch (ConnectionException e) {
			throw new CaseStudyException(e);
		} catch (Throwable e) {
			throw new CaseStudyException(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new CaseStudyException(e);
			}

		}
		return emp;
	}
	
	public List<EmployeeBO> getEmployees() throws CaseStudyException {
		Connection connection = null;
		String sql = "SELECT id, last_name, first_name, middle_name, age, birth_date, gender, position, create_date, create_user, update_date, update_user FROM case_study.employee";
		List <EmployeeBO> employees = null;
		try {
			connection = DBConnection.getInstance().getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();
			employees = new LinkedList<EmployeeBO>();
			while (rst.next()) {
				EmployeeBO employee = new EmployeeBO();
				employee.setFirstName(rst.getString("first_name"));
				employee.setMiddleName(rst.getString("middle_name"));
				employee.setLastName(rst.getString("last_name"));
				employee.setAge(rst.getInt("age"));
				employee.setBirthday(rst.getDate("birth_date"));
				employee.setGender(rst.getString("gender"));
				employee.setPosition(rst.getString("position"));
				employee.setCreateDate(rst.getDate("create_date"));
				employee.setCreateUser(rst.getString("create_user"));
				employee.setUpdateDate(rst.getDate("update_date"));
				employee.setUpdateUser(rst.getString("update_user"));
				employees.add(employee);				
			}
		} catch (ConnectionException e) {
			throw new CaseStudyException(e);
		} catch (SQLException e) {
			throw new CaseStudyException(e);
		} catch (Throwable e) {
			throw new CaseStudyException(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new CaseStudyException(e);
			}

		}
		return employees;
	}
}
