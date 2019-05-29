package com.market.model;
/**
* 项目名:		MarketManagement
* 包名:		com.market.model
* 文件名:		Manager.java
* 创建时间:	2019年5月29日
* 
* @author:	xiatom
* 描述:		
* 
*
**/
public class Manager {
	private String managerName;
	private String managerPassword;
	private int managerId;
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Manager [managerName=" + managerName + ", managerPassword=" + managerPassword + ", managerId="
				+ managerId + "]";
	}
	
}
