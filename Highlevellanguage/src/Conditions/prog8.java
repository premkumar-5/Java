package Conditions;

import java.util.Scanner;
public class prog8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the final amount:");
		double amount=scan.nextDouble();
		discount(amount);
		scan.close();
	}
	public static void discount(double amount) {
		if (amount>1000 && amount<3000) {
			System.out.println("Discount will be 10%");
			System.out.println(amount+amount*0.1);
		}
		else if (amount >=3000 && amount <6000) {
			System.out.println("Discount will be 20%");
			System.out.println(amount+amount*0.2);
			
		}
		else if (amount >=6000) {
			System.out.println("Discount will be 40%");
			System.out.println(amount+amount*0.4);
		}
			else {
				System.out.println("no Discount");
			
		}
	}
	}
