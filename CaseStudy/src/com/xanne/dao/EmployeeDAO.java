package com.xanne.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public List<EmployeeBO> getEmpoyees() {
		return null;
	}
}
