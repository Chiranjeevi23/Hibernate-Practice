package com.openspace.hqldemo;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();      
        session.beginTransaction();       
        
        SQLQuery query = session.createSQLQuery("select * from student where marks>60");
        query.addEntity(Student.class);
        List<Student> students = query.list();
        for(Student o : students) {
        	System.out.println(o);
        }
        session.getTransaction().commit();        
       
    }
}
