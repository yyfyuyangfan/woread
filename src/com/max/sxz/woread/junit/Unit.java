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
	    		// �������ֽ�ת���� 16 ���Ʊ�ʾ���ַ�
	    					char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',  'e', 'f'};
	    					MessageDigest md = MessageDigest.getInstance( "MD5" );  
	    					md.update( prama.getBytes() );  
	    					byte tmp[] = md.digest();          // MD5 �ļ�������һ�� 128 λ�ĳ�������  
	    																// ���ֽڱ�ʾ���� 16 ���ֽ�  
	    					char str[] = new char[16 * 2];   // ÿ���ֽ��� 16 ���Ʊ�ʾ�Ļ���ʹ�������ַ���  
	    																 // ���Ա�ʾ�� 16 ������Ҫ 32 ���ַ�  
	    					int k = 0;                                // ��ʾת������ж�Ӧ���ַ�λ��  
	    					for (int i = 0; i < 16; i++) {          // �ӵ�һ���ֽڿ�ʼ���� MD5 ��ÿһ���ֽ�  
	    																 // ת���� 16 �����ַ���ת��  
	    					 byte byte0 = tmp[i];                 // ȡ�� i ���ֽ�  
	    					 str[k++] = hexDigits[byte0 >>> 4 & 0xf];  // ȡ�ֽ��и� 4 λ������ת��,   
	    																			 // >>> Ϊ�߼����ƣ�������λһ������  
	    					 str[k++] = hexDigits[byte0 & 0xf];            // ȡ�ֽ��е� 4 λ������ת��  
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
