package patterns;

public class prog15 {
	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				if(row==col || row>=col) {
				System.out.print(col);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
