package java_algorithm.inflearn.sec6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교 하여, 
 * 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘
 * */
public class _3삽입정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

	}

	private static void solution(int n, int[] arr) {
		for(int i=1;i<n;i++) {
			int target=arr[i];
			int j=i-1;
			//j가 0보다 크고, target값이 arr[j]보다 작을 경우까지 진행
			while(j>=0&& target<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			/*
			 * 위 반복문에서 탈출할 경우 앞의 원소가 타겟보다 작다는 의미
			 * 타겟 원소는 j번째 뒤에 와야함 -> j+1에 위치
			 * */
			arr[j+1]=target;
		}
		
	}

}
