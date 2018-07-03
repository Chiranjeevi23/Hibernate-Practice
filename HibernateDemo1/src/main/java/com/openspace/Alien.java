package com.openspace;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	@OneToMany(mappedBy="alien")
	private Collection<Laptop> laptop = new ArrayList<Laptop>();
	
	public Collection<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(Collection<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	
	
}
