package java_algorithm.inflearn.sec5;

import java.util.*;

public class _2괄호문자제거 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		Stack<Character> st=new Stack<Character>();
		for(char x:word.toCharArray()) {
			if(x!=')') {
				st.push(x);
			}else {
					for(int i=st.size()-1;i>=0;i--) {
						//System.out.println(st.get(i));
						if(st.get(i)=='(') {
							st.pop();
							break;
						}else
							st.pop();
					}
			}
		}
		for(char x:st) {
			System.out.print(x);
		}
	}

}
