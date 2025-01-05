package patterns;

public class prog16 {
	public static void main(String[] args) {
		char ch=65;
		int a=1;
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				if(row==col || row>=col) {
					if(row==2 || row==4) {
						System.out.print(ch++);
					}else
					System.out.print(a++);
					}
				}
			System.out.println();
			}
		}
	}

