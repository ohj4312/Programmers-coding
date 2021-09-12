package level1;

public class HidePhonNumber {
    private static String solution(String phone_number) {
        String answer = "";
        //if(4<=s.length()&&s.length()<=20)
        answer="*".repeat(phone_number.length()-4)+phone_number.substring(phone_number.length()-4,phone_number.length());
        
        return answer;
    }
    
}
