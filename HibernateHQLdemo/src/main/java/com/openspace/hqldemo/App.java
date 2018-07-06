package com.openspace.hqldemo;

import java.util.List;

import org.hibernate.Query;
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
        /* Random r = new Random();
        for (int i=1; i<=(25); i++) {
        	Student s = new Student();
        	s.setRollno(i);
        	s.setName("Name " +i);
        	s.setMarks(r.nextInt(100));
        	session.save(s);
        }*/
        
        /*
         Query q1 = session.createQuery("from Student where marks > 60"); // writing the query
        List<Student> students = q1.list(); //fetch the values similar to ResultSet
        
        for (Student s : students) {
        	System.out.println(s);
        }*/
        
        /*Query q2 = session.createQuery("from Student where rollno=24");
        Student student = (Student) q2.uniqueResult();
        System.out.println(student);*/
         
        //Query q = session.createQuery("select rollno,name,marks from Student s where s.marks > 60");
        int b = 60;
        Query q = session.createQuery("select sum(marks) from Student s where s.marks > :b");
        q.setParameter("b", b);
        Long marks = (Long) q.uniqueResult();
        System.out.println(marks);      
        
        
        session.getTransaction().commit();        
       
    }
}
