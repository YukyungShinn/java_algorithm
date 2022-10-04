package java_algorithm.inflearn.sec4;

import java.util.HashMap;
import java.util.Scanner;

public class _4모든아나그램찾기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();

		int ans=0;
		HashMap<Character,Integer> map=new HashMap<>();
		HashMap<Character,Integer> tt=new HashMap<>();
		//tt에 비교할 hash저장
		for(int i=0;i<t.length();i++) {
			tt.put(t.charAt(i), tt.getOrDefault(t.charAt(i), 0)+1);
		}
		for(int i=0;i<t.length()-1;i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		//슬라이딩 윈도우
		int left=0;
		for(int right=t.length()-1;right<s.length();right++) {
			map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
			if(map.equals(tt)) {
				ans++;
			}
			map.put(s.charAt(left), map.get(s.charAt(left))-1);
			
			if(map.get(s.charAt(left))==0) {
				map.remove(s.charAt(left));
			}
			left++;
		}
		
		System.out.println(ans);
	}

}
