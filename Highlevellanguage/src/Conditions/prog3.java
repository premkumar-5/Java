package Conditions;

import java.util.Scanner;
public class prog3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length:");
		int a=scan.nextInt();
		System.out.println("enter breadth:");
		int b=scan.nextInt();
		rectangle(a,b);
		scan.close();
	}
	public static void rectangle(int a,int b) {
		if(2*(a+b)<a*b) {
			System.out.println("Area is greater than perimeter");
		}else {
			System.out.println("Area is not greater than Perimeter");
		}
	}

}
