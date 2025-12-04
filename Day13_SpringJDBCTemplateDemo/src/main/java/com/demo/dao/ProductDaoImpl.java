package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public boolean save(Product p) {
		int n=JdbcTemplate.update("insert into product values(?,?,?,?,?,?)", new Object[] {
				p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfg(),p.getCid()});
		
	return n>0;
	

}}
