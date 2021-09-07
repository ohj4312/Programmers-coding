package level1;

public class PrimeNumber {
	private static int solution(int n) {
        int answer = 0;
        boolean flag=true;
        for(int i=2;i<=n;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                } 
            }
            if(flag) answer++;
            flag=true;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(100));
	}
}
