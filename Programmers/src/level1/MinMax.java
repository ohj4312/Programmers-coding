package level1;

public class MinMax {
	public static void main(String[] args) {
		int[] answer1=solution(3,12);
		//int[] answer1=solution(2,5);
		
		for(int i=0;i<answer1.length;i++) {
			System.out.print(answer1[i]+" ");
		}
	}
	 public static int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        for(int i=1;i<(n>m ? n:m);i++){
	            if(n%i==0&&m%i==0){
	                answer[0]=i;
	            }
	        }
	        answer[1]=n*m/answer[0];
	        return answer;
	    }
}
