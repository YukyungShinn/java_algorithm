package java_algorithm.programmers.level1;

import java.util.Arrays;

public class 최소직사각형 {
    public int solution(int[][] size) {
        int answer = 0;
        int len=size.length;
        int[] bigger=new int [len];
        int[] smaller=new int[len];
        //큰값끼리중에서 제일큰값 * 작은값끼리중에서 제일 큰값
        for(int i=0;i<len;i++){
            if(size[i][0]>=size[i][1]){
                bigger[i]=size[i][0];
                smaller[i]=size[i][1];
            }
            else{
                bigger[i]=size[i][1];
                smaller[i]=size[i][0];
            }
        }
        
        Arrays.sort(bigger);
        Arrays.sort(smaller);
        
        answer=bigger[len-1]*smaller[len-1];
        
        return answer;
    }
}
