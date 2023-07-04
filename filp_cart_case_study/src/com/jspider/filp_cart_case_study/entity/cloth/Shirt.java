package com.jspider.filp_cart_case_study.entity.cloth;

public class Shirt {
	
	private int t_id;
	private String brand;
	private double price;
	private int size;
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
		
	public Shirt(int t_id, String brand, double price, int size) {
		super();
		this.t_id = t_id;
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Shirt [ \n t_id=" + t_id + ", \n brand=" + brand + ", \n price=" + price + ", size=" + size + "]";
	}
	
	
	
	
}
