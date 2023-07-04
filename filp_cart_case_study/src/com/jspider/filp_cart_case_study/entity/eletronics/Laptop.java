package com.jspider.filp_cart_case_study.entity.eletronics;

public class Laptop {

	private int l_id;
	private String name;
	private String brand;
	private double price;
	private int ram;
	private int ssd;
	
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	
	public Laptop(int l_id, String name, String brand, double price, int ram, int ssd) {
		super();
		this.l_id = l_id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.ssd = ssd;
	}
	
	@Override
	public String toString() {
		return "Laptop [ \n l_id=" + l_id + ", \n name=" + name + ", \n brand=" + brand + ", \n price=" + price + ", \n ram=" + ram
				+ ", \n ssd=" + ssd + "]";
	}
	
	
	
	
	
	
	
}
