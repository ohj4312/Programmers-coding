package level1;

public class CountPandY {
    private static boolean solution(String s) {
        boolean answer = true;
        int p=0,y=0;
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='P') p++;
            else if(s.charAt(i)=='Y') y++;
        }
        
        if(p!=y) answer=false;
        return answer;
    }
	
    public static void main(String[] args) {
		System.out.println(solution("pPooooyY"));
	}
}
