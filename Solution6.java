// 이상한 문자 만들기

//문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
// 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
// 각 단어의 짝수번째 알파벳은 대문자로,
// 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

import java.util.Arrays;

public class Solution6 {
    public static void main(String[] args) {
        // 임의로 문자열 설정
        String s = "try hello world";
        String answer = "";
        // 문자열 한 단어씩 쪼개기 => split("") => 괄호안 문자열을기준으로 쪼개서 배열로 만들어줌
        String[] split_test = s.split("");
        // 공백을 만났을 때 새로 시작하기 위한 인덱스
        int idx = 0;
        System.out.println(Arrays.toString(split_test));

        // s문자열이 계속해서 for문 돌면서
        for (int i = 0; i < split_test.length; i++) {
            // split_test[i]중에 " "와 일치하는게 있다면
            if (split_test[i].equals(" ")) {
                // idx = 0; 이라는 것을 선언해주고,
                idx = 0;
                // split_test[i].equals(" ")가 실행되지 않을경우
                // else if로 넘어와서 대소문자 바꿔주고 idx++해주면
                //if문이 끝나고 계속 for문을 돌다가 공백을 만나면 다시 idx=0이 되는 방식
            } else if (idx % 2 == 0) {
                split_test[i] = split_test[i].toUpperCase();
                idx++;
            } else {
                split_test[i] = split_test[i].toLowerCase();
                idx++;
            }//split_test[i]은 배열이기에 문자열인 answer로 넘겨줌
            answer += split_test[i];
        }
        System.out.println(answer);

//        //첫번째 시도: split을" "로 처리했더니, 공백이 아예 사라지고 덩어리로 3개 인덱스를 가진 배열이 되버림 //
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

//        // 두번째 시도 : 정확도 18% ==>공백 기준으로 인덱스 처리 안했음//
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
}

