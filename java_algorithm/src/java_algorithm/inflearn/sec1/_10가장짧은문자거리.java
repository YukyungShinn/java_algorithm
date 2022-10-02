package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _10가장짧은문자거리 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		char T=t.charAt(0);
		int[] arr=new int[s.length()];
		//t의 위치 찾기
		for(int i=0;i<s.length();i++) {
			int min=0;
			if(s.charAt(i)==T) {
				arr[i]=0;
			}
			else {
				//t가 아닐경우 최소거리찾기
				for(int j=0;j<s.length();j++) {
					if(s.charAt(j)==T) {
						int find=Math.abs(j-i);//t의 값과 일치하는 j인덱스와의 거리
						
						//최소거리구하기
						if(min==0) {//아직 최소거리를 안구한경우
							min=find;
						}
						else if(min!=0 && min>find){//최소거리가 찾은 j값과의 거리보다 큰경우
							min=find;
						}
						//최소거리값 대입
						arr[i]=min;
					}
				}
			}
		}
		for(int i=0;i<s.length();i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
