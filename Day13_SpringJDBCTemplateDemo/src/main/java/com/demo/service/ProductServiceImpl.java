package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
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
		String pname=sc.next();
		System.out.println("Enter qty");
		int qty=sc.nextInt();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		System.out.println("Enter mfgDate");
		String ldt=sc.next();
		LocalDate mfg=LocalDate.parse(ldt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("enter category id");
		int cid=sc.nextInt();
		Product p=new Product(pid,pname,qty,price,mfg,cid);
		
		return pdao.save(p);
	}

}
