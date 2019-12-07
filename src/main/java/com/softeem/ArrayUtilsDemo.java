package com.softeem;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayUtilsDemo {
	public static void main(String[] args) {
		//比较两个数组是否相等（包括类型，长度，数值）
		boolean b = ArrayUtils.isEquals(new int[]{1,2,3},new int[]{1,3,2});

		//数组反转
		int[] array = new int[] { 1, 2, 5 }; 
        ArrayUtils.reverse(array);
        
        
        //数组拷贝
        int[] clone = ArrayUtils.clone(new int[]{1,2,3});
        
        //截取数组（从索引为2-4进行截取;不包括4这个数值）
        int[] subarray = ArrayUtils.subarray(new int[] { 3, 4, 1, 5, 6 }, 2, 4);
        
        //判断某个数值是否在数组当中
        boolean c = ArrayUtils.contains(new int[] { 3, 1, 2 }, 7);
        
        //合并两个数组
        int[] addAll = ArrayUtils.addAll(new int[] { 1, 3, 5 }, new int[] { 1, 4 });
        
        //向数组添加数值
        int[] add = ArrayUtils.add(new int[] { 1, 3, 5 }, 4);
        
        //删除数组中的某个位置上的数值；这里的1为数组的索引
        ArrayUtils.remove(new int[] { 1, 3, 5 }, 1);
        
        //删除数组的某个对象
        ArrayUtils.removeElement(new int[] { 1, 3, 5 }, 3);
	}

}
