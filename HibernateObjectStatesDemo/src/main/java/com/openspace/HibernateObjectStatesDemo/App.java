package com.openspace.HibernateObjectStatesDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/*Hibernate has three states
 * 1.Transient = whenever you create the object and set the values, 
 * the object is in transient state that means the data you have set will be deleted 
 * when u close the eclipse application so to retain data we need to persist/save the object
 * 
 * 2.Persistent =  to save the data in db we persist the data.
 * 3.Remove = it removes the object connection from db
 * 4.Detach = It will detach the object from persist state*/ 
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Laptop.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	session.beginTransaction();
    	
    	/*Random r = new Random();
    	for(int i=1; i<20; i++) {
    		Laptop l = new Laptop();
    		l.setBrand("Brand" +i);
    		l.setPrice(r.nextInt(40000));
    		session.save(l);
    	}*/
    	Laptop l = new Laptop();
    	session.save(l);
    	/* below data will go into db even though u saved/persists it,
    	 * because the object is in persists state earlier*/
    	
    	l.setPrice(70000);
    	l.setBrand("Asus");
    	
    	session.getTransaction().commit(); //Committing means detaching the object
    	l.setPrice(10000000); // object l is in detach state so it wont be saved in db
    }
}
