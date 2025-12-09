
package com.demo.Day17_SpringMVCProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Day17_SpringMVCProject.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{


}
