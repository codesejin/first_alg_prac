//음양 더하기

//문제설명
//어떤 정수들이 있습니다.
// 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
// 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
// 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

//제한사항
//absolutes의 길이는 1 이상 1,000 이하입니다.
//absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
//signs의 길이는 absolutes의 길이와 같습니다.
//signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int answer = 0;
        // 정수들의 절댓값이 차례대로 담긴 정수 배열
        // 정수들의 부호를 차례대로 담은 불리언 배열
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};
        //각각의 정수들을 실제 양수/음수값으로 더해야 하므로 for문+if문
        for ( int i = 0; i < absolutes.length; i++) {
            // 제한사항을 보면 true일때 양수 / false일때 음수라 되어있음
            if(signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer-= absolutes[i];
            }
        }
        System.out.println(answer);

    }
}
// boolean[] 초기화법
// boolean은 데이터 값을 true, false로만 받을 수 있다 +/- 못옴