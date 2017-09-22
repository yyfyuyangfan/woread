package com.max.sxz.woread.junit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class Unit {
	 String getResponseResult(InputStreamReader inputReader)
	    {
			String inputLine = null;
			String dataTemp = "";
			try{
	        
				BufferedReader buffer = new BufferedReader(inputReader);
				while ((inputLine = buffer.readLine()) != null)
				{
					dataTemp += inputLine + "";
				}
			} catch (Exception e) {
			}
			return dataTemp;
	    }

		String tosha1(String str){
			try{
				MessageDigest md = MessageDigest.getInstance("SHA-1");
				md.update(str.getBytes("UTF-8"));
				byte[] result = md.digest();
			 
				StringBuffer sb = new StringBuffer();
			 
				for (byte b : result) {
					int i = b & 0xff;
					if (i < 0xf) {
						sb.append(0);
					}
					sb.append(Integer.toHexString(i));
				}
				return  sb.toString().toUpperCase();	
			}catch (Exception e) {
				return "";
			}
		}

		public String tomd5(String prama){

			String post = "";
	    	try {
	    		// 用来将字节转换成 16 进制表示的字符
	    					char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',  'e', 'f'};
	    					MessageDigest md = MessageDigest.getInstance( "MD5" );  
	    					md.update( prama.getBytes() );  
	    					byte tmp[] = md.digest();          // MD5 的计算结果是一个 128 位的长整数，  
	    																// 用字节表示就是 16 个字节  
	    					char str[] = new char[16 * 2];   // 每个字节用 16 进制表示的话，使用两个字符，  
	    																 // 所以表示成 16 进制需要 32 个字符  
	    					int k = 0;                                // 表示转换结果中对应的字符位置  
	    					for (int i = 0; i < 16; i++) {          // 从第一个字节开始，对 MD5 的每一个字节  
	    																 // 转换成 16 进制字符的转换  
	    					 byte byte0 = tmp[i];                 // 取第 i 个字节  
	    					 str[k++] = hexDigits[byte0 >>> 4 & 0xf];  // 取字节中高 4 位的数字转换,   
	    																			 // >>> 为逻辑右移，将符号位一起右移  
	    					 str[k++] = hexDigits[byte0 & 0xf];            // 取字节中低 4 位的数字转换  
	    					}  
	    					post = new String(str); 
	    					//post = post.toUpperCase();

			}catch (Exception ex) {
				ex.printStackTrace();
	    	}
	    	
	    	return post;
	    }
		String excute(StringBuilder a,StringBuilder b){
			b=new StringBuilder("123456");
			//b.replace(b,"123456" );
			a=new StringBuilder("56789");
			//a.replace(a,"56789" );
			System.out.println("a:"+a+""+"b:"+b);
			return null;
		}
}
