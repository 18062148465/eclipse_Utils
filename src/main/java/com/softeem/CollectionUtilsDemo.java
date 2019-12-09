package com.softeem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

public class CollectionUtilsDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		list.add("张三");
		list.add("22");
		list1.add("张三");
		list1.add("23");
		//判断集合是否为空
		boolean notEmpty = CollectionUtils.isNotEmpty(list);
		
		//并集
		Collection union = CollectionUtils.union(list, list1);
		System.out.println(union);
		
		//交集的补集
		Collection disjunction = CollectionUtils.disjunction(list, list1);
		System.out.println(disjunction);
		
		//差集     list扣除list1
		Collection subtract = CollectionUtils.subtract(list, list1);
		System.out.println(subtract);
		
		//判断两个集合是否相等
		boolean equalCollection = CollectionUtils.isEqualCollection(list1, list);
		System.out.println(equalCollection);
		
		//获取两个集合中相同的元素
		Collection b = CollectionUtils.intersection(list1, list);
        System.out.println(b);
        
        //统计集合中各个元素出现的次数
        Map cardinalityMap = CollectionUtils.getCardinalityMap(list);
        cardinalityMap.forEach((k, v) -> System.out.println(k + ":" + v));
        
        //统计集合中某元素出现的次数
        int cardinality = CollectionUtils.cardinality("22", list);
        System.out.println(cardinality);
        
	}

}
