package level1;

public class HateSameNumber {
	private static int[] solution(int []arr) {
        int[] answer = {};
        int cnt=0;
        int temp=10;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==temp){
                arr[i]=10;
                cnt++;
            }else if(arr[i]==arr[i+1]){
                arr[i+1]=10;
                temp=arr[i];
                cnt++;
            }else if(arr[i]!=10){
                temp=10;
            }
        }
        
        if(arr[arr.length-1]==temp){
            cnt++;
            arr[arr.length-1]=10;
        }
        
        
        answer=new int[arr.length-cnt];
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]!=10){
                answer[i]=arr[j];
                i++;
            }
            j++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,1,3,3,0,1,1}));
		System.out.println(solution(new int[] {4,4,4,3,3}));
	}
}
