package level1;

public class ControlString {
	 public static boolean solution(String s) {
	        boolean answer = true;
	        if(s.length()==4||s.length()==6){
	            for(int i=0;i<s.length();i++){
	                if(48>(int)s.charAt(i)||(int)s.charAt(i)>57){
	                    return false;
	                }
	            }
	        }else{
	            return false;
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		boolean a=solution("a234");
		boolean b=solution("1234");
		System.out.println(a);
		System.out.println(b);
	}
}
