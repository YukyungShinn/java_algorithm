package java_algorithm.programmers.level1;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int m=0;m<commands.length;m++){
            int i=commands[m][0];
            int j=commands[m][1];
            int k=commands[m][2];
            int newA[]= new int[j-i+1];

            for(int a=i;a<=j;a++){
                newA[a-i]=array[a-1];
            }
            Arrays.sort(newA);
            answer[m]=newA[k-1];
        }
        return answer;
    }
}
