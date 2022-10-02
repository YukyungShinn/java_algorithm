package java_algorithm.programmers.level1;

public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum=0;
        int len=nums.length;
        //서로다른 3개 더하기
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                for(int k=j+1;k<len;k++){
                    sum=(nums[i]+nums[j]+nums[k]);
                    if(chkSosu(sum)==true){
                        answer+=1;
                        //System.out.println(sum);
                    }
                }
            }
        }
        

        return answer;
    }
    public boolean chkSosu(int num){
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
