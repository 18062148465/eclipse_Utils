package com.softeem;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayUtilsDemo {
	public static void main(String[] args) {
		//�Ƚ����������Ƿ���ȣ��������ͣ����ȣ���ֵ��
		boolean b = ArrayUtils.isEquals(new int[]{1,2,3},new int[]{1,3,2});

		//���鷴ת
		int[] array = new int[] { 1, 2, 5 }; 
        ArrayUtils.reverse(array);
        
        
        //���鿽��
        int[] clone = ArrayUtils.clone(new int[]{1,2,3});
        
        //��ȡ���飨������Ϊ2-4���н�ȡ;������4�����ֵ��
        int[] subarray = ArrayUtils.subarray(new int[] { 3, 4, 1, 5, 6 }, 2, 4);
        
        //�ж�ĳ����ֵ�Ƿ������鵱��
        boolean c = ArrayUtils.contains(new int[] { 3, 1, 2 }, 7);
        
        //�ϲ���������
        int[] addAll = ArrayUtils.addAll(new int[] { 1, 3, 5 }, new int[] { 1, 4 });
        
        //�����������ֵ
        int[] add = ArrayUtils.add(new int[] { 1, 3, 5 }, 4);
        
        //ɾ�������е�ĳ��λ���ϵ���ֵ�������1Ϊ���������
        ArrayUtils.remove(new int[] { 1, 3, 5 }, 1);
        
        //ɾ�������ĳ������
        ArrayUtils.removeElement(new int[] { 1, 3, 5 }, 3);
	}

}
