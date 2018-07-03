package com.openspace.HibernateTablePerSubClass;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="regularemp3")
@PrimaryKeyJoinColumn(name="ID")

public class Regular_Employee extends Employee {
	
	private float salary;
	private int bonus;	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
