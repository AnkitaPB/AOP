package org.aop;

import java.util.List;

public class ProxyFactoryBean {
  private Object target;
  private List interceptorName;
public Object getTarget() {
	return target;
}
public void setTarget(Object target) {
	this.target = target;
}
public List getInterceptorName() {
	return interceptorName;
}
public void setInterceptorName(List interceptorName) {
	this.interceptorName = interceptorName;
}
  
}
