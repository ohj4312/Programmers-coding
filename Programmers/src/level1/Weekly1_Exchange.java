package level1;

public class Weekly1_Exchange {
    public long solution(int price, int money, int count) {
        long answer = money;
        int pay=price;
        for(int i=1;i<=count;i++){
            price=pay*i;
            answer-=price;
        }
        return answer>=0?0:answer*(-1);
    }

}
