package com.tops.Repository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tops.Model.UserDetails;

@Repository
@ComponentScan(basePackages = "com.tops.Model")

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

}
