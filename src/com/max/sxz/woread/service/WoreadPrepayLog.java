package com.max.sxz.woread.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

public interface WoreadPrepayLog {
	void logsave(HttpServletRequest request, String cp, String cpid,
			String passCode, String back, PrintWriter out) throws IOException;
}
