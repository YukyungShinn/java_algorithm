package java_algorithm.inflearn.sec2;

import java.util.Scanner;

public class _5에라토스테네스의체 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num[]= new int[n+1];
		int result=0;
		
		for(int i=2;i<num.length;i++) {
			if(num[i]==0) {
				result++;
			}
			for(int j=i;j<num.length;j+=i) {
				num[j]=1;
			}
		}
		
		System.out.println(result);	
	}
}

