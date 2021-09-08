package level1;

public class MakeStringArray {
    private static String solution(String s) {
        String answer = "";
        char[] temp=s.toCharArray();
        int num=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                num=0;
            }else{
                if(num%2==0){
                    temp[i]=Character.toUpperCase(s.charAt(i));
                    //temp[i] = (char)((int)s.charAt(i) & 0x5f);
                }else{
                    temp[i]=Character.toLowerCase(s.charAt(i));
                    //temp[i]= (char)((int)s.charAt(i) | 0x20);
                }
                num++;
            }
        }
        
        answer=new String(temp);
        
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}

}
