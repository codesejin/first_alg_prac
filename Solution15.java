//행렬의 덧셈
//문제설명
//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행,
// 같은 열의 값을 서로 더한 결과가 됩니다.
// 2개의 행렬 arr1과 arr2를 입력받아,
// 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
//제한조건
//행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
import java.util.Arrays;

public class Solution15 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}};
        int[][] arr2 = {{3, 4}};
        System.out.println(arr1[0][0] + arr2[0][0]);

        int[][] arr3 = new int[arr1.length][arr1[0].length];
//        int[][] arr3 = new int[arr1.length][arr1[0].length];
        // 2차원 배열은 2중 반복문을 써야한다
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
             }
        }
        System.out.println("arr3[0][1] = " + arr3[0][1]);
        // 1차원 배열은 toString , 다차워배열은 deepToString
        System.out.println(Arrays.deepToString(arr3));
    }
}
