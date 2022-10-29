package java_algorithm.inflearn.sec6;

import java.util.Arrays;
import java.util.Scanner;

public class _10마구간정하기_결정알고리즘 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int ans=0;
		int low=1;
		int high=arr[n-1];
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(count(arr,mid)>=c) {
				ans=mid;
				low=mid+1;
			}else
				high=mid-1;
		}
		System.out.println(ans);
	}
	
	private static int count(int[] arr,int mid) {
		int cnt=1;
		int ep=arr[0];
		for(int pos:arr) {
			//arr[0]과의 거리가 mid(중간값)보다 클경우 마구간을 설치(마구간수 +1, ep(왼쪽기준점) 변경)
			if(pos-ep>=mid) {
				cnt++;
				ep=pos;
			}
		}
		return cnt;
	}

}
