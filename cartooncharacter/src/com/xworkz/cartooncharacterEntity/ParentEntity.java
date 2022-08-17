package com.xworkz.cartooncharacterEntity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class ParentEntity 
{
 private String createdBy;
 private LocalDate createdDate;
 private String updatedBy;
 private LocalDate updatedDate;
 
}
