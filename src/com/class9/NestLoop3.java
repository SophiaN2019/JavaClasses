package com.class9;

public class NestLoop3 {

	public static void main(String[] args) {

		for (int i = 0; i <= 9; i++) {
			

			for (int j = 0; j <= 9; j++) {
				

				for (int a = 0; a <= 9; a++) {
					

					for (int b = 0; b <= 9; b++) {
						System.out.println(i+""+j+""+a+""+ b);
						
					}
				}
			}

		}
	}
}