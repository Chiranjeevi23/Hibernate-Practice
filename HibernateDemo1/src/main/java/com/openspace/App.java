package com.openspace;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop laptop = new Laptop();
    	laptop.setLid(100);
    	laptop.setLname("Dell");    	
    	
    	Student student = new Student();
    	student.setSname("Chiru");
    	student.setSrollno(4029);
    	student.setSmarks(77);
    	student.getLaptop().add(laptop);
    	laptop.getStudent().add(student);
    	
       Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
       //ServiceRegistry registry = new ServiceRegistryBuilder
       SessionFactory sf = config.buildSessionFactory();
       Session session = sf.openSession();
       
       session.beginTransaction();
       
       session.save(laptop);
       session.save(student);
       
       session.getTransaction().commit();
       
    }
}
