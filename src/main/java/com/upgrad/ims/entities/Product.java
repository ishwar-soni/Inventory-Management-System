package com.upgrad.ims.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor (access = AccessLevel.PUBLIC, force = true)
@Entity
public class Product {
	@Id
	private String code;
	private String name;
	private String category;
	private int quantity;
}
