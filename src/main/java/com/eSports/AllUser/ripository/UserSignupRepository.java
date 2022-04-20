package com.eSports.AllUser.ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eSports.AllUser.model.User;

@Repository
public interface UserSignupRepository extends JpaRepository<User, Integer>{

}
