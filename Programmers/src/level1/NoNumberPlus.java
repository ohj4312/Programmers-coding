package level1;

public class NoNumberPlus {
	public int solution(int[] numbers) {
        int answer = 0;
        boolean[] flag=new boolean[10];
        for(int i=0;i<numbers.length;i++){
            flag[numbers[i]]=true;
        }
        
        for(int i=0;i<flag.length;i++){
            if(!flag[i]) answer+=i;
        }
        
        return answer;
    }

}
