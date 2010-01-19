package com.commons.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSample {

	private static final int MAX = 100;

	public static void main(String[] argv) {
		String sDbDrv = null, sDbUrl = null, sTable = null, sUsr = "", sPwd = "";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// Select fitting database driver and connect:
			Class.forName(sDbDrv);
			cn = DriverManager.getConnection(sDbUrl, sUsr, sPwd);
			st = cn.createStatement();
			rs = st.executeQuery("select * from " + sTable);
			while (rs.next()) {
				for (int i = 1; i <= MAX; i++) {
					// Attention: first column with 1 instead of 0
					System.out.print("| " + rs.getString(i));
					
					//Use Reflection to map value to Bean
					
				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			try {
				if (null != rs)
					rs.close();
			} catch (Exception ex) {
			}
			try {
				if (null != st)
					st.close();
			} catch (Exception ex) {
			}
			try {
				if (null != cn)
					cn.close();
			} catch (Exception ex) {
			}
		}
	}

}