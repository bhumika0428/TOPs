package com.tops.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.tops.Model.UserDetails;
import com.tops.Repository.UserDetailsRepository;

@Service
@ComponentScan(basePackages = "com.tops.Repository")
public class UserServices {
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	
	public UserDetails Save(UserDetails userDetails)
	{
		return userDetailsRepository.save(userDetails);
	}
	public List<UserDetails> getAllUserDetails()
	{
		return userDetailsRepository.findAll();
	}
}
