package java_algorithm.inflearn.sec4;

import java.util.HashMap;
import java.util.Scanner;

public class _2아나그램_해쉬 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String[] A=a.split("");
		String[] B=b.split("");
		
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		HashMap<String,Integer> hash2=new HashMap<String,Integer>();
		for(int i=0;i<A.length;i++) {
			hash.put(A[i], hash.getOrDefault(A[i], 0)+1);
			hash2.put(B[i], hash2.getOrDefault(B[i], 0)+1);
		}
		int chk=0;
		for(String key:hash.keySet()) {
			if(hash.get(key)!=hash2.get(key)) {
				chk+=1;
			}
		}
		if(chk==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
