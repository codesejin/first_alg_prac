//평균 구하기
//문제설명
//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//제한사항
//arr은 길이 1 이상, 100 이하인 배열입니다.
//arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

public class Solution13 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4};
        int sum = 0;
        // 배열 안에 들어있는걸 다 꺼내서 더해주고
        for (int i : arr ){
            sum += i;
        }// 소수점까지 나오게 double로 형변환
        System.out.println((double)sum/arr.length);
    }
}
