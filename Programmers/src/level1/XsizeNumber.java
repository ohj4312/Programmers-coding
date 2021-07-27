package level1;

public class XsizeNumber {
	public static void main(String[] args) {
		
		long[] answer=solution(2,5);
		//long[] answer=solution(4,3);
		//long[] answer=solution(-4,2);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
	}
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long plus=0;
        for(int i=0;i<n;i++){
            plus+=x;
            answer[i]=plus;
        
        }
        return answer;
    }
	
	
	
}
