//서울에서 김서방 찾기

//문제설명
//String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
// "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
// seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

//제한 사항
//seoul은 길이 1 이상, 1000 이하인 배열입니다.
//seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
//"Kim"은 반드시 seoul 안에 포함되어 있습니다.

import java.util.Arrays;

public class Solution5 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String answer1 = "김서방은 ";
        String answer2 = "에 있다";
        System.out.println(answer1+answer2);

        // 배열에서 해당하는 문자열의 인덱스 값 구하는 메소드?
        System.out.println(Arrays.asList(seoul).indexOf("Kim"));
        // 문제에서 Kim은 한번만 나와있다고 써있어서 괜찮아요~
        System.out.println(answer1+Arrays.asList(seoul).indexOf("Kim")+answer2);







    }
}


