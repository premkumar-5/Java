package Conditions;

import java.util.Scanner;
public class prog {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value");
		char ch=scan.next().charAt(0);
		System.out.println(ch);
		character(ch);
	}

	public static void character(char ch) {
	if((ch>='A'  && ch<='B') || (ch>='a' && ch<='b')){
		System.out.println("Alphabets");
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("vowel");
			break;
			default:
				System.out.println("Consonant");
		}
	}else if(ch>='0' && ch<='9') {
		System.out.println("digit");
	}
	}
}
