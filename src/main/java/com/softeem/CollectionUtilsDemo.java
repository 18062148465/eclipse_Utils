package com.softeem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

public class CollectionUtilsDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		list.add("����");
		list.add("22");
		list1.add("����");
		list1.add("23");
		//�жϼ����Ƿ�Ϊ��
		boolean notEmpty = CollectionUtils.isNotEmpty(list);
		
		//����
		Collection union = CollectionUtils.union(list, list1);
		System.out.println(union);
		
		//�����Ĳ���
		Collection disjunction = CollectionUtils.disjunction(list, list1);
		System.out.println(disjunction);
		
		//�     list�۳�list1
		Collection subtract = CollectionUtils.subtract(list, list1);
		System.out.println(subtract);
		
		//�ж����������Ƿ����
		boolean equalCollection = CollectionUtils.isEqualCollection(list1, list);
		System.out.println(equalCollection);
		
		//��ȡ������������ͬ��Ԫ��
		Collection b = CollectionUtils.intersection(list1, list);
        System.out.println(b);
        
        //ͳ�Ƽ����и���Ԫ�س��ֵĴ���
        Map cardinalityMap = CollectionUtils.getCardinalityMap(list);
        cardinalityMap.forEach((k, v) -> System.out.println(k + ":" + v));
        
        //ͳ�Ƽ�����ĳԪ�س��ֵĴ���
        int cardinality = CollectionUtils.cardinality("22", list);
        System.out.println(cardinality);
        
	}

}
