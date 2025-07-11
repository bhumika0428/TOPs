package com.tops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tops.model.productinfo;

@Repository
public interface productinfoRepository extends JpaRepository<productinfo, Integer> {

}
