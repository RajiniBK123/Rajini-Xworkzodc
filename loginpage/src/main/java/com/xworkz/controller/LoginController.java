package com.xworkz.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sun.istack.internal.logging.Logger;
import com.xworkz.login.dto.LoginDTO;
import com.xworkz.login.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	Integer count = 0;
	@Autowired
	private LoginService loginService;

	@PostMapping
	public String signIn(Model model, LoginDTO loginDTO) {

		return onRequest(model, loginDTO);
	}

	@GetMapping
	public String onRequest(Model model, LoginDTO loginDTO) {

		System.out.println("Calling SignIn Method");
		List<LoginDTO> findByEmailAndPassword = loginService.findByEmailAndPassword(loginDTO.getUserEmail(),
				loginDTO.getPassword(), loginDTO);
		System.out.println(findByEmailAndPassword);

		if (findByEmailAndPassword == null) {
			model.addAttribute("Msg", "Incorrect credentials Entered");
			count++;
			if (count == 4) {
				model.addAttribute("Msg", "Your Account has Been Blocked");
				return "signIn";
			}
		} else {
			if (findByEmailAndPassword.get(0).getStatus().equals("Blocked")) {
				model.addAttribute("Msg", "your Account Has Been Locked");
			} else {
				System.out.println("Welcome To Home Page!");
				model.addAttribute("Msg", loginDTO.getUserName() + "Welcome to your profile");
				return "index";
			}
		}
		return "signIn";
	}
	
	@GetMapping("otp")
	public String generateOTP(LoginDTO dto,Model model)
	{
		Boolean login=loginService.generateOTPByEmail(dto.getUserEmail(),dto);
		if(login!=null)
	    {
		System.out.println("OTP Generated Successfully");
		model.addAttribute("msg","OTP Generated Successfully");
		return "resetPassword";
		}
		else
		{
		System.out.println("Incorrect UserEmail,Enter the new userEmail");
		model.addAttribute("msg","Incorrect userEmail,Enter new userEmail");
		return "otpGenerator";
		}
	}
	@GetMapping("/pass")
	public String resetPassword(LoginDTO project, Model model) {
		Boolean dto = loginService.resetPasswordByEmailAndOTP(project.getPassword(), project.getUserEmail(),
				project.getOtp(), project);
		System.out.println("DTO in Controller" + dto);
		if (dto)
		{
			System.out.println("Password Reset Successfull");
			model.addAttribute("msg", "Password Reset Successfull,Account Unlocked");
			return "signIn";
		} 
		else
		{
			System.out.println("Password reset unsuccessfull");
			model.addAttribute("msg", "Password Reset Unsuccessfull");
			return "index";
		}

	}
}


