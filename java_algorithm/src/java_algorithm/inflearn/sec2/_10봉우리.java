package java_algorithm.inflearn.sec2;

import java.util.Scanner;

public class _10봉우리 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n+2][n+2];
		//값대입
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int chk=0;
		int ans=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int chkMax=arr[i+1][j+1];
				if(chkMax<=arr[i][j+1]||chkMax<=arr[i+1][j+2]||chkMax<=arr[i+2][j+1]||chkMax<=arr[i+1][j]) {
					chk+=1;
				}else {
					ans+=1;
				}
			}
		}
		System.out.println(ans);
	}

}
