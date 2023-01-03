package com.xworkz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.CriminalDTO;
import com.xworkz.service.CriminalService;

@Controller
@RequestMapping("/start")
public class CriminalController
{
	
		@Autowired
		private CriminalService criminalService;

		public CriminalController() {
			System.out.println("created" + this.getClass().getSimpleName());
		}

		@PostMapping
		public String onSave(CriminalDTO dto,Model model ) {
			System.out.println("Calling on save method");
			System.out.println("CriminalDTO" + dto);
			boolean validateAndSave = criminalService.validateAndsave(dto);
			if (validateAndSave) {
				System.out.println("Data is valid and Save");
				model.addAttribute("records", "Records are Saved");
				return "index";
			} else {
				System.out.println("Data is notvalid and notSave");
				return "index";
			}

		}

		@GetMapping
		public String readAll(Model model) {
			System.out.println("Calling Read All Method");
			List<CriminalDTO> criminaldto = criminalService.findAll();
			if (criminaldto != null && !criminaldto.isEmpty()) {
				System.out.println("dtos are found" + criminaldto.size());
				model.addAttribute("CriminalDetails", criminaldto);
				model.addAttribute("size", "Total Criminals found:" + criminaldto.size());

			} else {
				System.out.println("dtos are not found");
				model.addAttribute("msg", "Data is Empty");
			}

			return "criminalsdetails";
}
}
