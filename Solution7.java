// 정수 내림차순으로 배치하기
//문제설명
//함수 solution은 정수 n을 매개변수로 입력받습니다.
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
// 예를들어 n이 118372면 873211을 리턴하면 됩니다.
//제한조건
//n은 1이상 8000000000 이하인 자연수입니다.

import java.util.*;
import java.util.Collections;

public class Solution7 {
    public static void main(String[] args) {
        long n =118372;
        long answers = 0;
        // 형변환 하는 방법 (valueOf())
        String nt = String.valueOf(n);
        System.out.println(nt);
        // 출력값에 ""문자열 형태로 안나와서 타입 확인하기 위한 함수 (getClass().getName())
        System.out.println(nt.getClass().getName());
        // split함수는 문자열을특정구분자로 나눠서 배열로 만들어준다
        String[] ntl = nt.split("");
        System.out.println(Arrays.toString(ntl));
        //오름차순
//        Arrays.sort(ntl);
//        System.out.println(Arrays.toString(ntl));
        //내림차순
        Arrays.sort(ntl, Collections.reverseOrder());
        System.out.println(Arrays.toString(ntl));
        //join함수는 배열을 문자열로 합쳐준다.
        String str = String.join("",ntl);
        answers = Long.parseLong(str);
        System.out.println(answers);
//        String gg = "12";
//        System.out.println(gg.getClass().getName());
//        Long ggg = Long.parseLong(gg);
//        System.out.println(ggg.getClass().getName());

        // 배열 출력하는 방법
//        int [] example = {1, 2, 3, 4, 5};
//        System.out.println(example);
//        System.out.println(example[0]);
//        System.out.println(example[1]);
//        System.out.println(example[2]);
        //하나씩 보는거말고, 배열안에 있는거전부다 다 볼 수 있게 출력하는 방법(Arrays.toString())
//        System.out.println(Arrays.toString(example));

        //String[]을 String으로 만드는 법.. 걍 join써라..
        // for문 돌려서 내보내는건 모르갰음..
    }
}

