package java_algorithm.inflearn.sec3;

import java.util.Scanner;

public class _6최대길이연속부분수열 {
	//강의참고
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans=0;
		int count=k;
		int lt=0;
		//rt=right , lt=left
		//count값=k번만 0을 1로 만들겠다는 의미
		//count가 0이하가 되어버리면? 그 전값까지 체크
		//https://danalee.tistory.com/m/7
		for(int rt=0;rt<n;rt++) {
	        if (arr[rt] == 0) count--;
	        while (count < 0) {
	            if (arr[lt] == 0) count++;
	            lt++;
	        }
	        ans = Math.max(ans, rt - lt + 1);
		}
		System.out.println(ans);
	}

}
