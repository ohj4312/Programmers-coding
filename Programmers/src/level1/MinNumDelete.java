package level1;

import java.util.Arrays;

public class MinNumDelete {
    private static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];        
        int min=arr[0];
        int index=0;
        
        //arr의 길이가 1인경우 -1을 리턴
        if(arr.length==1){
            answer=new int[1];
            answer[0]=-1;
            return answer;
        }
        
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        
        
        for(int i=0;i<arr.length-1;i++){
             if(i<index) answer[i]=arr[i];
             else if(i>=index) answer[i]=arr[i+1];
    
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		int[] arr1= {4,3,2,1};
		int[] arr2= {10};
		
		
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));

	}
}
