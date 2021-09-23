package level1;

public class DivisorCntSum {
	public int solution(int left, int right) {
        int answer = 0;
        int cnt=0;
        for(int i=left;i<=right;i++){
            //약수 판별
            for(int j=1;j<=i;j++){
                if(i%j==0) cnt++;
            }
            //짝수이면 +, 홀수이면 -
            if(cnt%2==0) answer+=i;
            else answer-=i;
            cnt=0;
        }
        return answer;
    }

}
