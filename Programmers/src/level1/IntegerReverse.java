package level1;

import java.util.Arrays;
import java.util.Collections;

public class IntegerReverse {
    private static long solution(long n) {
        String test=n+"";
        //Collections API 사용을 위해 char 배열말고 Cahracter 배열생성
        Character[] number=new Character[test.length()];
        
        for(int i=0;i<test.length();i++){
            number[i]=test.charAt(i);
        }
        
        Arrays.sort(number,Collections.reverseOrder());

        long answer=0;
        for(int i=0;i<number.length;i++){
            answer+=(number[i]-'0')*Math.pow(10,number.length-i);
        }
        
        return answer/10;
    }
    
    public static void main(String[] args) {
		int a=118372;
		System.out.println(solution(a));
	}
}
