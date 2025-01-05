package patterns;

public class prog7 {
	public static void main(String[] args) {
		char ch='A';
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
				if(row==2) {
					System.out.print(ch++);
				}else {
					System.out.print(col);
				}
			}
			System.out.println();
		}
	}

}
//123
//ABC
//123
