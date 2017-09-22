package com.max.sxz.woread.service;

import java.sql.Connection;

public interface WoreadDataConnection {
	Connection connection(String url,String user,String password)throws Exception;
}
