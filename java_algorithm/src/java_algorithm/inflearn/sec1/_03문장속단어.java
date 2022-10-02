package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _03문장속단어 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] arr=input.split(" ");
		int maxSize=0;
		int maxIndex=0;
		for(int i=1;i<arr.length;i++) {
			maxSize=arr[maxIndex].length();
			if(maxSize<arr[i].length()) {
				maxSize=arr[i].length();
				maxIndex=i;
			}
		}
		System.out.println(arr[maxIndex]);
	}

}
