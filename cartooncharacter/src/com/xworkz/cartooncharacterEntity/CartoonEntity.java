package com.xworkz.cartooncharacterEntity;

import javax.persistence.Column;
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

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "cartooncharcater")
@NamedQueries({
	@NamedQuery(name="findByName",query="select cartoon from CartoonEntity cartoon where cartoon.name=:nme"),
	@NamedQuery(name="total",query="select count(*) from CartoonEntity "),
	@NamedQuery(name="findByMaxCreatedDate",query="select max(cartoon.createdDate) from CartoonEntity cartoon "),
	@NamedQuery(name="findAll",query="select cartoon from CartoonEntity cartoon where name=:nme and country=:cnt and gender=:gn and author=:at"),
	@NamedQuery(name="findAuthor",query="select cartoon.author from CartoonEntity cartoon where cartoon.name=:nme"),
   @NamedQuery(name="findcreatedDate",query="select cartoon.createdDate from CartoonEntity cartoon where cartoon.author=:at"),
    @NamedQuery(name="findnameAndcountry",query="select cartoon.name, cartoon.country from CartoonEntity cartoon where cartoon.author=:at"),
    @NamedQuery(name="updateAuthor",query="update CartoonEntity cartoon set cartoon.author=:at where cartoon.name=:nme"),
    @NamedQuery(name="updateTypeByName",query="update CartoonEntity cartoon set cartoon.type=:ty where cartoon.name=:nmt"),
     @NamedQuery(name="deleteByName",query="delete from CartoonEntity cartoon where cartoon.name=:nms")
})
public class CartoonEntity extends ParentEntity 
{
  @Id
  @Column(name="cartoon_id")
  @GenericGenerator(name = "auto", strategy = "increment")
  @GeneratedValue(generator = "auto")
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
