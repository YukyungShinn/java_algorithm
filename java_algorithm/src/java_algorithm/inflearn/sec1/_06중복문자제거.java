package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _06중복문자제거 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String answer="";
		answer+=input.charAt(0);
		for(int i=1;i<input.length();i++) {
			int check=0;
			for(int j=0;j<i;j++) {
				if(input.charAt(i)==input.charAt(j)) {
					check+=1;
				}
			}
			if(check==0) {
				answer+=input.charAt(i);
			}
		}
		System.out.println(answer);
	}

}
