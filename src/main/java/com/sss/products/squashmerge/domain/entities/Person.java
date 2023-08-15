package com.sss.products.squashmerge.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {

	@Id
	private Long id;

	@Column(name = "first_name")
	private String firstName;

}
