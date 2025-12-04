package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao pdao;

	@Override
	public boolean addnewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		
		System.out.println("Enter Ename");
		System.out.println("Enter qty");
		System.out.println("Enter price");
		System.out.println("Enter Quantity");
		System.out.println("Enter mfgDate");
		String ldt=sc.next();
		LocatDate mfg=LocalDate.parse(ldt, DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		return pdao.save(p);
	}

}
