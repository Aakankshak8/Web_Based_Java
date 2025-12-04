package com.demo.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.ProductService;

public class TestJDBCdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		ProductService pservice=(ProductService) ctx.getBean("ProductServiceImpl");
		int choice=0;
		do {
			System.out.println("1.Add new product\n2. display all\n 3. display by category");
		    System.out.println("4. display by pid\\n");
			System.out.println("5. delete by id\\n 6. modify by id\\n 7. arrange in sorted order");
			System.out.println("8. exit\\n choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=pservice.addnewProduct();
				if(status) {
					System.out.println("Product Added successfully");
				}else {
					System.out.println("Error occured");
				}
			}
			}
			
		}while(choice!=8);
	}

}
