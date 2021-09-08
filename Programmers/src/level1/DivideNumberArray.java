package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivideNumberArray {
	private static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list=new ArrayList();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0) list.add(arr[i]);
        }
        
        answer=new int[list.size()];
        if(answer.length==0){
            return new int[] {-1};
        }
        
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        
        return answer;
	}
        		
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {5,9,7,10},5)));
		System.out.println(Arrays.toString(solution(new int[] {2,36,1,3},1)));
		System.out.println(Arrays.toString(solution(new int[] {4,3,6},10)));
	}
}
