package java_algorithm.inflearn.sec3;

import java.util.Arrays;
import java.util.Scanner;

public class _1두배열합치기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		int[] ans=new int[n+m];
		for(int i=0;i<n;i++) {
			ans[i]=arr1[i];
		}
		for(int i=0;i<m;i++) {
			ans[n+i]=arr2[i];
		}
		Arrays.sort(ans);
		for(int a : ans) {
			System.out.print(a+" ");
		}
	}

}
