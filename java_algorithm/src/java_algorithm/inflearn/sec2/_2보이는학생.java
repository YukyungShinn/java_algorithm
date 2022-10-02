package java_algorithm.inflearn.sec2;

import java.util.Scanner;

public class _2보이는학생 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int answer=0;
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			int a=sc.nextInt();
			arr[i]=a;
		}
		int max=arr[0];
		for(int i=1;i<num;i++) {
			if(max<arr[i]) {
				answer+=1;
				max=arr[i];
			}
		}
		System.out.println(answer+1);

	}

}
