package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _05특정문자뒤집기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		char[] answer=new char[input.length()];
		for(int i=0;i<input.length();i++) {
			int check=input.charAt(i)+0;
			if((check>=65&&check<=90)||(check>=97&&check<=122)) {
				answer[input.length()-i-1]=input.charAt(i);
			}
			else {
				answer[i]=input.charAt(i);
			}
		}
		System.out.print(answer);
	}

}
