package level1;

public class StringChangeInt {
    private static int solution(String s) {
        int answer = 0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'||s.charAt(i)=='+'){
                if(s.charAt(0)=='-') flag=true;
                continue;
            }
            answer+=(s.charAt(i)-'0')*Math.pow(10,s.length()-i-1);
            
        }
        if(flag) answer=(-1)*answer;
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("-1234"));
	}
}
