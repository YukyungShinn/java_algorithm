package java_algorithm.inflearn.sec2;

import java.util.Scanner;

public class _6뒤집은소수 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		String[][] reverse=new String[n][1];

		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			arr[i]=a;
			String strA=Integer.toString(a);
			int lenA=strA.length();
			String strB="";
			for(int j=0;j<lenA;j++) {
			//Integer.parseInt쓰면 0을없애줌 , StringBuilder 에 뒤집는게있음
				if(strA.charAt(lenA-1-j)!='0') {
				strB+=strA.charAt(lenA-1-j);
				}
			}
			int B=Integer.parseInt(strB);
//			System.out.print(B+" ");
//			System.out.println("=========");
			int chk=0;
			for(int k=2;k<B;k++) {
				if(B%k==0) {
					chk+=1;
				}
			}
			if(chk==0&&(B!=1)) {
				System.out.print(B+" ");
			}
		}

	}

}
