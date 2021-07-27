package level1;

public class Hashad {
	public static void main(String[] args) {
		int[] arr= {10,12,11,13};
		for(int i=0;i<arr.length;i++) {
			System.out.println(solution(arr[i]));
		}
	}
    public static boolean solution(int x) {
        boolean answer = true;
        String xsum=x+"";
        int num=0;
        for(int i=0;i<xsum.length();i++){
           num+=xsum.charAt(i)-'0'; // char 형을 정수로 변환 (parseInt 오류)
        }
        if(x%num==0){
            answer= true;
        }else{
            answer=false;
        }
        return answer;
    }
}
