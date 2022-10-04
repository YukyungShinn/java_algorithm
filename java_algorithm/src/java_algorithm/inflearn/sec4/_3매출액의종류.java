package java_algorithm.inflearn.sec4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _3매출액의종류 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		List<Integer> answer=new ArrayList<>();
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<k-1;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		//슬라이딩 윈도우로 하나씩확인
		int left=0;
		for(int right=k-1;right<n;right++) {
			map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
			answer.add(map.size());
			//arr[left]키 값을 1 빼준다.
			map.put(arr[left], map.get(arr[left])-1);
			//arr[left]키값이 0이라면? -> 제거 후 left증가 (오른쪽으로이동)
			if(map.get(arr[left])==0) {
				map.remove(arr[left]);
			}
			left++;
		}
		for(Integer a:answer) {
			System.out.print(a+" ");
		}
	}

}
