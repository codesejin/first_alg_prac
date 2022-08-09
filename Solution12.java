//없는 숫자 더하기
//문제설명
//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
//제한조건
//1 ≤ numbers의 길이 ≤ 9
//0 ≤ numbers의 모든 원소 ≤ 9
//numbers의 모든 원소는 서로 다릅니다.

public class Solution12 {
    public static void main(String[] args) {
        // 0붜 0까지 숫자 일부가 들어있는 정수 배열
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int answer = 45;
//      총합 45에서 배열값만큼 더해서 빼주려고했는데
//      그냥 처음부터 45로 잡고 거기서 빼주면 더 간단하다
//        int answer = 0;
//        int gross = 45;

        for ( int i : numbers ) {
            answer -= i;
//          answer += i;
        }
            System.out.println(answer);
        }
}

