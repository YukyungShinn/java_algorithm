package java_algorithm.programmers.level1;

import java.util.Scanner;

public class 숫자문자열과영단어_카카오 {
    public int solution(String s) {
        //contains(), replace(A,B)를 사용하자.
        String answer=s;
		String number[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String num[]= {"0","1","2","3","4","5","6","7","8","9"};
		for(int i=0;i<number.length;i++) {
			if(s.contains(number[i])) {
				answer=answer.replace(number[i], num[i]);
			}
		}
        return Integer.valueOf(answer);

    }
}
