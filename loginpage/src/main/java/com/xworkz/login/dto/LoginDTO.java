package com.xworkz.login.dto;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "travel")
@ToString
@NamedQueries({
		@NamedQuery(name = "getByEmail", query = "select user.userEmail from LoginDTO user where user.userEmail=:mail"),
		@NamedQuery(name = "findByEmailAndPassword", query = "select user from LoginDTO user where user.userEmail=:mail And user.password =:pass"),
		@NamedQuery(name = "changeStatus", query = "update LoginDTO user set user.status = :stat where user.userEmail = :mail"),
		@NamedQuery(name = "updateCount", query = "update LoginDTO user set user.count = :cnt where user.userEmail = :mail"),
		@NamedQuery(name = "updatePassword", query = "update LoginDTO user set user.password=:pass where user.userEmail=:mail"),
		@NamedQuery(name = "resetPasswordByEmailAndOTP", query = "update LoginDTO as user set user.password=:pass ,user.status=:stat,user.count=:count where user.userEmail=:mail and user.otp=otp"),
		@NamedQuery(name = "generateOTPTimeAndDateByEmail", query = "update LoginDTO user set user.otp=:otp,user.time=:time,user.date=:date where user.userEmail=:mail"),
})
public class LoginDTO {
	public LoginDTO() {
		System.out.println("Default Constructor is created" + this.getClass().getSimpleName());
	}

	@Id
	@GenericGenerator(name = "save", strategy = "increment")
	@GeneratedValue(generator = "save")
	@Min(value = 1)
	private Integer Id;
	@NotNull
	@NotEmpty
	@Length(min = 3)
	@Length(max = 50)
	private String userName;
	@NotNull
	@NotEmpty
	@Length(min = 3)
	@Length(max = 50)
	private String userEmail;
	@NotNull
	@NotEmpty
	@Length(min = 10)
	@Length(max = 13)
	private String contactInfo;
    private String password;
	private String status;
	private Integer count;
    private Integer otp;
    private LocalTime time;
    private LocalDate date;
    private String fileName;
	
	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}