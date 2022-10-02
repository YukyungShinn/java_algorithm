package java_algorithm.inflearn.sec2;

import java.util.Arrays;
import java.util.Scanner;

public class _8등수구하기 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] grade=new int[n];
		int count;
		for(int i=0;i<n;i++) {
			grade[i]=sc.nextInt();
		}
		int[] sort=grade.clone();
		for(int i=0;i<grade.length;i++) {
			count=1;
			for(int j=0;j<grade.length;j++) {
				if(grade[i]<grade[j]) {
					count++;
				}
			}
			sort[i]=count;
		}
		Arrays.stream(sort).forEach((s)->System.out.print(s+" "));
	}

}
