import java.util.ArrayList;

public class PracArrayList {
    public static void main(String[] args) {

        //배열을 만드는 방법 2가지

        // 1. 처음부터 초기화해줌
        int[] myArray1 = {1, 2, 3, 4, 5};

        // 2. 배열 안에 몇개를 받을지 특정 개수를 명시해 줌
        int[] myArray2 = new int[5];

        //리스트 만드는 방법

        // 초기화 후 메소드 활용 (add, get, size, remove, clear, sort, contains)
        ArrayList li = new ArrayList<>();
        li.add(1);
        li.add("hello");
        li.add("");
        li.add("world!");
        System.out.println("li = " + li);

        //배열과 리스트이 차이?
        //메소드를 활용여부..배열의 문제점 보완된게 리스트, 대량 데이터 가능
    }
}
