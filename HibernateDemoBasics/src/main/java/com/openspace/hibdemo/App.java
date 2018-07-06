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
		/*get vs load method: 
		 * get method:- will hit the db even when you dont want to use the object, 
		 * lets say u want to print that object. 
		 * - get will give you "null" if it wont find any object
		 *load method :- it is same as get method but the difference is
		 *it wont hit the db when you run the code it only hit the db when
		 *you want to use the object lets say print that object
		 *load will give you a proxy object i.e fake object 
		 *- load will give you an exception named object not found exception*/
		a = session.get(Alien.class, 102);	
		System.out.println(a);
		//Saving
		//session.save(a);

		tx.commit();
		
		System.out.println(a);

	}
}
