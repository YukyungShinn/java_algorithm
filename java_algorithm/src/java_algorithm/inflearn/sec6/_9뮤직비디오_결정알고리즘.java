package java_algorithm.inflearn.sec6;

import java.util.Arrays;
import java.util.Scanner;

public class _9뮤직비디오_결정알고리즘 {
//결정알고리즘(Parametric Search) : 주어진 범위 내에서 원하는 값 또는 조건에 가장 일치하는 값 찾아내는 알고리즘
	/*
	 * 이진탐색과 비슷하나 count하는 부분이 추가된다. 답이 될 수 있는 조건을 먼저 파악하자. 숫자 그룹의 수가 target보다 작아야한다.
	 * mid값 증가 또는 감소에 따라 count값이 어떻게 되는지 파악하자. mid값이 증가하면 count는 줄어든다. 그럼 count를 늘리고
	 * 싶으면 mid를 줄이고 count를 줄이고 싶으면 mid를 늘리면 된다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int low = Arrays.stream(arr).max().getAsInt(); // 가장 큰 값 1개
		int high = Arrays.stream(arr).sum(); // 총합!
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (count(arr, mid) <= m) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println(ans);

	}

	public static int count(int[] arr, int capacity) {
		int cnt = 1, sum = 0;
		for (int x : arr) {
			if (sum + x > capacity) { // 용량보다 커지면 다음 dvd로 넘어감
				cnt++;
				sum = x;
			} else
				sum += x; // 용량이 아직 남아있다면 현재 dvd에 더 넣어줌
		}
		return cnt;
	}

}
