package com.xworkz.job;

public class JobDTO 
{
	private String name;
	private String email;
	private Long mobileNo;
	private Long altNo;
	private String gend;
	private String qualification;
	private String University;
	private String addresss;
	private String Skills;
	private Double Package;
	private Integer experience;
	private String idproof;
	private String idProofNo;
	
	public JobDTO()
	{
		System.out.println("default constructor is created.......");
	}
	{
		System.out.println();
	}
	

 public JobDTO(String name, String email, long mobileNo, long altNo, String gend, String qualification, String University2, String addresss,
		String Skills, double Package, int experience, String idproof, String idProofNo)
 {
	 this.name=name;
	 this.email=email;
	 this.mobileNo=mobileNo;
	 this.altNo=altNo;
	 this.gend=gend;
	 this.qualification=qualification;
	 this.University=University;
	 this.experience=experience;
	 this.idproof=idproof;
	 this.idProofNo=idProofNo;
	}
	


	}
