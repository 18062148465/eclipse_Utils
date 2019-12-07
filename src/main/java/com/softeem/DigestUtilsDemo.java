package com.softeem;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class DigestUtilsDemo {
	
	public static void main(String[] args) {
		String str = "123456";
		//MD5¼ÓÃÜ£¬·µ»Ø32Î»×Ö·û´®
//		String md5Hex = DigestUtils.md5Hex(str.getBytes());
//		System.out.println(md5Hex);
		
//		byte[] md5 = DigestUtils.md5(str.getBytes());
//		System.out.println(new String(md5));
		
		
//		String sha1Hex = DigestUtils.sha1Hex(str.getBytes());
//		System.out.println(sha1Hex);
		
//		String sha256Hex = DigestUtils.sha256Hex(str.getBytes());
//		System.out.println(sha256Hex);
		
//		String sha512Hex = DigestUtils.sha512Hex(str.getBytes());
//		System.out.println(sha512Hex);
		
		String encodeBase64String = Base64.encodeBase64String(str.getBytes());
		System.out.println(encodeBase64String);
		
		byte[] decodeBase64 = Base64.decodeBase64(encodeBase64String);
		System.out.println(new String(decodeBase64));
		
	}
	
	//e10adc3949ba59abbe56e057f20f883e

}
