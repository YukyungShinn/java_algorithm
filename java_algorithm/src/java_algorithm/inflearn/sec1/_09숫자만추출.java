package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _09숫자만추출 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String answer="";
		int chkIndex=0;
		for(int i=0;i<input.length();i++) {
			if(chkIndex==0) {
				if(input.charAt(i)>='1'&&input.charAt(i)<='9') {
					answer+=input.charAt(i);
					chkIndex+=1;
				}
			}
			else {
				if(input.charAt(i)>='0'&&input.charAt(i)<='9') {
					answer+=input.charAt(i);
				}
			}
		}
		System.out.println(answer);
	}

}
