package java_algorithm.inflearn.sec3;

import java.util.Scanner;

public class _3최대매출 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] sales = new int[n];
		for(int i=0;i<n;i++) {
			sales[i]=sc.nextInt();
		}
		int MaxSales=0;
		
		int ans=0;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=sales[i];
		}
		ans=sum;
		//슬라이딩 윈도우 (왼쪽부터 여러개를 쓱싹쓱싹)
		for(int i=k;i<n;i++) {
			sum=sum+sales[i]-sales[i-k];//맨왼쪽값 빼고 맨오른쪽값 더하기
			if(ans<sum) {
				ans=sum;
			}
		}
		System.out.println(ans);
	}

}
