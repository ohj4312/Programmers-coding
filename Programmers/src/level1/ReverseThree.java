package level1;

import java.util.Stack;
public class ReverseThree {
    private int solution(int n) {
        int answer = 0;
        Stack<Integer> stack=new Stack();
        // 문제분석 1        
        while(n>0){
            //문제 분석 2
            stack.push(n%3);
            n=n/3;
        }
        //문제 분석 3
        int at=0;
        while(!stack.empty()){
            answer+=change(stack.pop(),at);
            at++;
        }
        return answer;
    }
    
    public int change(int num,int a){
        int res=1;
        for(int i=0;i<a;i++){
            res*=3;
        }
        return num*res;
    }
}