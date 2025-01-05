package patterns;

public class prog5 {
	public static void main(String[] args) {
		char ch='A';
		for(char row=1;row<=3;row++) {
			for(char col=1;col<=3;col++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
//ABC
//DEF
//GHI