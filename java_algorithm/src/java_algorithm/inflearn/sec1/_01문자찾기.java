package java_algorithm.inflearn.sec1;

import java.util.Scanner;

public class _01문자찾기 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String input2=sc.next();
        char check=input2.toUpperCase().charAt(0);
        char check2=input2.toLowerCase().charAt(0);
        int count=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==check){
                count++;
            }
            else if(input.charAt(i)==check2) {
            	count++;
            }
        }
        System.out.println(count);
    }
}
