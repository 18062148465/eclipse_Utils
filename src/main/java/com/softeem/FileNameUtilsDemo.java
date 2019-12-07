package com.softeem;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class FileNameUtilsDemo {
	public static void main(String[] args) {
		String str = "d://ftpFile//11.txt";
		//获取文件的后缀名
		String extension = FilenameUtils.getExtension(str);
		
		//获取文件的名称，不包括后缀名
		String baseName = FilenameUtils.getBaseName(str);
		System.out.println(baseName);
		
		//获取文件名，包括文件后缀
		String name = FilenameUtils.getName(str);
		System.out.println(name);
		
		//组合完全路径
		String concat = FilenameUtils.concat("d:"+File.separator,"data.txt");
		System.out.println(concat);
		
		//移除后缀名
		String extension2 = FilenameUtils.removeExtension(str);
		System.out.println(extension2);
		
		//格式化路径
		String normalize = FilenameUtils.normalize("d:"+File.separator+"data.txt");
		System.out.println(normalize);
		
		//获取文件的路径
		String fullPath = FilenameUtils.getFullPath(str);
		System.out.println(fullPath);
	}

}
