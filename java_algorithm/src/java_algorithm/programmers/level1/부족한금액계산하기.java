package java_algorithm.programmers.level1;

public class  부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long moneyAll=0;
        for(int i=1;i<=count;i++){
            moneyAll+=price*i;
        }
        if(moneyAll>money){
            answer=moneyAll-money;
        }
        else{
            answer=0;
        }
        
        return answer;
    }
}
