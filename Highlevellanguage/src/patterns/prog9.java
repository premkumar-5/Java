package patterns;

public class prog9 {
	public static void main(String[] args) {
		char ch=65;
		int a=1;
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
				if(row==2) {
					System.out.print(ch++);
				}else{
					System.out.print(a++);
				}
			}
			System.out.println();
		}
	}

}
/*123
ABC
123*/
