package java_algorithm.inflearn.sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _6뒤집은소수 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size =in.nextInt();
        String[] arr = new String[size];
        // 입력받은 수를 저장
        for( int i=0; i<size; i++){
            arr[i] = in.next();
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<size; i++){
        	// 수를 뒤집어 저장
            int tmp = Integer.parseInt(new StringBuilder(arr[i]).reverse().toString());
            Boolean b = isPrime(tmp);

            if(b){
                list.add(tmp);
            }
        }

        for (Integer integer : list) {
            System.out.print(integer+" ");
        }

    }
    
    // 소수인지 판별하는 함수
    public static Boolean isPrime(int num){
        if( num == 1){
            return false;
        }
        for(int i=2; i<num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
