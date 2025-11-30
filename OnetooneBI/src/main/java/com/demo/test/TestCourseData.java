package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Faculty;

public class TestCourseData {

    public static void main(String[] args) {
        
        SessionFactory sh = new Configuration().configure().buildSessionFactory();

        // First session: save data
        Session session = sh.openSession();
        Transaction tr = session.beginTransaction();
        
        Faculty f1 = new Faculty("xyz", "AI/ML");
        Faculty f2 = new Faculty("ABC", "JAVA,CPP");
        Course c1 = new Course("AI/ML",  6, f1);
        Course c2 = new Course("CDAC", 4, f2);
        
        session.save(c1);
        session.save(f1);

        session.save(c2);
        session.save(f2);

        tr.commit();
        session.close();

        // Second session: retrieve data
        Session session2 = sh.openSession();
        Transaction tr2 = session2.beginTransaction();
        
        System.out.println("Before get");
        Course c3= session2.get(Course.class, 1);
        System.out.println("After get");
        System.out.println(c2);
        
        tr2.commit();
        session2.close();
        sh.close();
    }
}
