//핸드폰번호 가리기
//문제설명
//프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때
// 고객들의 전화번호의 일부를 가립니다.
//전화번호가 문자열 phone_number로 주어졌을 때,
// 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린
// 문자열을 리턴하는 함수, solution을 완성해주세요.
//제한조건
//phone_number는 길이 4 이상, 20이하인 문자열입니다.

import java.util.Arrays;

public class Solution14 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String answer = "";
//        String[] mya = phone_number.split("");
//        System.out.println(Arrays.toString(mya));
        String substract = phone_number.substring(phone_number.length()-4,phone_number.length());
        // 길이랑 인덱스의 의미가 다르다. 길이는 1부터 / 인덱스는 0부터

        for (int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
        }
        System.out.println(answer+substract);
    }
}
