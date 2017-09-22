package com.max.sxz.woread.service;

import java.io.PrintWriter;

import com.max.sxz.woread.entry.DataInfo;



public interface WoreadPrepayCpStatus {
	String cpStatus(String cpid,String pid,DataInfo dataInfo,String url,String user,String password,PrintWriter out)throws java.io.IOException;
}
