package com.jspider.filp_cart_case_study;

import java.util.Scanner;

import com.jspider.filp_cart_case_study.operation.Operation;

public class FlipCartMenu {

	private static Operation op=new Operation();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		boolean login=true;
		
		System.out.println("---------------Welcome Shopping Application---------------");
		while(login) {
			System.out.println("---------------Menu---------------");
			System.out.println("1.Add Product "
					+ "\n2.Delete Product"
					+ "\n3.Avaiable Product"
					+ "\n4.Search Product"
					+ "\n5.Exit");
			
			System.out.println("Enter the valid choice..!");
			
			switch(sc.nextInt()) {
			case 1:
				op.addProduct();
				break;
			case 2:
				op.deleteProduct();
				break;
			case 3:
				op.showProduct();
				break;
			case 4:
				op.searchProduct();
				break;
			case 5:
				login=false;
				System.out.println("Thanks for using Shopping app..!");
				break;
		
				
			default:
				System.out.println("Enter the valid choice..!");
				
			}
			
			
		}
		
		
		
		
	}
	
}
