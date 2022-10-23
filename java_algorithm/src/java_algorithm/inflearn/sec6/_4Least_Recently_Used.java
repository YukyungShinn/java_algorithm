package java_algorithm.inflearn.sec6;

import java.util.*;
import java.io.*;
//LRU 알고리즘
//가장 오랫동안 참조되지 않은 페이지를 교체하는 방식

public class _4Least_Recently_Used {

	public static void main(String[] args) {
		_4Least_Recently_Used Solution=new _4Least_Recently_Used();
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int x:Solution.solution(s,arr)) {
			System.out.print(x+" ");
		}
        

		
	}
	
	private int[] solution(int size,int[] task) {
		int[] cache=new int[size];
		for(int x:task) {
			int i;
			for(i=0;i<size;i++) {
				//같은 값이 있는 경우
				if(cache[i]==x) {
					//그자리부터 시작해서 한칸씩 뒤로 미루기
					while(i!=0) {
						cache[i]=cache[i-1];
						i--;
					}
					//제일 앞의 값 비어있으므로 x로 채우기
					cache[0]=x;
					break;
				}
			}
			//반복문을 끝까지 돌았을 경우, 제일 앞에 값 입력하기
			if(i==size) {
				while(i!=1) {
					i--;
					cache[i]=cache[i-1];
				}
				cache[0]=x;
			}
		}
		return cache;
	}

}
