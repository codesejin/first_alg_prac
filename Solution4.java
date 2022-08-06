//내적

//문제설명
//길이가 같은 두 1차원 정수 배열 a,b가 매개변수로 주어집니다
//a와 b의 내적을 return하도록 Solution3함수를 완성해주세요.
//이때, a와 b의 내적은 a[0]*b[0]+a[1]+b[1]+...+a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)

//제한사항
//a, b의 길이는 1 이상 1,000 이하입니다.
//a, b의 모든 수는 -1,000 이상 1,000 이하입니다.

public class Solution4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        int answer = 0;
        //a와 b의 배열길이가 같고, 둘중 하나의 길이만큼만 for문 돌리고
        for (int i = 0; i <a.length; i++) {
            // 입출력 예시대로 나오게 각 배열의 인덱스만큼 곱하기
            answer += a[i]*b[i];
        }
        System.out.println(answer);
    }
    // 그냥 포문인지 다중포문인지 판단하는 논리력 부족,
    // 구구단이랑 차이점 ==> 2개의 배열 중 각각 인덱스를 다 돌리는게 아님
    // 예를 들어 구구단은 1*1 =1 / 1*2=2 / 1*3=3 으로 돌리는데,
    // 해당 문제는 1*1 / 2*2/ 3*3 이런식임

    //        for (int i = 0; i < a.length; i++) {
    //            System.out.print("i = " + i);
    //            for (int j = 0; j < b.length; j++) {
    //                System.out.print("j = " + j);
    //
    //            }
    //        }
    //        System.out.println("answer = " + answer); //출력값 12나옴
}

