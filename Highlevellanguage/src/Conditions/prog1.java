package Conditions;

import java.util.Scanner;
public class prog1 {
	public static void main(String[] args) {
		Scanner year=new Scanner(System.in);
		int a=year.nextInt();
		System.out.println("enter the year:");
		year(a);
	}
	public static void year(int a) 
	{
	if((a%4==0 && a%100!=0 )|| a%400==0);
	System.out.println("Its a leap year");
	else {
		System.out.println("not a leap year");
	

}
}
}
