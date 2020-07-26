package com.spring.beans;

import java.util.List;

public class Bean {
	
	private String name;
	private AnotherBean anotherBean;
	
	private List<String> stringList;
	private List<AnotherBean> anotherBeanList;
	
	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public List<AnotherBean> getAnotherBeanList() {
		return anotherBeanList;
	}

	public void setAnotherBeanList(List<AnotherBean> anotherBeanList) {
		this.anotherBeanList = anotherBeanList;
	}

	
	public Bean(String name, AnotherBean anotherBean) {
		this.name = name;
		this.anotherBean = anotherBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

	@Override
	public String toString() {
		return "Bean [name=" + name + ", anotherBean=" + anotherBean + ", stringList=" + stringList
				+ ", anotherBeanList=" + anotherBeanList + "]";
	}

	

}
