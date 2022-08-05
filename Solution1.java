public class Solution1 {
    public static void main(String[] args) {
        String answer = "";
        // 임의로 테스트할 문자열 세팅
        String s = "자바코딩으";
        //코드 간편화를 위해 변수 할당
        int length = s.length();
        // 원하는 대로 나오는지 콘솔 확인용
        System.out.println(length);
        //짝수로 나누기 위한 if문과, 문자열빼내는 substring 메서드 활용
        if (length % 2 == 0) {
            answer = s.substring((length / 2) - 1, (length / 2) + 1);
        } else {
            answer = s.substring(s.length()/2,s.length()/2+1);
        }
        System.out.println(answer);
    }
}
