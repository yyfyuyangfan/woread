package com.max.sxz.woread.service;

import java.io.PrintWriter;

import com.max.sxz.woread.entry.DataInfo;



public interface WoreadPrepaySubmitUrl {
	String submitUrl(DataInfo dataInfo,String usercode,String cpid,String pid,String keyversion ,String back,String url,String user,String password,String cpparam,PrintWriter out)throws java.io.IOException;
}
