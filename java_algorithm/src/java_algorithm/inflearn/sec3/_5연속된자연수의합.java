package java_algorithm.inflearn.sec3;

import java.util.Scanner;

public class _5연속된자연수의합 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int ans=0;
		int p=1;
		//2개이상의합이므로 n/2만큼만 계산해도된다.
		//p는 포인터라고 보면된다.
		
		//n/2+1 짝수이면 괜히한번더연산함. 이를 (int)Math.ceil(n/2)로 해주면 문제해결 
		for(int i=1;i<=n/2+1;i++) {
			sum+=i;
			if(sum==n) ans++;
			
			while(sum>=n) {
				sum-=p;
				p++;
				if(sum==n) ans++;
			}
		}
		System.out.println(ans);
	}

}
