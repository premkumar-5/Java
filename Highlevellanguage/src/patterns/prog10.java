package patterns;

import java.util.Scanner;
public class prog10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=scan.nextInt();
		int a=1;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(a<=9) {
				System.out.print("0"+a+++" ");
			}else {
				System.out.print(a+++" ");
			}
		}
			System.out.println();
	}

}
}
/*01 02 03 04 05            ******if n=5*****
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
*/