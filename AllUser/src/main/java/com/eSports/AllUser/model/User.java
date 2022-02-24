package com.eSports.AllUser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column
	private String userName;
	@Column
	private String email;
	@Column
	private long phNo;
	@Column
	private String role;
	@Column
	private String password;
	@Column
	private boolean emailVerified;
	@Column
	private boolean phnoVerified;
	
	public User() {
		super();
	}
	
	public User(int userId, String userName, String email, long phNo, String role, String password,
			boolean emailVerified, boolean phnoVerified) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.phNo = phNo;
		this.role = role;
		this.password = password;
		this.emailVerified = emailVerified;
		this.phnoVerified = phnoVerified;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}
	public boolean isPhnoVerified() {
		return phnoVerified;
	}
	public void setPhnoVerified(boolean phnoVerified) {
		this.phnoVerified = phnoVerified;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", phNo=" + phNo + ", role="
				+ role + ", password=" + password + ", emailVerified=" + emailVerified + ", phnoVerified="
				+ phnoVerified + "]";
	}

}
