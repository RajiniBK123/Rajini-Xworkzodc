package com.xworkz.dao;

import java.util.List;

import com.xworkz.dto.CriminalDTO;

public interface CriminalDAO {
	boolean save(CriminalDTO dto);
	List<CriminalDTO> findAll();
}

