package java_algorithm.programmers.level1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int len=s.length();
        int middle=len/2;
        if(len%2==0){
            answer+=s.charAt(middle-1);
            answer+=s.charAt(middle);
        }else{
            answer+=s.charAt(middle);
        }
        return answer;
    }
}
