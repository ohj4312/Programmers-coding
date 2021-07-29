package level1;

public class IntAndIntSum {
	public static long solution(int a, int b) {
        long answer = 0;
        int i;
        if(a==b){
            return a;
        }else{
            if(a<b){
                for(i=a;i<=b;i++){
                    answer+=i;
                }
            }else{
                for(i=b;i<=a;i++){
                    answer+=i;
                }
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(3,5));
		System.out.println(solution(3,3));
		System.out.println(solution(5,3));
	}
}
