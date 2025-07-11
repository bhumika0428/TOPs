package com.tops.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tops.model.userinfo;
import com.tops.repository.userinfoRepository;

@Service
public class userinfoServices {
    @Autowired
	private userinfoRepository uRepository;
    
    public userinfo save(userinfo user)
    {
    	return uRepository.save(user);
    }
    public List<userinfo> getAlluser()
    {
    	return uRepository.findAll();
    }
    public Optional<userinfo> getbyiduser(int id)
    {
    	return uRepository.findById(id);
    }
    public userinfo updateuser(userinfo user)
    {
    	return uRepository.save(user);
    }
    public void delete(int id)
    {
    	this.uRepository.findById(id);
    }
}

