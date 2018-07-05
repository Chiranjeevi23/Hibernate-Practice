package com.openspace.hibdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		AlienName an = new AlienName();
		an.setFname("Nallgs");
		an.setLname("Chiru");
		an.setMname("Lakshman");
		
		Alien a = new Alien();
		a.setAid(102);
		a.setAcolor("crimson");
		a.setAname(an);

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		//fetching by id
		//a = session.get(Alien.class, 100);
		
		//Saving
		session.save(a);

		tx.commit();
		
		System.out.println(a);

	}
}
