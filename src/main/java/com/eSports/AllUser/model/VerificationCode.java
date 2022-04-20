package com.eSports.AllUser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "verification_code")
public class VerificationCode {

	@Id
	@Column
	private int userId;
	@Column
	private String code;
	public VerificationCode() {
		super();
	}
	public VerificationCode(int userId, String code) {
		super();
		this.userId = userId;
		this.code = code;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "VerificationCode [userId=" + userId + ", code=" + code + "]";
	}
	
}
