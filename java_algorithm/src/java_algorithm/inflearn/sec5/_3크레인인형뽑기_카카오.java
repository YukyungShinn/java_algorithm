package java_algorithm.inflearn.sec5;

import java.util.*;

public class _3크레인인형뽑기_카카오 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int m=sc.nextInt();
		int[] moves=new int[m];
		for(int i=0;i<m;i++) {
			moves[i]=sc.nextInt();
		}
		//stack 마지막 뽑는 함수 peek()
		Stack<Integer> st=new Stack<Integer>();
		//st.peek()
		int ans=0;
		pick:
		for(int i=0;i<m;i++) {
			out:
			for(int j=0;j<n;j++) {
				if(arr[j][moves[i]-1]!=0) {
//					System.out.println("지금뽑은애 = "+arr[j][moves[i]-1]);
					if(st.empty())
					{	
						st.push(arr[j][moves[i]-1]);
						arr[j][moves[i]-1]=0;
						continue pick;
					}
					if(st.peek()==arr[j][moves[i]-1]) {
						st.pop();
						arr[j][moves[i]-1]=0;
						ans+=2;
						break out;
					}else {
					st.push(arr[j][moves[i]-1]);
					arr[j][moves[i]-1]=0;
					break out;
					}
				}
			}
		}

		System.out.println(ans);
		
	}

}
