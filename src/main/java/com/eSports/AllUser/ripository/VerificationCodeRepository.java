package com.eSports.AllUser.ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eSports.AllUser.model.VerificationCode;

@Repository
public interface VerificationCodeRepository extends JpaRepository<VerificationCode, Integer>{

	@Query(value = "select * from verification_code where code =:code" , nativeQuery = true ) 
	public VerificationCode findVerificationCodeByCode(String code);
	
}
