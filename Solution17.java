//부족한 금액 계산하기
//문제 설명
//새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
// 이 놀이기구의 원래 이용료는 price원 인데,
// 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
// 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
//놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
//단, 금액이 부족하지 않으면 0을 return 하세요.
//제한조건
//놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
//처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
//놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수

import java.util.Arrays;

public class Solution17 {
    public static void main(String[] args) {
        int price = 3; // 놀이기구 이용료
        int count = 4;  // 놀이기구 이용 횟수
        int money = 20; // 처음 갖고 있떤 금액
        long answer;
        long totalprice = 0;
        // count값 만큼 돌아야하니까 <=로 조건식 세팅해야함
        for (int i = 0; i <= count; i++) {
            // 횟수만큼증가하는 (배수) 걸 더해주고 싶으면 i를 곱해준다
            totalprice += price * i ;
            System.out.println("totalprice = " + totalprice);
            //if문 대신 boolean으로 코드를 더 간결하게 할 수 있다
        } answer = (totalprice > money) ? totalprice - money : 0;
        System.out.println("answer = " + answer);
    }
}
