package com.demo.beans;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	@GeneratedValue
	
	private int fid;
	private String fname;
	private String specialskills;
	public Faculty() {
		super();
	}
	public Faculty(int fid, String fname, String specialskills) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.specialskills = specialskills;
	}
	
	public Faculty(String fname, String specialskills) {
		super();
		this.fname = fname;
		this.specialskills = specialskills;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSpecialskills() {
		return specialskills;
	}
	public void setSpecialskills(String specialskills) {
		this.specialskills = specialskills;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", specialskills=" + specialskills + "]";
	}
	
	
	

}
