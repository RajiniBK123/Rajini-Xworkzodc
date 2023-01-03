package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.CriminalDTO;

public interface CriminalService {
	
	boolean validateAndsave(CriminalDTO dto);

	List<CriminalDTO> findAll();

}
