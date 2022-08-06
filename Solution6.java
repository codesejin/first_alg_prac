// 이상한 문자 만들기

//문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
// 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
// 각 단어의 짝수번째 알파벳은 대문자로,
// 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

import java.util.Arrays;

public class Solution6 {
    public static void main(String[] args) {
        String s = "try hello world";
        String answer = "";

        String[] split_test = s.split("");
        System.out.println(Arrays.toString(split_test));
        for ( int i = 0; i < split_test.length; i++){
            if (split_test[i].equals(" ")) {

            } else if ( i % 2 == 0) {
               answer += split_test[i].toUpperCase();
           } else {
               answer += split_test[i].toLowerCase();
           }
        }
        System.out.println(answer);
    }
//        첫번째 시도
//        String[] split_test = s.split(" ");
//        System.out.println(Arrays.toString(split_test));
//        System.out.println(split_test[0]);
//
//        for (int i = 0; i <split_test.length; i++){
//            if ( i % 2 == 0){
//                split_test[i] = split_test[i].toUpperCase();
//                System.out.println("split_test[i] = " + split_test[i]);
//            }else {
//                split_test[i] = split_test[i].toLowerCase();
//            }   System.out.println("split_test[i] = " + split_test[i]);

//        // 두번째 시도 : 정확도 18% ==>공백 기준으로 인덱스 처리 안했음
//        String s = "try hello world";
//        String answer = "";
//
//        String[] split_test = s.split("");
//        System.out.println(Arrays.toString(split_test));
//        for ( int i = 0; i < split_test.length; i++){
//            if (i % 2 == 0) {
//                answer += split_test[i].toUpperCase();
//            } else {
//                answer += split_test[i].toLowerCase();
//            }
//        }
//        System.out.println(answer);

}

