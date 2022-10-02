package java_algorithm.inflearn.sec2;

import java.util.Scanner;

public class _4피보나치수열 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		arr[0]=1;
		arr[1]=1;
		System.out.print(arr[0]+" "+arr[1]+" ");
		for(int i=2;i<n;i++) {
			arr[i]=arr[i-2]+arr[i-1];
			System.out.print(arr[i]+" ");
		}
	}
}
