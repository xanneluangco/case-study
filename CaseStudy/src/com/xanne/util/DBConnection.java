package com.xanne.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.xanne.exception.CaseStudyException;
import com.xanne.exception.ConnectionException;



public class DBConnection {
	
	private final static String CONNECTION_URL = "jdbc/caseStudy";
	
	private static DBConnection instance = new DBConnection();

	private DBConnection() {
	}
	
	public static DBConnection getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws ConnectionException {
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/caseStudy");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
			throw new ConnectionException(e);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ConnectionException(e);
		} catch (Exception e) {
			throw new ConnectionException(e);
		}	
		return conn;
	}
}
