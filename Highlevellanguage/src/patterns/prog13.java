package patterns;

public class prog13 {
	public static void main(String[] args) {
		char ch=65;
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				if(row==col || row>=col)
				System.out.print(ch++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
