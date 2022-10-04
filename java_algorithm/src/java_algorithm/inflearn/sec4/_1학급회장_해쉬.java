package java_algorithm.inflearn.sec4;

import java.util.HashMap;
import java.util.Scanner;

public class _1학급회장_해쉬 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String m=sc.next();
		int result=0;
		String ans="";
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		String[] arr=m.split("");
		for(int i=0;i<arr.length;i++) {
			//getOrDefault(a,b)는 key가 존재하면 a키에 매핑된 값을 반환하고, 없으면 b를 반환 
			hash.put(arr[i], hash.getOrDefault(arr[i], 0)+1);
		}
		int max=Integer.MIN_VALUE;
		for(String key:hash.keySet()) {
			if(hash.get(key)>max) {
				max=hash.get(key);
				ans=key;
			}
		}
		System.out.println(ans);
	}

}
