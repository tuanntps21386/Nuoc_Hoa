package com.poly.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int product_id;
	
	@Column(name = "product_name")
	String product_name;
	String trademark;
	String description;
	String image;
	Double price;
	
	public int product_id() {
		return product_id;
	}
	
	public void product_id(int product_id) {
		this.product_id = product_id;
	}
	
	public String product_name() {
		return product_name;
	}
	
	public void product_name(String product_name) {
		this.product_name = product_name;
	}
	
	public String trademark() {
		return trademark;
	}
	
	public void trademark(String trademark) {
		this.trademark = trademark;
	}
	
	public String description() {
		return description;
	}
	
	public void description(String description) {
		this.description = description;
	}
	
	public String image() {
		return image;
	}
	
	public void image(String image) {
		this.image = image;
	}
	
	public Double price() {
		return price;
	}
	
	public void price(Double price) {
		this.price = price;
	}
//	
//	@JsonIgnore
//	@OneToMany(mappedBy = "product")
//	List<Oders_Detail> orderDetails;
}
