package level1;

import java.util.Arrays;

public class Weekly_6 {
	private static int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        // 선수의 번호,  선수의 승률 (이긴 횟수),자기보다 무거운 복서 이긴 횟수, 몸무게
        int[][] boxer=new int[weights.length][6];
        
        for(int i=0;i<head2head.length;i++){
            //몸무게가 무거운 복서의 번호가 앞쪽
            //작은번호가 앞쪽
            boxer[i][3]=i+1;
            boxer[i][2]=weights[i];
            
            //승률이 높은 복서의 번호가 앞쪽
            for(int j=0;j<head2head[i].length();j++){
                if(head2head[i].charAt(j)=='W'){
                    boxer[i][4]++;
                    boxer[i][5]++;
                    //승률이 같으면 몸무게무거운 복서를 이긴횟수가 많은 복서의 번호가 앞쪽
                    if(weights[i]<weights[j])
                        boxer[i][1]++;
                }else if(head2head[i].charAt(j)=='L'){
                    boxer[i][5]++;
                }
            }
            if(boxer[i][5]==0) continue;
            boxer[i][0]=(int)(1000000*((double)boxer[i][4]/boxer[i][5]));
        }
        
        
        // for(int i=0;i<boxer.length;i++){
        //     System.out.println(Arrays.toString(boxer[i]));
        // }
        
        
        Arrays.sort(boxer, (o1,o2)->{
            if(o1[0]==o2[0]){
                if(o1[1]==o2[1]){
                    if(o1[2]==o2[2]){
                        return Integer.compare(o1[3],o2[3]);
                    }else{
                        return Integer.compare(o2[2],o1[2]);
                    }
                }else{
                    return Integer.compare(o2[1],o1[1]);
                }
            }else{
                return Integer.compare(o2[0],o1[0]);
            }
        });
        
        // for(int i=0;i<boxer.length;i++){
        //     System.out.println("바뀜 : "+Arrays.toString(boxer[i]));
        // }
        
        for(int i=0;i<answer.length;i++){
            answer[i]=boxer[i][3];
        }
        //이긴 횟수가 많아도 총 경기 횟수가 다르면 승률은 낮을 수 있습니다!!
        return answer;
    }
}
