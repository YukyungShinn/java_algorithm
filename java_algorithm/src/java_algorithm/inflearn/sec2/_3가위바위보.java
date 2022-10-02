package java_algorithm.inflearn.sec2;

import java.util.Scanner;

public class _3가위바위보 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] A=new int[n];
		int[] B=new int[n];
		
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			A[i]=a;
		}
		for(int j=0;j<n;j++) {
			int b=sc.nextInt();
			B[j]=b;
		}
		for(int k=0;k<n;k++) {
			if(A[k]==B[k]) {
				System.out.println("D");
			}
			else {
				switch(A[k]) {
				case 1: if(B[k]==2) {System.out.println("B");}else {System.out.println("A");}break;
				case 2: if(B[k]==1) {System.out.println("A");}else {System.out.println("B");}break;
				case 3: if(B[k]==1) {System.out.println("B");}else {System.out.println("A");}break;
				}
			}
		}

	}

}
