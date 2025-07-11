package com.tops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tops.model.userinfo;

@Repository
public interface userinfoRepository extends JpaRepository<userinfo, Integer> {

}
