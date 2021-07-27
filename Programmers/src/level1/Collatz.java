package level1;

public class Collatz {
	public static void main(String[] args) {
		long[] n= {6,16,626331};
		for(int i=0;i<n.length;i++) {
			System.out.println(solution(n[i]));
		}
	}
    public static int solution(long num) {
        int answer = 0;

        while(!(num==1)){
            if(answer>500){
                return -1;
            }
            if(num%2==0){
                num=num/2;
            }else{
                num=num*3+1;
            }
            answer++;
            
        }

        return answer;
    }
}
