//직사각형 별찍기
//문제설명
//이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
//제한조건
//n과 m은 각각 1000 이하인 자연수입니다.
public class Solution8 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
