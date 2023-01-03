package com.xworkz.login.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.xworkz.login.dto.LoginDTO;
import com.xworkz.controller.*;

public interface LoginService {

	public String passwordGenerator();

	public Boolean validateAndSave(LoginDTO loginDTO);

	public List<LoginDTO> getByEmail(String email);

//public List<LoginDTO> findByNameAndPassword(String email,String password);
	List<LoginDTO> findByEmailAndPassword(String userEmail, String password, LoginDTO dto);

	public void updateStatus(String userEmail, String status);

	public Boolean sendEmail(String userEmail, String Password, LoginDTO loginDTO);

	public Boolean updatePasswordByEmail(String password, String userEmail);

	public void updateCountByEmail(int count, String userEmail);
    public Boolean resetPasswordByEmailAndOTP(String password,String userEmail,Integer otp,LoginDTO logindto);
    Integer OTPGenerator();
    Boolean generateOTPByEmail(String userEmail,LoginDTO dto);
    Boolean sendOTP(String userEmail,Integer otp);
  
	String encryptPassword();
	
	String encryptPassword(String password);

	String decryptPassword(String password);
}