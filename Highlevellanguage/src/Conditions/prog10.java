package Conditions;

import java.util.Scanner;

public class prog10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num:");
		int num=scan.nextInt();
		week(num);
		scan.close();
	}
	public static void week(int num) {
		switch(num) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
		    break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATURDAY");
			break;
			default:
				System.out.println("week has only 7 days");
		}
	}

}
