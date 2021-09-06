package level1;

public class CenterString {
    private static String solution(String s) {
        String answer = "";
        if(s.length()%2!=0){
            answer=String.valueOf(s.charAt(s.length()/2));
        }else{
            answer=String.valueOf(s.charAt(s.length()/2-1))+String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}
}
