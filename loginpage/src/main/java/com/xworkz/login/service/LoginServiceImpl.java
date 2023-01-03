package com.xworkz.login.service;

import java.time.Duration;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.login.dao.LoginDAO;
import com.xworkz.login.dto.LoginDTO;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;
	@Autowired
	private LoginServiceImpl serviceImpl;
	private int count;

	@Override
	public Boolean validateAndSave(LoginDTO loginDTO) {
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Validator valid = validator.getValidator();
		Set<ConstraintViolation<LoginDTO>> set = valid.validate(loginDTO);
		if (set.size() > 0) {
			System.out.println("Details Entered Are Invalid");
			return false;
		} else {
			System.out.println("Details Entered Are Valid");
			String password = passwordGenerator();
			String status = "unblocked";
			System.out.println(status);
			Integer count = 0;
			if (!password.isEmpty()) {
				System.out.println("Password Is Not Empty");
				loginDTO.setPassword(password);
				loginDTO.setStatus(status);
				loginDTO.setCount(count);
				System.out.println("Service Impvchdhj"+ loginDTO);
				Boolean save = loginDAO.save(loginDTO);

				if (save) {
					Boolean sendEmail = this.sendEmail(loginDTO.getUserEmail(), loginDTO.getPassword(), loginDTO);
					System.out.println(sendEmail);

				}
			}
			return true;
		}

	}

	public List<LoginDTO> getByEmail(String email) {
		System.out.println("Calling findByEmail Method");
		List<LoginDTO> byEmail = loginDAO.getByEmail(email);
		if (byEmail != null) {
			System.out.println("No Email found");
			return byEmail;
		} else {
			return null;
		}
	}

	@Override
	public String passwordGenerator() {
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		String specialChar = "#$%^&@*";
		String combination = upperCase + lowerCase + num + specialChar;
		int length = 15;
		char[] password = new char[length];
		Random rand = new Random();
		for (int i = 0; i < length; i++) {
			password[i] = combination.charAt(rand.nextInt(combination.length()));

		}
		return new String(password);
	}

	@Override
	public List<LoginDTO> findByEmailAndPassword(String userEmail, String password, LoginDTO dto) {
		// String decPassword = LoginDTO.getPassword();
		// String passWordEncrypt2 = passWordEncrypt(decPassword);
		// loginDTO.setPassword(passWordEncrypt2);

		List<LoginDTO> findByEmailAndPassword = loginDAO.findByEmailAndPassword(dto.getUserEmail(), dto.getPassword());
		System.out.println("Find By Email and password " + findByEmailAndPassword);
		if (findByEmailAndPassword != null) {
			this.count = 0;
			this.loginDAO.updateCountByEmail(count, userEmail);
			return findByEmailAndPassword;
		} else if (this.count < 3) {
			this.count++;
			System.out.println("checking the password" + this.count);
			this.loginDAO.updateCountByEmail(count, userEmail);
		}
		if (this.count >= 3) {
			System.out.println("checking the condtion" + this.count);
			dto.setStatus("Blocked");

			loginDAO.updateStatusByEmail(userEmail, dto.getStatus());
		}
		return findByEmailAndPassword;

	}

	@Override
	public void updateStatus(String email, String status) {
		System.out.println("updateStatus by email");
		Boolean statusUpdated = loginDAO.updateStatusByEmail(email, status);
		System.out.println(statusUpdated);
	}

	public Boolean updateCountByEmail(Integer count, String userEmail) {
		System.out.println("update by count mathod is called");
		Boolean countUpdated = loginDAO.updateCountByEmail(count, userEmail);
		System.out.println(countUpdated);
		return true;

	}

	public Boolean updatePasswordByEmail(String userEmail, String password) {
		System.out.println("UpdatedPassword by Email method is called");
		if (password.length() < 10) {
			System.out.println("password did'nt match the criteria");
		} else {
			List<LoginDTO> byEmail = loginDAO.getByEmail(userEmail);
			if (byEmail == null) {
				System.out.println("Password is incorrect");
			} else {
				Boolean updatePasswordByEmail = loginDAO.updatePasswordByEmail(password, userEmail);
				{
					if (updatePasswordByEmail) {
						return true;
					} else {
						return false;
					}
				}

			}
		}
		return true;

	}

	public Boolean sendEmail(String email, String Password, LoginDTO loginDTO) {
		String name = loginDTO.getUserName();
		String security = loginDTO.getPassword();
		String to = email;
		String from = "iamRajiniBK@outlook.com";
		String host = "smtp.office365.com";
		String pass = "RajiniSanjay@123";
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.debug", "true");
		properties.put("mail.transport.protocol", "smtp");
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(from, pass);

			}
		});
		session.setDebug(false);
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom();
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Resgistration is Confirmed");
			message.setText("hi" + "" + name + "" + "" + security + ""
					+ "this is to confirm u that registration is succesfull" + "" + "Thankyou");
			System.out.println("sending....");
			Transport.send(message);
			System.out.println("Message sent succefully");
		} catch (MessagingException me) {
			me.printStackTrace();
			System.err.println("Exception catched succesfully");

		}
		return true;
	}

	@Override
	public void updateCountByEmail(int count, String userEmail) {
		System.out.println("Calling update Count by email Method");
		loginDAO.updateCountByEmail(count, userEmail);
		System.out.println("Count Updated");

	}

	@Override
	public Boolean resetPasswordByEmailAndOTP(String password, String userEmail, Integer otp, LoginDTO logindto)
	{
		System.out.println("Calling ResetPassword Method");
		if(password.length()<10 && password.length() >12 && password==null)
		{
			System.out.println("Password Length is Incorrect");
		}
		else
		{
			System.out.println("password is valid");
	 
		}
		return true;
	}

	@Override
	public Integer OTPGenerator()
	{
		System.out.println("Calling OTP generator method");
		int random = (int) (Math.random() * 9000) + 1000;
		Integer otp = Integer.valueOf(random);
		return otp;
	}

	@Override
	public Boolean generateOTPByEmail(String userEmail, LoginDTO dto) {
		System.out.println("Calling Generate OTP By Email Method");
		Integer otp = this.OTPGenerator();
		dto.setOtp(otp);
		LocalDateTime mailDateAndTime = LocalDateTime.now();
		LocalDate date = mailDateAndTime.toLocalDate();
		LocalTime time = mailDateAndTime.toLocalTime();
		System.out.println(mailDateAndTime);
		dto.setDate(date);
		dto.setTime(time);
		Boolean otpsent = loginDAO.generateOTPByEmail(userEmail, otp, time, date);
		if (otpsent) {
			Boolean sendingOTP = this.sendOTP(userEmail, otp);
			if (sendingOTP) {
				System.out.println("OTP Sent to Mail Successfully");
			} else {
				System.out.println("OTP Not Sent,Unable to Send Mail");
			}
		}
		return true;
	}

	@Override
	public Boolean sendOTP(String userEmail, Integer otp) {
		String to = userEmail;
		Integer otpSent = otp;

		// Senders email needs to be mentioned
		String from = "iamRajiniBK@outlook.com";

		// Assuming that you are sending mail through outlook smtp
		String host = "smtp.office365.com";

		// password for the mail
		String password = "RajiniSanjay@123";

		// get System properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.debug", "true");
		properties.put("mail.transport.protocol", "smtp");

		// Get the Session Object.//and pass username and password
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		// used to debug smtp issues
		session.setDebug(true);

		try {
			// Create a default mime message object.
			MimeMessage message = new MimeMessage(session);

			// Set From header field of the header
			message.setFrom(new InternetAddress(from));

			// Set To Header Field of the header
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject header field
			message.setSubject("Registration Confirmation mail");

			// Set the actual message
			message.setText("Hi Your OTP to reset password is: " + otpSent);

			System.out.println("Sending......");
			// Send message
			Transport.send(message);
			System.out.println("OTP Sent Successfully");

		} catch (MessagingException max) {
			max.printStackTrace();
		}
		return true;
	}

	@Override
	public String encryptPassword() 
	{
		Encoder encode=Base64.getEncoder();
		String password =passwordGenerator();
		String encodeToString=encode.encodeToString(password.getBytes());
		return encodeToString;
	}
	@Override
	public String encryptPassword(String password) 
	{
		Encoder encode=Base64.getEncoder();
		String password1 = password;
		String encodeToString=encode.encodeToString(password1.getBytes());
		return encodeToString;
		
	}

	@Override
	public String decryptPassword(String password)
	{
		Decoder decoder= Base64.getDecoder();
	    byte[] decodePassword =decoder.decode(password);
	    String decryptedPassword=new String(decodePassword);
	    System.out.println("Decrypted password:" + decryptedPassword);
		return decryptedPassword;	
		}		
	}



