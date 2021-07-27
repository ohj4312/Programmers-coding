package level1;

public class XYplus {
	public static void main(String[] args) {
		AnswerArray arr=new AnswerArray();
		int[][] arr1= {{1,2},{2,3}};
		int[][] arr2= {{3,4},{5,6}};
		//int[][] arr1= {{1},{2}};
		//int[][] arr2= {{4},{6}};
		
		int[][] output=arr.solution(arr1, arr2);
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<output[i].length;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}

class AnswerArray{
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        //System.out.println(arr1.length);
        //System.out.println(arr1[0].length);
        
        //arr1 이랑 arr2 자리수 같은거 더해
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        //더한거 배열로 반환해
        return answer;
    }
}
