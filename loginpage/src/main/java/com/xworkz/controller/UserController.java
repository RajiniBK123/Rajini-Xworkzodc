package com.xworkz.controller;

import java.io.File;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import java.time.LocalTime;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.login.dto.LoginDTO;
import com.xworkz.login.service.LoginService;

@Controller
@RequestMapping("/user")
public class UserController {


	@Autowired
	LoginService loginService;
	   
	@PostMapping 
	public String onSave(LoginDTO loginDTO, Model model)
	{
		System.out.println("Calling onSave Method");
//		byte[] bytes =file.getBytes();
//		String string =System.currentTimeMillis()+"_"+file.getOriginalFilename();
//		Path path=Paths.get(null);
//		Files.write(path, bytes);
		System.out.println("Details Entered are:"+loginDTO);
		System.out.println(loginDTO);
		if (loginDTO != null) {
			List<LoginDTO> findByEmail = loginService.getByEmail(loginDTO.getUserEmail());
			if (findByEmail!=null)
			{
				model.addAttribute("mesg", "Email Already Exist, So unable To SignIn");
				
			} else {
			
			
				Boolean validateAndSave = loginService.validateAndSave(loginDTO);
				System.out.println("running save method in controller");
				System.out.println(validateAndSave);
				if (validateAndSave) {
					model.addAttribute("DTO", loginDTO);
					model.addAttribute("mesg", "Data Added SuccessFull Enter Next Details");
					
				} else {
					model.addAttribute("mesg", "Data Entered Are Not Valid");
				}
				
			}
		}
         return "signUp";
	}
//	@GetMapping("**/image")
//	public void sendFile(@RequestParam String fileName, HttpServletResponse response) throws IOException {
//	System.out.println("Running sendFile"+fileName);
//		File file = new File("" + fileName);
//		String mimeType = URLConnection.guessContentTypeFromName(file.getName());
//		response.setContentType(mimeType);
//		try (OutputStream stream = response.getOutputStream()) {
//			stream.write(Files.readAllBytes(file.toPath()));
//		}
//	}
}


