package com.softeem;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

public class BeanUtilsDemo {
	public static void main(String[] args) throws Exception {
		Person p = new Person("张三",23,"42117",12);
		Person2 p2 = new Person2();
		p2.setAge(6);
		//将Person对象的属性值复制给Person2对象
		BeanUtils.copyProperties(p2, p);
		System.out.println("person:"+p);
		System.out.println(p2);
		
		/*Class class1 = Class.forName("com.softeem.Person");
		Object bean = class1.newInstance();
		BeanUtils.setProperty(bean, "age", 12);
		System.out.println(bean);
		String age = BeanUtils.getProperty(bean, "age");
		System.out.println(age);*/
		
		/*Map<String, String> map = new HashMap<String, String>();
		map.put("name", "张三");
		map.put("age", "66");
		Person person = new Person();
		BeanUtils.populate(person, map);
		System.out.println(person);*/
		
		
	}

}
