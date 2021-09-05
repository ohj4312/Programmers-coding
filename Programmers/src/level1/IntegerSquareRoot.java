package level1;

public class IntegerSquareRoot {
    private static long solution(long n) {
        int i=1;
        long answer = -1;
        while(i*i<=n){
            if(n==i*i) {
                answer=(i+1)*(i+1);
                break;
            }
            i++;
        }
        
        
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}
}
