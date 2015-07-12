package com.xanne.bo;

import java.util.Date;

import org.apache.catalina.filters.RemoteIpFilter.XForwardedRequest;

import com.xanne.xform.BaseXForm;


public abstract class BaseBO {
	
	private String createUser;
	private String updateUser;
	private Date createDate;
	private Date updateDate;
	
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public abstract BaseXForm getXForm();
}
