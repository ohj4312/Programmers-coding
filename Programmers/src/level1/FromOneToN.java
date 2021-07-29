package level1;

public class FromOneToN {
   public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0;i<a.length;i++){
            answer=answer+a[i]*b[i];
        }
        return answer;
    }
   public static void main(String[] args) {
	int[] a1= {1,2,3,4};
	int[] a2= {-3,-1,0,2};
	int[] a3= {-1,0,1};
	int[] a4= {1,0,-1};
	
	System.out.println(solution(a1,a2));
	System.out.println(solution(a3,a4));
   }
}
