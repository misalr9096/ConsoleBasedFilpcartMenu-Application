package com.jspider.filp_cart_case_study.entity.cloth;

public class Pant {

	private int p_id;
	private String brand;
	private double price;
	private int size;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
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
	
	
	
	public Pant(int p_id, String brand, double price, int size) {
		super();
		this.p_id = p_id;
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Pant [p_id=" + p_id + ", brand=" + brand + ", price=" + price + ", size=" + size + "]";
	}
	
	
	
}
