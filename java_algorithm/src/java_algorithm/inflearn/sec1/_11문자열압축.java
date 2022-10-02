package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _11문자열압축 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String[] arr=input.split("");
		String answer="";
		for(int i=0;i<arr.length;i++) {
			int chkDu=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])&&(arr[j].equals(arr[j-1]))) {
					chkDu+=1;
					arr[j]="";
				}
			}
			if(chkDu==0) {
				answer+=arr[i];
			}
			else {
				answer+=arr[i];
				char chkNumD=answer.charAt(answer.length()-1);//이전에숫자가 이미 있는경우 더 숫자값 추가 x
				if(chkNumD>='2'&&chkNumD<='9') {
					
				}else {
					answer+=(chkDu+1);
				}
			}
		}
		System.out.println(answer);
	}
}
