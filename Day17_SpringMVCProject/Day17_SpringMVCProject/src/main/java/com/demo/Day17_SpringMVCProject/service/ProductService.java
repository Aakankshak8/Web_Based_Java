
package com.demo.Day17_SpringMVCProject.service;

import java.util.List;

import com.demo.Day17_SpringMVCProject.beans.Product;

public interface ProductService {

	List<Product> getAllProd();

	void addnewProduct(Product product);

	Product getById(int pid);

	void updateProduct(Product prod);

	void deleteProduct(int pid);

}
