package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _04단어뒤집기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String[] arr=new String[num];
		String[] answer=new String[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.next();
			answer[i]="";//answer에 값 없으면 null이 자꾸 출력됨
			for(int j=0;j<arr[i].length();j++) {
				answer[i]+=arr[i].charAt(arr[i].length()-j-1);
//				System.out.println(arr[i].length()-j-1);
			}
		}
		for(int i=0;i<num;i++) {
			System.out.println(answer[i]);
		}
	}
}
