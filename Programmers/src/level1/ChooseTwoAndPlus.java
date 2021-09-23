package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChooseTwoAndPlus {
	 public int[] solution(int[] numbers) {
	        int[] answer = {};
	        Set<Integer> set=new HashSet();
	        for(int i=0;i<numbers.length-1;i++){
	            for(int j=i+1;j<numbers.length;j++){
	               set.add(numbers[i]+numbers[j]);
	            }
	        }
	        
	        // 정렬을 위한 ArrayList 변환
	        List<Integer> list=new ArrayList(set);
	        Collections.sort(list);

	        answer=new int[list.size()];
	        for(int i=0;i<list.size();i++){
	            answer[i]=list.get(i);
	        }

	        return answer;
	    }
}
