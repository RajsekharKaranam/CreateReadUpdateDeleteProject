package com.example.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crud")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "Emp_Fname")
	private String emp_Fname;
	@Column(name = "Emp_Lname")
	private String emp_Lname;
	@Column(name = "Emp_Age")
	private Integer emp_Age;
	@Column(name = "Emp_Email")
	private String emp_Email;
	@Column(name = "Emp_Mobile")
	private float emp_Mobile;
	@Column(name = "Emp_Gender")
	private String emp_Gender;
	@Column(name = "Emp_City")
	private String emp_City;
	@Column(name = "Emp_State")
	private String emp_State;
	@Column(name = "Emp_Country")
	private String emp_Country;

//	public Employee(int i, String string, String string2, String string3, String string4, int j, String string5,
//			String string6, String string7, String string8) {
//		// TODO Auto-generated constructor stub
//	}
//	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_Fname() {
		return emp_Fname;
	}

	public void setEmp_Fname(String emp_Fname) {
		this.emp_Fname = emp_Fname;
	}

	public String getEmp_Lname() {
		return emp_Lname;
	}

	public void setEmp_Lname(String emp_Lname) {
		this.emp_Lname = emp_Lname;
	}

	public Integer getEmp_Age() {
		return emp_Age;
	}

	public void setEmp_Age(Integer emp_Age) {
		this.emp_Age = emp_Age;
	}

	public String getEmp_Email() {
		return emp_Email;
	}

	public void setEmp_Email(String emp_Email) {
		this.emp_Email = emp_Email;
	}

	public float getEmp_Mobile() {
		return emp_Mobile;
	}

	public void setEmp_Mobile(float emp_Mobile) {
		this.emp_Mobile = emp_Mobile;
	}

	public String getEmp_Gender() {
		return emp_Gender;
	}

	public void setEmp_Gender(String emp_Gender) {
		this.emp_Gender = emp_Gender;
	}

	public String getEmp_City() {
		return emp_City;
	}

	public void setEmp_City(String emp_City) {
		this.emp_City = emp_City;
	}

	public String getEmp_State() {
		return emp_State;
	}

	public void setEmp_State(String emp_State) {
		this.emp_State = emp_State;
	}

	public String getEmp_Country() {
		return emp_Country;
	}

	public void setEmp_Country(String emp_Country) {
		this.emp_Country = emp_Country;
	}

}
