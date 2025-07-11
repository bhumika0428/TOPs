package com.tops.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.tops.Model.ProductDetails;
import com.tops.Repository.ProductRepository;

@Service
@ComponentScan(basePackages = "com.tops.Repository")
public class ProductServices {

	@Autowired
	private ProductRepository productRepository;
	
	
	public ProductDetails save(ProductDetails productDetails)
	{
	 return	productRepository.save(productDetails);
	}
	
	public List<ProductDetails> getAllProduct()
	{
		return productRepository.findAll();
	}
	public Optional<ProductDetails> getbyidProduct(int id)
	{
		return productRepository.findById(id);
	}
	public ProductDetails update(ProductDetails emp) {
		return this.productRepository.save(emp);
	}
	public void delete(int id)
	{
		 this.productRepository.deleteById(id);
	}
	
}
