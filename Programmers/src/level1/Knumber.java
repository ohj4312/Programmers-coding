package level1;
import java.util.*;

class SolutionK{
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i,j,k;
        
        for(int a=0;a<commands.length;a++){
            
            List<Integer> sortar=new ArrayList<>();
            i=commands[a][0]-1;
            j=commands[a][1]-1;
            k=commands[a][2];
                        
            for(int b=0;b<array.length;b++){
                sortar.add(array[i]);
                i++;
                if(i>j) break;
            }
            Collections.sort(sortar);
            answer[a]=sortar.get(k-1);

        }
        
        return answer;
        
    }
}

public class Knumber {
	public static void main(String[] args) {
		SolutionK s=new SolutionK();
		int[] array= {1,5,2,6,3,7,4};
		int[][] commands= {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer=s.solution(array, commands);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
	} 
}
