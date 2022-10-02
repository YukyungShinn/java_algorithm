package java_algorithm.programmers.level1;

public class _2016년 {
    public String solution(int a, int b) {
        String answer = "";
        String[] day={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        int days=4;
        
        switch(a){
            case 12:days+=30;
            case 11:days+=31;
            case 10:days+=30;
            case 9:days+=31;
            case 8:days+=31;
            case 7:days+=30;
            case 6:days+=31;
            case 5:days+=30;
            case 4:days+=31;
            case 3:days+=29;
            case 2:days+=31;
        }
        days+=b;
        
        for(int i=0;i<=6;i++){
            if(days%7==i){
                answer=day[i];
            }
        }
        return answer;
    }
}
