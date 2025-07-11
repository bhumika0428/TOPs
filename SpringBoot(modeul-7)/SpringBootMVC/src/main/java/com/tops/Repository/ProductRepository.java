package com.tops.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tops.Model.ProductDetails;

@Repository
public interface ProductRepository extends JpaRepository<ProductDetails, Integer> {

}
