package java_algorithm.inflearn.sec6;

import java.util.Arrays;
import java.util.Scanner;

public class _5중복확인 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int chk=0;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				chk++;
			}
		}
		
		if(chk==0) {
			System.out.println("U");
		}else {
			System.out.println("D");
		}
	}

}
