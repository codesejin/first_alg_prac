//나누어 떨어지는 숫자 배열
//문제설명
//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//제한설명
//arr은 자연수를 담은 배열입니다.
//정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//divisor는 자연수입니다.
//array는 길이 1 이상인 배열입니다.
import java.util.ArrayList;
import java.util.Arrays;

public class Solution18 {
    public static void main(String[] args) {
        int [] arr = {5, 7, 9, 10};
        int diviser = 5;
        int[] answer = {};
        ArrayList<Integer> arrlist = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if ( i % diviser == 0 ){
                arrlist.add(i);
                // arraylist 의 add 와 get의 차이
                // 배열에서 리스트로 -> 리스트에서 배열로
            }
        }
        if (arrlist.isEmpty()){
            arrlist.add(-1);
        }
        answer = new int[arrlist.size()];
        for (int i = 0; i < arrlist.size(); i++) {
            answer[i] = arrlist.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
