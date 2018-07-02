package com.openspace;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int srollno;
	private String sname;
	private int smarks;	
	
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	public int getSrollno() {
		return srollno;
	}
	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	@Override
	public String toString() {
		return "Student [srollno=" + srollno + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	
	
}
