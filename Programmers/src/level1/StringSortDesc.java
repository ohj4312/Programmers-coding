package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSortDesc {
	 private static String solution1(String s) {
	        String answer = "";
	        List<Character> small=new ArrayList(); //소문자 list
	        List<Character> big=new ArrayList(); //대문자 list

	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)>'Z')
	                small.add(s.charAt(i));
	            else
	                big.add(s.charAt(i));
	        }

	       //API를 이용한 정렬 reverse 
	       //-> 역순 정렬 ( But. sort를 먼저하지 않으면 정상출력되지 않음)
	        Collections.sort(big);
	        Collections.reverse(big);
	        Collections.sort(small);
	        Collections.reverse(small);

	        StringBuilder str = new StringBuilder();
	        for (Character alpa : small) {
	            str.append(alpa);
	        }
	        for (Character alpa : big) {
	            str.append(alpa);
	        }
	        answer=str.toString();
	        return answer;
	    }
	 
	 private static String solution2(String s) {
         char[] sol = s.toCharArray();
         Arrays.sort(sol);
         return new StringBuilder(new String(sol)).reverse().toString();
    }

	 public static void main(String[] args) {
		System.out.println(solution1("AaBbCcDDEfG"));
		System.out.println(solution2("ABDCEFvr"));
	}
}
