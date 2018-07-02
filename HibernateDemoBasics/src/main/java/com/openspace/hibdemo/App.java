package com.openspace.hibdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Alien a = new Alien();
        a.setAid(100);
        a.setAname("Kratos");
        a.setAcolor("White");
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        
        session.save(a);
        
        session.getTransaction().commit();
        
        
    }
}
