package java_algorithm.inflearn.sec3;

import java.util.Scanner;

public class _4연속부분수열 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans=0;
		int p1=0;
		int sum=0;
		//얘도 투포인터!
		for(int p2=0;p2<arr.length;p2++) {
			sum+=arr[p2];
			if(sum==m)
				ans++;
			while(sum>m) {
				sum-=arr[p1];
				p1++;
				if(sum==m)
					ans++;
			}
		}
		System.out.println(ans);

	}

}
