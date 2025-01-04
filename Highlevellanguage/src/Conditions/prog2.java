package Conditions;

import java.util.Scanner;
public class prog2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the physics mark:");
		double a=scan.nextDouble();
		System.out.println("enter the chemistry mark:");
		double b=scan.nextDouble();
		System.out.println("enter the maths mark:");
		double c=scan.nextDouble();
		System.out.println("enter the tamil mark:");
		double d=scan.nextDouble();
		System.out.println("enter the english mark:");
		double e=scan.nextDouble();
		System.out.println("total percentage");
		double percentage=(a+b+c+d+e)/5;
		scan.close();
		System.out.println("percentage:"+percentage);
	if(percentage>=90 && percentage<=100) {
    System.out.println("Grade A");
	}else if(percentage>=80){
		System.out.println("grade b");
	}else if(percentage>=70) {
		System.out.println("grade c");
	}else  if(percentage>=60) {
		System.out.println("grade d");
	}
}

}
