//두 정수 사이의합
//문제설명
//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
//제한조건
//a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//a와 b의 대소관계는 정해져있지 않습니다.
public class Solution10 {
    public static void main(String[] args) {
        long answer = 0;
        int a = 3;
        int b = 5;
        //대소관계가 정해져 있지 않다고 했으니, for문 돌리기 전 if문으로
        if (a < b) {
            // 시작은 0이 아니라 작은 숫자붜터 해야함
            for (int i = a; i <= b; i++) {
                // 3~5사이에있는 모든 인덱스를 더해야 하므로 +=
                answer += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }

        }else {
            answer = a;
        }
        System.out.println(answer);
    }
}