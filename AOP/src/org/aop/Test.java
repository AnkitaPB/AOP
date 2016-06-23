package org.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory bean=new XmlBeanFactory(resource);
		A a=bean.getBean("proxy", A.class);
		a.m();
	}

}
