package Conditions;

import java.util.Scanner;
public class prog4 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number:");
		int a=scan.nextInt();
	int res=number(a);
	System.out.println(res);
		
		scan.close();
	}
	public static int number(int a) {
		if(30-a>=0) {
		return 30;
		}else {
			return 3*a;
		}
	}

}
