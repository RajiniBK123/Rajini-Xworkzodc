package com.xworkz.homeRunner;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.constants.OwningType;
import com.xworkz.constants.Type;
import com.xworkz.dto.HomeDTO;

public class HomeRunner {
	
public static void main(String[] args) {
			Collection<HomeDTO> list = new ArrayList<HomeDTO>();
		
			HomeDTO dto1 = new HomeDTO(1, "Shree", "Vanita", Type.APARTMENT, 8,true, OwningType.OWN, 800.00D);
			HomeDTO dto2 = new HomeDTO(3, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 700.00D);
			HomeDTO dto3 = new HomeDTO(5, "Shree", "Vanita", Type.VILLA, 8, false, OwningType.RENT, 600.00D);
			HomeDTO dto4 = new HomeDTO(7, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.OWN, 500.00D);
			HomeDTO dto5 = new HomeDTO(9, "Shree", "Vanita", Type.APARTMENT, 8, false, OwningType.RENT, 400.00D);
			HomeDTO dto6 = new HomeDTO(23, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 1100.00D);
			HomeDTO dto7 = new HomeDTO(25, "Shree", "Vanita", Type.VILLA, 8, false, OwningType.OWN, 900.00D);
			HomeDTO dto8 = new HomeDTO(26, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 1200.00D);
			HomeDTO dto9 = new HomeDTO(28, "Shree", "Vanita", Type.APARTMENT, 8, false, OwningType.RENT, 1300.00D);
			HomeDTO dto10 = new HomeDTO(30, "Shree", "Vanita", Type.VILLA, 8, true, OwningType.OWN, 1400.00D);
			HomeDTO dto11 = new HomeDTO(32, "Shree", "Vanita", Type.APARTMENT, 8, false, OwningType.LEASE, 200.00D);
			HomeDTO dto12 = new HomeDTO(34, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.OWN, 100.00D);
			HomeDTO dto13 = new HomeDTO(36, "Shree", "Vanita", Type.VILLA, 8, true, OwningType.RENT, 150.00D);
			HomeDTO dto14 = new HomeDTO(38, "Shree", "Vanita", Type.APARTMENT, 8, false, OwningType.LEASE, 250.00D);
			HomeDTO dto15= new HomeDTO(39, "Shree", "Vanita", Type.VILLA, 8, true, OwningType.LEASE, 350.00D);
			HomeDTO dto16= new HomeDTO(40, "Shree", "Vanita", Type.APARTMENT, 8, true, OwningType.OWN, 8500.00D);
			HomeDTO dto17 = new HomeDTO(42, "Shree", "Vanita", Type.VILLA, 8, false, OwningType.RENT, 950.00D);
			HomeDTO dto18 = new HomeDTO(2, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 1500.00D);
			HomeDTO dto19 = new HomeDTO(4, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 1500.00D);
		    list.add(dto1);
		    list.add(dto2);
		    list.add(dto3);
		    list.add(dto4);
		    list.add(dto5);
		    list.add(dto6);
		    list.add(dto7);
		    list.add(dto8);
		    list.add(dto9);
		    list.add(dto10);
		    list.add(dto11);
		    list.add(dto12);
		    list.add(dto13);
		    list.add(dto14);
		    list.add(dto15);
		    list.add(dto16);
		    list.add(dto17);
		    list.add(dto18);
		    list.add(dto19);
		    list.forEach((ref) -> System.out.println(ref));
			System.out.println("loop created");
			
			list.stream().sorted((e1, e2) -> e1.getId().compareTo(e2.getId())).forEach((ref) -> System.out.println(ref));
			System.out.println("sorted based on the id");
			list.stream().sorted((e1, e2) -> e1.getId().compareTo(e2.getId())).forEach((ref) -> System.out.println(ref));
			System.out.println("sorted based on the getId");
			list.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the getId");
			list.stream().sorted((e1,e2)->e1.gethName().compareTo(e2.gethName())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the gethName");
			list.stream().sorted((e1,e2)->e2.getType().getValue().compareTo(e1.getType().getValue())).forEach((ref)->System.out.println(ref));;
			System.out.println("sorted based on the getType, getValue");
			list.stream().sorted((e1,e2)->e2.getSqFeet().compareTo(e1.getSqFeet())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the getSqFeet");
			list.stream().filter((ref)->ref.gethLoan()==false).sorted((e1,e2)->e2.gethOwner().compareTo(e1.gethOwner())).forEach((ref)->System.out.println(ref));;
			System.out.println("*******************");
			list.stream().filter((ref)->ref.gethLoan()==true).sorted((e1,e2)->e2.gethOwner().compareTo(e2.gethOwner())).forEach((ref)->System.out.println(ref));;
			System.out.println("sorted based on the gethLoan ");
			list.stream().filter((ref)->ref.getOwningType().getValue().equals("lease"))	.sorted((e1,e2)->e1.getOwningType().getValue().compareTo(e2.getOwningType().getValue())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the getOwningType");
			list.stream().filter((ref)->ref.getType().getValue().equals("apartment")).sorted((e1,e2)->e1.getType().getValue().compareTo(e2.getType().getValue())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the type");
			list.stream().filter((ref)->ref.getType().getValue().equals("villa")).sorted((e1,e2)->e1.getType().getValue().compareTo(e2.getType().getValue())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the type");
			list.stream().sorted((e1,e2)->{
			int m=e1.getType().getValue().compareTo(e2.getType().getValue());
			if(m==0) {
				return e1.getOwningType().getValue().compareTo(e2.getOwningType().getValue());

			}
			return m;
			}).forEach((ref)->System.out.println(ref));

			System.out.println("sorting with reference");

			list.stream().sorted((e1,e2)->{
			int m=e1.gethName().compareTo(e2.gethName());
			if(m==0) {
				return e1.getId().compareTo(e2.getId());

			}
			return m;

			}).forEach((ref)->System.out.println(ref));
		}

	

	}

