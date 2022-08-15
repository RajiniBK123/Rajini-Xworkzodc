package com.xworkz.freedomfighterEntity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
@Entity
@Table(name="resort_information")
public class FreedomFighterEntity
{
	@Column(name="fid")
	private int fid;
	@Column(name="dateOfBirth")
	private LocalDate dateOfBirth;
	@Column(name="deathDate")
	private LocalDate deathDate;
	@Column (name="gender")
	private String gender;
	@Column (name="birthLocation")
	private String birthLocation;
	@Column (name="createdBy")
	private String createdBy;
	@Column (name="createdDate")
	private LocalDate createdDate;
	@Column (name="updatedby")
	private String updatedBy;
	@Column (name="updatedDate")
	private LocalDate updateDate;
	
	
	
	
	
	
	
	
}
