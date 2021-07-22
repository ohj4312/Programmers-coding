package level1;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            if(!signs[i]){ //음수인 경우
                absolutes[i]=absolutes[i]*-1;
            }
            answer+=absolutes[i];
        }
        return answer;
    }
}
public class PlusMinus {
	public static void main(String[] args) {
		Solution s = new Solution();
		//tast case1: [4,7,12],[true,false,true] / result =9
		//test case2: [1,2,3] [false,false,true] / result=0
		
		int[][] tc_int= {{4,7,12},{1,2,3}};
		boolean[][] tc_bool= {{true,false,true},{false,false,true}};
		
		for(int i=0;i<tc_int.length;i++) {
			int result=s.solution(tc_int[i],tc_bool[i]);
			System.out.println("test : "+result);
		}
		
	}
}
