package patterns;

public class Prog17 {
	public static void main(String[] args) {
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=5;col++) {
				if(row==3|| col==3||(row==2 && col%2==0)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
