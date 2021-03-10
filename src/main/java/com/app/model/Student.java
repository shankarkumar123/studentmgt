package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="stutab")
public class Student {
	@Id
	@Column(name="eid")
	@GeneratedValue(generator="mygen")
	@GenericGenerator(name="mygen",strategy="increment")
	private Integer stuId;
	@Column(name="sname")
	private String stuName;
	@Column(name="semail")
	private String email;
	@Column(name="mobile")
	private String mobile;
	@Column(name="gen")
	private String gen;
	@Column(name="addr")
	private String stuAddr;
	public Student() {
		super();
	}
	public Student(Integer stuId) {
		super();
		this.stuId = stuId;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getStuAddr() {
		return stuAddr;
	}
	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", email=" + email + ", mobile=" + mobile + ", gen="
				+ gen + ", stuAddr=" + stuAddr + "]";
	}
	

}
