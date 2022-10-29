package java_algorithm.inflearn.sec6;

import java.util.Arrays;
import java.util.Scanner;

public class _8이분검색 {
//이분검색(Binary Search) = 이진탐색
/*
 * 배열의 중앙값을 조사하기위해 항목을 왼쪽 또는 오른쪽 부분배열에 있는지 알아내 탐색 범위를 반으로 줄이는 방법.
 * 주로 고정된 데이터에 대한 탐색에 적합하다. 
 * 
 * 구현방법
 * 1. 탐색의 대상이 되는 자료들이 정렬되어있어야함 - array[low]부터 array[high]까지
 * 2. low와 high값에 의거해 중간값은 mid=(low+high)/2
 * 3. array[mid]값과 구하려는 key값 비교
 * 		key>mid : low를 mid+1로 만들기
 * 		key<mid : high를 mid-1로 만들기
 * 		key==mid : 구하려는 값 찾음. 중간값 리턴
 * 4. low>high가 될때까지 반복
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int low=0;
		int high=n-1;
		int mid=0;
		while(true) {
			mid=(low+high)/2;
			if(m>arr[mid]) {
				low=mid+1;
			}else if(m<arr[mid]) {
				high=mid-1;
			}else {
				break;
			}
		}
		
		System.out.println(mid+1);
		
		
	}

}
