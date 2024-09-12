package com.javatechie.springbootcrudexample2.repository;

import com.javatechie.springbootcrudexample2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{

    Product findByName(String name);
}
