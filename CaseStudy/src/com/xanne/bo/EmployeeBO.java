package com.xanne.bo;

import java.util.Date;

import com.xanne.dao.EmployeeDAO;
import com.xanne.exception.CaseStudyException;
import com.xanne.xform.BaseXForm;
import com.xanne.xform.EmployeeXForm;

public class EmployeeBO extends BaseBO {

	private int id;
	private String lastName;
	private String firstName;
	private String middleName;
	private int age;
	private Date birthday;
	private String gender;
	private String position;
	
	public static EmployeeBO getById(int employeeId) throws CaseStudyException {
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeBO bo = dao.getById(employeeId);
		return bo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public BaseXForm getXForm() {
		return new EmployeeXForm();
	}
}
