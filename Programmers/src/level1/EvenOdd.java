package level1;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	 public static String solution(int num) {
	        String answer = "";
	        if(num%2==0){
	            answer="Even";
	        }else{
	            answer="Odd";
	        }
	        return answer;
	    }
}
