package Conditions;

import java.util.Scanner;

public class prog6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Basic salary");
		double basicsalary=scan.nextDouble();
		System.out.println("Enter jonining Year");
		int joiningyear=scan.nextInt();
		System.out.println("Enter Current Year");
		int currentyear=scan.nextInt();
		prog6 obj=new prog6();
		obj.gross(basicsalary,joiningyear,currentyear);
		scan.close();
	}
	public void gross(double basic,int join,int current) {
		if(current-join>=3) {
			if(basic<=10000) {
				System.out.println(basic+0.2*basic+0.8*basic+2500);
			}else if(basic<=20000) {
				System.out.println(basic+0.25*basic+0.9*basic+2500);
			}else if(basic>20000) {
				System.out.println(basic+0.3*basic+0.95*basic+2500);
			}
		}else {if(current-join<3) {
			if(basic<=10000) {
				System.out.println(basic+0.2*basic+0.8*basic);
			}else if(basic<=20000) {
				System.out.println(basic+0.25*basic+0.9*basic);
			}else if(basic>20000) {
				System.out.println(basic+0.3*basic+0.95*basic);
			}
		}
	}

}
}
