package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _07회문문자열 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.next();
		String input=in.toLowerCase();
		int check=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
				check+=1;
			}
		}
		if(check==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
