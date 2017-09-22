package com.max.sxz.woread.serviceImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.max.sxz.woread.entry.DataInfo;
import com.max.sxz.woread.service.WoreadDataConnection;
import com.max.sxz.woread.service.WoreadPrepayBlackOrder;

public class WoreadPrepayBlackOrderImp implements WoreadPrepayBlackOrder {

	@Override
	public String blackOrder(String url102, String user102, String password102,
			DataInfo dataInfo, String usercode, String url, String user,
			String password, PrintWriter out) throws IOException {
		String prov="",city="",back="";
		WoreadDataConnection woreadDataConnection = (WoreadDataConnection) new WoreadPrepayBlackOrderImp();
		try{
			Connection conn=woreadDataConnection.connection(url,user,password);
			Statement stmt = conn.createStatement();
			ResultSet rs;
			String sql = "SELECT id FROM black_user WHERE usercode='" + usercode + "'";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				back = "{\"errorCode\":-10,\"errorDesc\":\"black usercode\", \"orderId\":\"\"}";
			} else {
				Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
				Connection conn102 = DriverManager.getConnection(url102, user102, password102);
				Statement stmt102 = conn102.createStatement();
				sql = "SELECT province,city FROM UNICOM_sys_city WHERE mbsection='" + usercode.substring(0, 7)
				+ "'";
				rs = stmt102.executeQuery(sql);
				if (rs.next()) {
					prov = rs.getString(1);
					city = rs.getString(2);
				} else {
					back = "{\"errorCode\":-11,\"errorDesc\":\"get message fail\", \"orderId\":\"\"}";
				}
				stmt102.close();
				conn102.close();	
			}
			dataInfo.setProv(prov);
			dataInfo.setCity(city);
			stmt.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
			back = "{\"errorCode\":-15,\"msg\":\"system limit\", \"orderId\":\"\", \"passCode\":\""
					+ "\"}";
		}
		return back;
	}

}
