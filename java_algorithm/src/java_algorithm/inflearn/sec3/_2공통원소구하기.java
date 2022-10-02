package java_algorithm.inflearn.sec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _2공통원소구하기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		//투포인터 사용하기
		/*
		 * p1,p2가 지정한 값이 같을경우 둘다 p추가
		 * b의 p2가 가리키는 값이 a의 p1이 가리키는 값보다 큰경우 p1만 옮기기 (정렬을 한 상태임)
		 * 반대의 경우 p2를 옮기기
		 */
		List<Integer> ans=new ArrayList<>();
		int p1=0;int p2=0;
		while(p1<n&&p2<m) {
			if(a[p1]==b[p2]) {
				ans.add(a[p1++]);
				p2++;
			}else if(a[p1]<b[p2]) {
				p1++;
			}else {
				p2++;
			}
		}
		
		for(Integer i : ans) {
			System.out.print(i+" ");
		}
	}

}
