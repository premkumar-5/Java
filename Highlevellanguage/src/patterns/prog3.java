package patterns;

public class prog3 {
	public static void main(String[] args) {
		int n=6;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(row==n/2 || col==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
