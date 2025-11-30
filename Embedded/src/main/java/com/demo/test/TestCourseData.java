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
        
        Faculty f1 = new Faculty(1, "xyz", "AI/ML");
        Course c1 = new Course(1, "AI/ML", 6, f1);
        
        session.save(c1);
        tr.commit();
        session.close();

        // Second session: retrieve data
        Session session2 = sh.openSession();
        Transaction tr2 = session2.beginTransaction();
        
        System.out.println("Before get");
        Course c2 = session2.get(Course.class, 1);
        System.out.println("After get");
        System.out.println(c2);
        
        tr2.commit();
        session2.close();
        sh.close();
    }
}
