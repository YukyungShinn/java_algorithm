package java_algorithm.inflearn.sec2;

import java.util.Scanner;

public class _1큰수출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			arr[i]=a;
		}
		System.out.print(arr[0]+" ");
		for(int j=1;j<n;j++) {
			if(arr[j-1]<arr[j]) {
				System.out.print(arr[j]+" ");
			}
		}
	}

}
