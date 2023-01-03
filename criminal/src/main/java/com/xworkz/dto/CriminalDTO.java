package com.xworkz.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "criminal_info")

@NamedQueries({@NamedQuery(name = "findAll", query = "select info from CriminalDTO info") })
public class CriminalDTO implements Serializable 
{
	@Id
	@GenericGenerator(name = "done", strategy = "increment")
	@GeneratedValue(generator = "done")
	private Integer id;
	private String name;
	private Integer age;
	private String country;
	private String criminalType;
	private Integer noOfCases;
	private String alive;
	private String gender;
	private String international;
	private String married;
	private Double jailTerm;
	private String wifeName;
	private String rightHandName;
	private String leftHandName;
	private String prisonName;
	private Double netWorth;
	public String getName() {
		
		return null;
	}
	public String getWifeName() {
		return null;
	}
	public String getRightHandName() {
		return null;
	}
	public String getLefttHandName() {
		return null;
	}
	public String getPrisonName() {
		return null;
	}
	public Double getNetWorth() {
		return null;
	}
	
	}

