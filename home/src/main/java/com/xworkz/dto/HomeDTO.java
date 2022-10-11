package com.xworkz.dto;

import java.io.Serializable;

import com.xworkz.constants.OwningType;
import com.xworkz.constants.Type;

public class HomeDTO implements Serializable {
		
		private Integer id;
		private String hName;
		private String hOwner;
		private Type type=Type.APARTMENT;
		private Integer noOfFloors;
		private Boolean hLoan;
		private OwningType owningType=OwningType.LEASE;
		private Double sqFeet;
		public HomeDTO() {
			System.out.println("creating dto default constructor"+this.getClass().getSimpleName());
		}
		public HomeDTO(Integer id, String name, String owner, Type type, Integer noOfFloors, Boolean loan,
				OwningType owningType, Double sqFeet) {
			super();
			this.id = id;
			this.hName = name;
			this.hOwner = owner;
			this.type = type;
			this.noOfFloors = noOfFloors;
			this.hLoan = loan;
			this.owningType = owningType;
			this.sqFeet = sqFeet;
		}
		
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String gethName() {
			return hName;
		}
		public void sethName(String hName) {
			this.hName = hName;
		}
		public String gethOwner() {
			return hOwner;
		}
		public void sethOwner(String hOwner) {
			this.hOwner = hOwner;
		}
		public Type getType() {
			return type;
		}
		public void setType(Type type) {
			this.type = type;
		}
		public Integer getNoOfFloors() {
			return noOfFloors;
		}
		public void setNoOfFloors(Integer noOfFloors) {
			this.noOfFloors = noOfFloors;
		}
		public Boolean gethLoan() {
			return hLoan;
		}
		public void sethLoan(Boolean hLoan) {
			this.hLoan = hLoan;
		}
		public OwningType getOwningType() {
			return owningType;
		}
		public void setOwningType(OwningType owningType) {
			this.owningType = owningType;
		}
		public Double getSqFeet() {
			return sqFeet;
		}
		public void setSqFeet(Double sqFeet) {
			this.sqFeet = sqFeet;
		}
		@Override
		public String toString() {
			return "HouseDTO [id=" + id + ", hName=" + hName + ", hOwner=" + hOwner + ", type=" + type + ", noOfFloors="
					+ noOfFloors + ", hLoan=" + hLoan + ", owningType=" + owningType + ", sqFeet=" + sqFeet + "]";
		}
		
		
		

		
	}

