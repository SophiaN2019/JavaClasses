package com.class6;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" is there a sale going on , True or False?");

		boolean sale = input.nextBoolean();
		double price;
		double discount;
		double finalprice;

		if (!sale ) {
		System.out.println(" I am not shopping");
		} else  {
			System.out.println(" Please enter the price of the item");
			price = input.nextDouble();

			if (price < 20) {
				discount = price* 0.10;
				finalprice = price- discount;
			} else if (price >= 20 && price < 100) {
				discount =price* .2;
				finalprice = price -discount;
			} else if (price >= 100 && price < 500) {
				discount = price*0.3;
				finalprice = price - discount;
			} else {
				discount =price* 0.5;
				finalprice = price - discount;
			}
			
				System.out.println("after " + discount + " the price of  the item reduce from " + price + "to " + finalprice);
	}
} }
