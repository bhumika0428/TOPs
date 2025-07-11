package com.tops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tops.model.admininfo;
@Repository
public interface admininfoRepository extends JpaRepository<admininfo, Integer> {

}
