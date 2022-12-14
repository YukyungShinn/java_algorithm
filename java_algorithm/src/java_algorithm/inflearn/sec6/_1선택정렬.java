package java_algorithm.inflearn.sec6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
//선택 정렬(selection sort)은 정렬되지 않은 데이터들에 대해
//가장 작은 데이터를 찾아 가장 앞의 데이터와 교환해나가는 방식
public class _1선택정렬 {

    public static void solution(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }

            swap(arr, i, idx);
        }
    }

    private static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
