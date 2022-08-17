package com.xworkz.cartooncharacterEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "cartooncharcater")
public class CartoonEntity extends ParentEntity 
{
  @Id
  @Column(name="cartoon_id")
  private Integer cartoonid;
  private String cartoonName;
  private String country;
  private String gender;
  private String author;
  private String type;
  public CartoonEntity(Integer cartoonid,String cartoonName,String country,String gender,String author,String type)
  {
	 //super(createdBy,createdDate,updatedBy,updatedDate);
	 this.cartoonid = cartoonid;
	 this.cartoonName=cartoonName;
	 this.country = country;
	 this.gender=gender;
	 this.author=author;
	 this.type=type;
	 
  }
  
}
