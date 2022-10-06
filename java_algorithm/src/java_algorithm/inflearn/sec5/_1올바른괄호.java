package java_algorithm.inflearn.sec5;

import java.util.*;

public class _1올바른괄호 {

	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == '(')
				stack.push(x);
			else {
				if (stack.isEmpty())
					return "NO";
				stack.pop();
			}
		}
		if (!stack.isEmpty())
			return "NO";
		return answer;
	}

	public static void main(String[] args) {
		_1올바른괄호 T = new _1올바른괄호();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
