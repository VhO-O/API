package com.api.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.api.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{ 
// Aqui fica contido todos os méttodos referentes ao banco de dados

}
