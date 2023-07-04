package com.jspider.filp_cart_case_study.operation;
import com.jspider.filp_cart_case_study.entity.eletronics.Laptop;
import com.jspider.filp_cart_case_study.entity.eletronics.Mobile;
import com.jspider.filp_cart_case_study.entity.cloth.Pant;
import com.jspider.filp_cart_case_study.entity.cloth.Shirt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

public class Operation {
    
	private List<Laptop>laptop=new ArrayList<>();
	private List<Mobile>mobile=new ArrayList<>();
	private List<Pant>pant=new ArrayList<>();
	private List<Shirt>shirt=new ArrayList<>();
	
	Scanner sc=new Scanner(System.in);
	
	public void addProduct() {
	
		System.out.println("Which product do you want add..!");
		System.out.println("1.Eletronics \n2.Cloth \n3.Back");
		System.out.println("Enter your choice..!");
		
		switch(sc.nextInt()) {
	
		case 1:
			System.out.println("1.Mobile \n2.Laptop");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter how many you want add..!");
				int n1=sc.nextInt();
				
				for(int i=1;i<=n1;i++) {
					
					System.out.println("Enter the Mobile id");
					int m_id=sc.nextInt();
					System.out.println("Enter the Name ");
					String name=sc.next();
					System.out.println("Enter the brand ");
					String brand=sc.next();
					System.out.println("Enter the ram ");
					int ram=sc.nextInt();
					System.out.println("Enter the price ");
					double price=sc.nextDouble();
					
					mobile.add(new Mobile(m_id, name, brand, ram, price));
					
					System.out.println("Mobile added..!");
					
				}
				
				break;
			case 2:
				
				System.out.println("Enter how many you want add..!");
				int n2=sc.nextInt();
				
				for(int i=1;i<=n2;i++) {
					
					System.out.println("Enter the Laptop id");
					int m_id=sc.nextInt();
					System.out.println("Enter the Name ");
					String name=sc.next();
					System.out.println("Enter the brand ");
					String brand=sc.next();
					System.out.println("Enter the ram ");
					int ram=sc.nextInt();
					System.out.println("Enter the ssd ");
					int ssd =sc.nextInt();
					System.out.println("Enter the price ");
					double price=sc.nextDouble();
					laptop.add(new Laptop(m_id, name, brand, price, ram, ssd));					
					System.out.println("Laptop added..!");
					
				}
				
				break;
			case 3:
				return;
			default:
				System.out.println("Enter the valid choice..!");
			}
			break;
		case 2:
			System.out.println("1.Shirt \n2.Pant");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter how many you want add..!");
				int n1=sc.nextInt();
				
				for(int i=1;i<=n1;i++) {
					
					System.out.println("Enter the Shirt id");
					int m_id=sc.nextInt();
					System.out.println("Enter the brand ");
					String brand=sc.next();
					System.out.println("Enter the size ");
					int size =sc.nextInt();
					System.out.println("Enter the price ");
					double price=sc.nextDouble();
					
					shirt.add(new Shirt(m_id, brand, price, size));
					
					System.out.println("Shirt added..!");
					
				}
				break;
			case 2:
				System.out.println("Enter how many you want add..!");
				int n2=sc.nextInt();
				
				for(int i=1;i<=n2;i++) {
					
					System.out.println("Enter the Pant id");
					int m_id=sc.nextInt();
					System.out.println("Enter the brand ");
					String brand=sc.next();
					System.out.println("Enter the size ");
					int size =sc.nextInt();
					System.out.println("Enter the price ");
					double price=sc.nextDouble();
					
					pant.add(new Pant(m_id, brand, price, size));
					
					System.out.println("Pant added..!");
					
				}
				break;
			default:
				System.out.println("Enter the valid choice..!");
			}
			break;
		default:
			System.out.println("Enter the valid option..!");
		}
		
	}
	
	public void showProduct() {
		System.out.println("==================Avaibale Products==================");
		System.out.println("What product do want to see..!");
		System.out.println("1.Eletronics \n2.Cloth \n3.Go back");
		switch(sc.nextInt()) {
			
		case 1:
			System.out.println("1.Mobile \n2.Laptop");
			switch(sc.nextInt()) {
			case 1:
				if(mobile.isEmpty()==false) {
					for(Mobile m:mobile) {
						System.out.println(m);
					}
				}else {
					System.out.println("Mobiles not Avaiable..!");
				}
				
				break;
			case 2:
				if(laptop.isEmpty()==false) {
					for(Laptop l:laptop) {
						System.out.println(l);
					}
				}else{
					System.out.println("Laptops not Avaiable..!");
				}
				
				break;
			}
			break;
		case 2:
			System.out.println("1.Shirt \n2.Pant");
			switch(sc.nextInt()) {
			case 1:
				if(shirt.isEmpty()==false) {
					for(Shirt s:shirt) {
						System.out.println(s);
					}
				}else {
					System.out.println("Shirts not Avaiable..!");
				}
				
				break;
			case 2:
				if(pant.isEmpty()==false) {
					for(Pant p:pant) {
						System.out.println(p);
					}
					
				}else {
					System.out.println("Pants not Avaibale..!");
				}
				
				break;
			}
			break;
		case 3:
			return;
		default:
			System.out.println("Choose valid option..!");
		
		}
		
		
		
	}
	
	public void deleteProduct() {
	
		System.out.println("What product do want to see..!");
		System.out.println("1.Eletronics \n2.Cloth \n3.Go back");
		switch(sc.nextInt()) {
			
		case 1:
			System.out.println("1.Mobile \n2.Laptop");
			switch(sc.nextInt()) {
			case 1:
				if(mobile.isEmpty()==false) {
					System.out.println("==================Avaiable Mobile==================");
					for(Mobile m:mobile) {
						System.out.println(m);
					}
					
					System.out.println("Enter the mobile id to delete..!");
					int m_id=sc.nextInt();
					for(Mobile m:mobile) {
						if(m.getM_id()==m_id) {
							mobile.remove(m);
							break;
						}
					}
					System.out.println("Mobile deleted..!");
				}else {
					System.out.println("Mobiles not avaiable..!");
				}
				break;
			case 2:
				if(laptop.isEmpty()==false) {
					System.out.println("==================Avaiable Laptops==================");
					for(Laptop m:laptop) {
						System.out.println(m);
					}
					
					System.out.println("Enter the laptop id to delete..!");
					int l_id=sc.nextInt();
					for(Laptop m:laptop) {
						if(m.getL_id()==l_id) {
							laptop.remove(m);
							break;
						}
					}
					System.out.println("Laptop deleted..!");
				}else {
					System.out.println("Laptop not avaiable..!");
				}
				break;
	
			}
			break;
		case 2:
			System.out.println("1.Shirt \n2.Pant");
			switch(sc.nextInt()) {
			case 1:
				if(shirt.isEmpty()==false) {
					System.out.println("==================Avaiable Shirts==================");
					for(Shirt m:shirt) {
						System.out.println(m);
					}
					
					System.out.println("Enter the shirt id to delete..!");
					int s_id=sc.nextInt();
					for(Shirt m:shirt) {
						if(m.getT_id()==s_id) {
							shirt.remove(m);
							break;
						}
					}
					System.out.println("Shirt deleted..!");
				}else {
					System.out.println("Shirts not avaiable..!");
				}
				break;
			case 2:
				if(pant.isEmpty()==false) {
					System.out.println("==================Avaiable Pants==================");
					for(Pant m:pant) {
						System.out.println(m);
					}
					
					System.out.println("Enter the pants id to delete..!");
					int p_id=sc.nextInt();
					for(Pant m:pant) {
						if(m.getP_id()==p_id) {
							pant.remove(m);
							break;
						}
					}
					System.out.println("Pant deleted..!");
				}else {
					System.out.println("Pants not avaiable..!");
				}
				break;
			}
			break;
		case 3:
			return ;
		default:
			System.out.println("Enter the valid choice..!");
		
		}
		
	}
	public void display(ArrayList al) {
		
		for(Object a:al) {
			System.out.println(a);
		}
		
	}
	public void searchProduct() {
		
		System.out.println("What would you like to search..!");
		System.out.println("1.Eletronics \n2.Cloth \n3.Go back");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("1.Mobile \n2.Laptop ");
			switch(sc.nextInt()) {
			case 1:
				if(mobile.isEmpty()==false) {
					System.out.println("=========Search By=========");
					System.out.println("1.Mobile Id \n2.Name \n3.Brand");
					switch(sc.nextInt()) {
					case 1:
						ArrayList a1=new ArrayList();
						System.out.println("Enter the Mobile id..!");
						int m_id=sc.nextInt();
						for(Mobile m:mobile) {
							if(m.getM_id()==m_id) {
								a1.add(m);
							}
						}
						display(a1);
						break;
					case 2:
						ArrayList a2=new ArrayList();
						System.out.println("Enter the Name..!");
						String name=sc.next();
						for(Mobile m:mobile) {
							if(m.getName().equalsIgnoreCase(name)) {
								a2.add(m);
							}
						}
						display(a2);
						break;
					case 3:
						ArrayList a3=new ArrayList();
						System.out.println("Enter the brand..!");
						String brand=sc.next();
						for(Mobile m:mobile) {
							if(m.getBrand().equalsIgnoreCase(brand)) {
								a3.add(m);
							}
						}
						display(a3);
						break;
						
					}
				}else {
					System.out.println("Mobiles not aviables..!");
				}
				break;
			case 2:
				if(laptop.isEmpty()==false) {
				System.out.println("=========Search By=========");
				System.out.println("1.Laptop Id \n2.Name \n3.Brand");
				switch(sc.nextInt()) {
				case 1:
					ArrayList a1=new ArrayList();
					System.out.println("Enter the Laptop id..!");
					int l_id=sc.nextInt();
					for(Laptop m:laptop) {
						if(m.getL_id()==l_id) {
							a1.add(m);
						}
					}
					display(a1);
					break;
				case 2:
					ArrayList a2=new ArrayList();
					System.out.println("Enter the Name..!");
					String name=sc.next();
					for(Laptop m:laptop) {
						if(m.getName().equalsIgnoreCase(name)) {
							a2.add(m);
						}
					}
					display(a2);
					break;
				case 3:
					ArrayList a3=new ArrayList();
					System.out.println("Enter the brand..!");
					String brand=sc.next();
					for(Laptop m:laptop) {
						if(m.getBrand().equalsIgnoreCase(brand)) {
							a3.add(m);
						}
					}
					display(a3);
					break;
					
				}
			}else{
				System.out.println("Laptops not avaiable..!");
			}
				break;
			}
			break;
		case 2:
			System.out.println("1.Shirt \n2.Pant ");
			switch(sc.nextInt()) {
			case 1:
				if(shirt.isEmpty()==false) {
					System.out.println("=========Search By=========");
					System.out.println("1.Shirt Id \n2.Brand");
					switch(sc.nextInt()) {
					case 1:
						ArrayList a1=new ArrayList();
						System.out.println("Enter the Shirt id..!");
						int s_id=sc.nextInt();
						for(Shirt m:shirt) {
							if(m.getT_id()==s_id) {
								a1.add(m);
							}
						}
						display(a1);
						break;
					case 2:
						ArrayList a3=new ArrayList();
						System.out.println("Enter the brand..!");
						String brand=sc.next();
						for(Shirt m:shirt) {
							if(m.getBrand().equalsIgnoreCase(brand)) {
								a3.add(m);
							}
						}
						display(a3);
						break;
						
					}
				}else {
					System.out.println("Shirts not avaibles.!");
				}
				break;
			case 2:
				if(pant.isEmpty()==false) {
				System.out.println("=========Search By=========");
				System.out.println("1.Pant Id \n2.Brand");
				switch(sc.nextInt()) {
				case 1:
					ArrayList a1=new ArrayList();
					System.out.println("Enter the Pant id..!");
					int p_id=sc.nextInt();
					for(Pant m:pant) {
						if(m.getP_id()==p_id) {
							a1.add(m);
						}
					}
					display(a1);
					break;
				case 2:
					ArrayList a3=new ArrayList();
					System.out.println("Enter the brand..!");
					String brand=sc.next();
					for(Laptop m:laptop) {
						if(m.getBrand().equalsIgnoreCase(brand)) {
							a3.add(m);
						}
					}
					display(a3);
					break;
					
				}
			}else {
				System.out.println("Pants not Avaiables..!");
			}
				break;
			}
			break;
		case 3:
			return;
		default:
			System.out.println("Enter the valid choice..!");
		}
		
	}
	
}
