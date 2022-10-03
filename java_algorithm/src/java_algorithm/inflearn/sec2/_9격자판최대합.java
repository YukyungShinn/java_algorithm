package java_algorithm.inflearn.sec2;

import java.util.Scanner;

public class _9격자판최대합 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int max=0;
		//가로 체크
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=arr[i][j];
			}
			if(sum>max) {
				max=sum;
			}
		}
		//세로체크
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=arr[j][i];
			}
			if(sum>max) {
				max=sum;
			}
		}
		//대각선 체크
		for(int i=0;i<n;i++) {
			int sum=0;
			sum+=arr[i][i];
			if(sum>max)max=sum;
			
			sum=0;
			sum+=arr[n-i-1][i];
			if(sum>max)max=sum;
		}
		System.out.println(max);
	}
	
}
