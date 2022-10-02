package java_algorithm.programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public int solution(int[] nums) {
		int answer = 0;
        int num=(nums.length)/2;
        int[] result=new int [num];
        int chk=0;
        
        Set<Integer> n =new HashSet<>();
        for(int i=0;i<nums.length;i++) {
        	n.add(nums[i]);
        }
        if(n.size()>num){
            return num;
        }
        else{
            return n.size();
        }

    }
}
