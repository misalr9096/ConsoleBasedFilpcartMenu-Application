package com.jspider.filp_cart_case_study.entity.eletronics;

public class Mobile {

	private int m_id;
	private String name;
	private String brand;
	private int ram;
	private double price;
	
	public Mobile(int m_id, String name, String brand, int ram, double price) {
		super();
		this.m_id = m_id;
		this.name = name;
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		return "Mobile [ \n m_id=" + m_id + ", \n name=" + name + ",  \n brand=" + brand + ", \n ram=" + ram + ", \n price=" + price
				+ "]";
	}
	
	
	
	
	
	
	
}
