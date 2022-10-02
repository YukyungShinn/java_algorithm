package java_algorithm.inflearn.sec2;

import java.util.Scanner;

public class _7점수계산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int count = 0;
        int result = 0;

        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        for(int i=0; i<num.length; i++){
            if(num[i]==1){
                count++;
            }else{
                count = 0;
            }
            result+=count;
        }
        System.out.println(result);

    }
}
