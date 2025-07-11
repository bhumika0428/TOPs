package com.tops.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.tops.model.admininfo;
import com.tops.repository.admininfoRepository;

@Service
@ComponentScan(basePackages = "com.tops.repository")
public class adminServices {

	@Autowired
	private admininfoRepository aRepository;
	
	public admininfo save(admininfo admininfo)
	{
		return aRepository.save(admininfo);
	}
	public List<admininfo> getAlladmin()
	{
		return aRepository.findAll();
	}
	public Optional<admininfo>  getbyIdAdmin(int id)
	{
		return aRepository.findById(id);
	}
	public admininfo update(admininfo admininfo)
	{
		return aRepository.save(admininfo);
	}
	public void delete(int id)
	{
		this.aRepository.deleteById(id);
	}
	
}
