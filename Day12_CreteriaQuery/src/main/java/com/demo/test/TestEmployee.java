package com.demo.test;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.demo.beans.Employee;

public class TestEmployee {
	public static void main(String[] Args) {
		CriteriaBuilder cb=Session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class); 
		Root<Employee> root =cq.from(Employee.class);
		cq.select(root).where(cb.and(cb.gt(root.get("sal"),5000)));
	}

}
