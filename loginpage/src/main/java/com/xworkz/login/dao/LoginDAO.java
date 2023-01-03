package com.xworkz.login.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.xworkz.login.dto.LoginDTO;

public interface LoginDAO {
	public Boolean save(LoginDTO loginDTO);

	public List<LoginDTO> getByEmail(String email);

	public List<LoginDTO> findByEmailAndPassword(String userEmail, String password);

	public Boolean updateStatusByEmail(String email, String status);

	public Boolean updatePasswordByEmail(String password, String userEmail);

	Boolean sendEmail(String userEmail, String password, LoginDTO loginDTO);

	public Boolean updateCountByEmail(Integer count, String userEmail);
	
	public Boolean resetPasswordByEmailAndOTP(String userEmail,String password,String status,Integer count,Integer otp);
	
	public Boolean generateOTPByEmail(String email, Integer otp, LocalTime time, LocalDate date);

	}
