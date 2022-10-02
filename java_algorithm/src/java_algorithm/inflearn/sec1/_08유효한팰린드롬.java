package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _08유효한팰린드롬 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		String inp=in.toLowerCase();
		String input="";
		for(int i=0;i<inp.length();i++) {
			if((inp.charAt(i)>='A'&&inp.charAt(i)<='Z')||(inp.charAt(i)>='a'&&inp.charAt(i)<='z')) {
				input+=inp.charAt(i);
			}
		}
//		System.out.println(input);
		int check=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
				check+=1;
//				System.out.println(input.charAt(i));
//				System.out.println(input.charAt(input.length()-1-i));
			}
		}
		if(check==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
//			System.out.println(check);
		}
	}

}
