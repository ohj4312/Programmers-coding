package level1;

public class Caesar {
    //공백 : ASKII : 32
    private static String solution(String s, int n) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        char temp=' ';
        for(int i=0;i<s.length();i++){
            temp=' ';
            if(s.charAt(i)>96){ //소문자일때
                 if((int)s.charAt(i)+n>122){
                     temp=(char)((int)s.charAt(i)-26+n); //-26 (-122+96)
                  }else 
                     temp=(char)(s.charAt(i)+n);
            }else if(s.charAt(i)>64){ //대문자일때 
                 if((int)s.charAt(i)+n>90){
                     temp=(char)(s.charAt(i)-26+n); //(-90+64)
                 }else 
                    temp=(char)(s.charAt(i)+n);
            }
            sb.append(temp+"");
            answer=sb.toString();
        }
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution("AaXx", 25));
		System.out.println(solution("aB", 25));
	}
}
