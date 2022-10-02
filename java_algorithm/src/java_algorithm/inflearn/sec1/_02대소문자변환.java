package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _02대소문자변환 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String answer="";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>=65 && input.charAt(i)<=90) {
				answer+=input.toLowerCase().charAt(i);
			}
			else {
				answer+=input.toUpperCase().charAt(i);
			}
		}
		System.out.println(answer);
	}
}
