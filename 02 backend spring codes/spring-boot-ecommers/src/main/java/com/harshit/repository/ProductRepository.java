package com.harshit.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.harshit.enity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {

}
