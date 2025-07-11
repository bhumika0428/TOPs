package com.tops.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tops.model.productinfo;
import com.tops.repository.productinfoRepository;

@Service
public class productServices {

	@Autowired
	private productinfoRepository pRepository;
	
	public productinfo save(productinfo productinfo)
	{
		return pRepository.save(productinfo);
	}
	public List<productinfo> getAllProduct()
	{
		return pRepository.findAll();
	}
	public Optional<productinfo> getbyIdProduct(int id)
	{
		return pRepository.findById(id);
	}
	public productinfo updateproduct(productinfo productinfo)
	{
		return pRepository.save(productinfo);
	}
	public void deleteproduct(int id)
	{
		this.pRepository.deleteById(id);
	}
}
