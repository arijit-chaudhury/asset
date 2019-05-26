package com.example.assets.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Asset")
public class Asset implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false)
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="value", nullable=false)
	private double value;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "inventory_id")
//	private Inventory inventory;
	
	public Asset() {}

	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getValue() {
		return value;
	}
/*
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	*/
}
