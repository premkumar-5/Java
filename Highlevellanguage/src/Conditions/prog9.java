package Conditions;

import java.util.Scanner;

public class prog9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the score:");
		double creditscore=scan.nextDouble();
		System.out.println("enter the income:");
		double income=scan.nextDouble();
		eligiblity(creditscore,income);
		scan.close();
	}
	public static void eligiblity(double creditscore,double income) {
		if(creditscore>450 && income >400000.0) {
			System.out.println("eligible to get a loan");
		}else {
			System.out.println("not elgible to get a loan");
		}
	}

}
