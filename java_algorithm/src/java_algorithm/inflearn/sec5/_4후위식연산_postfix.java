package java_algorithm.inflearn.sec5;

import java.util.*;

public class _4후위식연산_postfix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int a=0,b=0,z=0,result=0;
		Stack<Integer> st=new Stack<>();
		for(char x : input.toCharArray()) {
			if(x=='+'||x=='-'||x=='*'||x=='/'||x=='%') {
				b=st.pop();
				a=st.pop();
				
				z=postFix(a,b,x);
				
				st.push(z);
			}else {
				st.push(Character.getNumericValue(x));
			}
		}
		result=st.pop();
		System.out.println(result);
	}
	public static int postFix(int a, int b, char oper) {
		
		if(oper == '+') {
			return a+b;	
		}else if(oper == '-'){
			return a-b;
		}else if(oper == '*'){
			return a*b;
		}else if(oper == '/'){
			return a/b;
		}else{
			return a%b;
		}
			
	}
}
