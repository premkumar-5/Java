package patterns;

import java.util.Scanner;

public class prog1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Number of rows and columns");
		int n=scan.nextInt();
		for(int row=1;row<=n;row++) {
		for(int col=1;col<=n;col++) {
		if(row+col<=n+1) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
		}
		System.out.println();
		
	}
	
	
	
		}
}
