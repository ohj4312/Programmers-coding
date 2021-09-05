package level1;

public class PlusIntegerAt {
    private static int solution(int n) {
        int answer = 0;

        String input=n+"";
        for(int i=0;i<input.length();i++){
            answer+=input.charAt(i)-'0';
        }

        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}
    
}
