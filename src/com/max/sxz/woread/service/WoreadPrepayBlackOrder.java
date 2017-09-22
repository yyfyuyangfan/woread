package com.max.sxz.woread.service;

import java.io.PrintWriter;

import com.max.sxz.woread.entry.DataInfo;


public interface WoreadPrepayBlackOrder {
	String blackOrder(String url102,String user102,String password102,DataInfo dataInfo,String usercode,String url,String user,String password,PrintWriter out)throws java.io.IOException;
	
}
