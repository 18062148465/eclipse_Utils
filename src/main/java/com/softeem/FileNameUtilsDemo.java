package com.softeem;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class FileNameUtilsDemo {
	public static void main(String[] args) {
		String str = "d://ftpFile//11.txt";
		//��ȡ�ļ��ĺ�׺��
		String extension = FilenameUtils.getExtension(str);
		
		//��ȡ�ļ������ƣ���������׺��
		String baseName = FilenameUtils.getBaseName(str);
		System.out.println(baseName);
		
		//��ȡ�ļ����������ļ���׺
		String name = FilenameUtils.getName(str);
		System.out.println(name);
		
		//�����ȫ·��
		String concat = FilenameUtils.concat("d:"+File.separator,"data.txt");
		System.out.println(concat);
		
		//�Ƴ���׺��
		String extension2 = FilenameUtils.removeExtension(str);
		System.out.println(extension2);
		
		//��ʽ��·��
		String normalize = FilenameUtils.normalize("d:"+File.separator+"data.txt");
		System.out.println(normalize);
		
		//��ȡ�ļ���·��
		String fullPath = FilenameUtils.getFullPath(str);
		System.out.println(fullPath);
	}

}
