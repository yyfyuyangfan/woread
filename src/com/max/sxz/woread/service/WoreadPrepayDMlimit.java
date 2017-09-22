package com.max.sxz.woread.service;

import java.io.PrintWriter;

import com.max.sxz.woread.entry.DataInfo;



public interface WoreadPrepayDMlimit {
	String DMlimit(String back,String pid,String cpid,String usercode,DataInfo dataInfo,String url,String user,String password,PrintWriter out)throws java.io.IOException;
}
