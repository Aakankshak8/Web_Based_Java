package com.demo.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Course {
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private int duration;
	@OneToOne(fetch = FetchType.LAZY)
	Faculty fl;
	public Course() {
		super();
	}
	public Course(int cid, String cname, int duration, Faculty fl) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.fl = fl;
	}
	 
	public Course(String cname, int duration, Faculty fl) {
		super();
		this.cname = cname;
		this.duration = duration;
		this.fl = fl;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Faculty getFl() {
		return fl;
	}
	public void setFl(Faculty fl) {
		this.fl = fl;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", fl=" + fl + "]";
	}
	
	
	

}
