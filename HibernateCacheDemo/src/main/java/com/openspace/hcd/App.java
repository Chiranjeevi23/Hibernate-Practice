package com.openspace.hcd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*By default it will fetch from 
 * first level cache when you are 
 * trying to fetch same query again
 * and thats how we improve our application performance
 * because it wont hit mysql db second time to fetch the record.
 * hibernate will provide first level cache
 * and it wont second level cache 
 * so for that we need to use some third party cache services like
 * ehcache etc  */
public class App {
	public static void main(String[] args) {
		AlienName an = new AlienName();
		an.setFname("Rakesh");
		an.setLname("Kumar");
		an.setMname("Tagadghar");
		
		Alien a = new Alien();
		a.setAid(103);
		a.setAcolor("White");
		a.setAname(an);

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session1 = sf.openSession();
		session1.beginTransaction();
		
		//Saving
		//session1.save(a); //before fetching we need to save it		
		a = session1.get(Alien.class, 101); //fetching by id
		System.out.println(a);
		session1.getTransaction().commit();
		
		
		Session session2 = sf.openSession();
		session2.beginTransaction();
		a = session2.get(Alien.class, 101); //fetching by id
		System.out.println(a);		
		session2.getTransaction().commit();	
		

	}
}
