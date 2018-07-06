package com.openspace.hqldemo;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
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
        //SQLQuery is called native queries
        SQLQuery query = session.createSQLQuery("select name,marks from student where marks>60");
        //query.addEntity(Student.class);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        
        List students = query.list();
        for(Object o : students) {
        	Map m = (Map) o;
        	System.out.println(m.get("name")+ " : " +m.get("marks"));
        }
        session.getTransaction().commit();        
       
    }
}
