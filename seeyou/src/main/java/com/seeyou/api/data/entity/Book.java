package com.seeyou.api.data.entity;

import lombok.Generated;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Book {
	@Id @GeneratedValue
	private Long id;

	private String name;
	private String description;

}
