package level1;

import java.util.Arrays;

public class StringSortMyMind { 
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int[][] temp =new int[strings.length][2];
        Arrays.sort(strings);

        for(int i=0;i<strings.length;i++){
            temp[i][0]=strings[i].charAt(n); // 정렬을 위한 n번째 문자 저장
            temp[i][1]=i; // 인덱스 저장
        } 
    
        Arrays.sort(temp,(o1,o2) ->{
            return Integer.compare(o1[0],o2[0]);
        });
     
        for(int i=0;i<answer.length;i++){
            answer[i]=strings[temp[i][1]];
        }
        
        //System.out.println(Arrays.toString(answer));
        return answer;
    }
}
