package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _12암호 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String input=sc.next();
		String[] word=new String[num];
		String[] word2=new String[num];
		int[] num10=new int[num];
		char[] ans=new char[num];
		for(int i=0;i<num;i++) {
			//7개씩 짤라넣기
			word[i]=input.substring(0,7);
			word2[i]="";
			input=input.substring(7);
			for(int j=0;j<7;j++) {
				if(word[i].charAt(j)=='#') {
					word2[i]+="1";
				}else {
					word2[i]+="0";
				}
				//10진수로바꾸기
				if(word2[i].charAt(j)=='1') {
					num10[i]+=Math.pow(2, j-1);
				}
				ans[i]=(char)num10[i];
			}
			System.out.println(num10[i]);
			System.out.println(ans[i]);
		}
		
	}

}
