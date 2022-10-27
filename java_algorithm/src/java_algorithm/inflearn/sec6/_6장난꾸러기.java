package java_algorithm.inflearn.sec6;

import java.util.*;

public class _6장난꾸러기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> answer = new ArrayList<>();
		int[] temp=arr.clone();
		Arrays.sort(temp);
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=temp[i]) {
				answer.add(i+1);//n번째 니까 +1을 해줘야한다. 
			}
		}
		
		for(int x:answer) {
			System.out.print(x+" ");
		}
		
	}

}
