package com.max.sxz.woread.serviceImp;

import java.sql.Connection;
import java.sql.DriverManager;

import com.max.sxz.woread.service.WoreadDataConnection;

public class WoreadDataConnectionImp implements WoreadDataConnection {

	@Override
	public Connection connection(String url, String user, String password)
			throws Exception {
		Connection conn=null;
		try{
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
			conn = DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}

}
