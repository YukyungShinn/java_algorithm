package java_algorithm.programmers.level1;

public class 비밀지도_카카오 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] map1=new String[n];
        String[] map2=new String[n];
        
        for(int i=0;i<n;i++){
            map1[i]="";
            for(int j=n-1;j>=0;j--){
                double minus = Math.pow(2,j);
                if(arr1[i]-minus>=0){
                    map1[i]+="#"; 
                    arr1[i]-=minus;
                }else{
                    map1[i]+="0";
                }
            }
        }
        for(int i=0;i<n;i++){
            map2[i]="";
            for(int j=n-1;j>=0;j--){
                double minus = Math.pow(2,j);
                if(arr2[i]-minus>=0){
                    map2[i]+="#"; 
                    arr2[i]-=minus;
                }else{
                    map2[i]+=" ";
                }
            }
        }
        for(int i=0;i<n;i++){
            answer[i]="";
            for(int j=0;j<n;j++){
                if(map1[i].charAt(j)=='#'||map2[i].charAt(j)=='#'){
                    answer[i]+="#";
                }
                else{
                    answer[i]+=" ";
                }
            }
        }
        return answer;
    }

}
