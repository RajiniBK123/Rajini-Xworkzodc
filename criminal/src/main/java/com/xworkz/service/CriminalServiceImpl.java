package com.xworkz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dao.CriminalDAO;
import com.xworkz.dto.CriminalDTO;

@Service
public class CriminalServiceImpl implements CriminalService {
	@Autowired
	private CriminalDAO dao;
	@Override
	public boolean validateAndsave(CriminalDTO dto) {
		System.out.println("Calling validateAndSave");
		if (dto != null) {
			String name = dto.getName();
			String wifeName = dto.getWifeName();
			String rightHandName = dto.getRightHandName();
			String leftHandName = dto.getLefttHandName();
			String prsionName = dto.getPrisonName();
			Double netWorth = dto.getNetWorth();

			if (name.length() > 3 && name.length() < 30 && wifeName.length() > 3 && wifeName.length() < 30
					&& rightHandName.length() > 3 && rightHandName.length() < 30 && leftHandName.length() > 3
					&& leftHandName.length() < 30 && prsionName.length() > 3 && prsionName.length() < 30
					&& netWorth != 0) {
				return this.dao.save(dto);

			} else {
				System.out.println("Data is Not valid");
			}
		}
		return false;
		}

	@Override
	public List<CriminalDTO> findAll() {
		System.out.println("Calling FindAll Method From Service");
		List<CriminalDTO> find = dao.findAll();
		return this.dao.findAll();
	
	}

}
