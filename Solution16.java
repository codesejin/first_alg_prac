//콜라츠 추측
//문제설명
//1937년 Collatz란 사람에 의해 제기된 이 추측은,
// 주어진 수가 1이 될 때까지 다음 작업을 반복하면,
// 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
//1-1. 입력된 수가 짝수라면 2로 나눕니다.
//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
//예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다.
// 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요.
// 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
//제한조건
//입력된 수, num은 1 이상 8,000,000 미만인 정수입니다.

public class Solution16 {
    public static void main(String[] args) {
//        int count = 0;
//        long num = 16;
//
//        while (num != 1){
//            if(count == 500){
//                count = -1;
//                break;
//            }
//            if (num % 2 == 0){
//                num /= 2;
//                count++;
//            }else {
//                num = (num*3)+1;
//                count++;
//            }
//        }
//        System.out.println("count = " + count);




        //  세번재 시도 75%

        long num = 626331;
        int count = 0;
        // for문보다 while을 더 선호할때는 for문 안에 있는 i의 역할이 없을때, 돌리는 역할뿐일때 while로 조건식만 넣는다.
        // 원하는 조건을 만족할때 까지 곗에에속 할때는 while
        // 원하는 만큼만 돌리고 싶을때는 for문
        // 배열이나 어떤 값의 길이,사이즈만큼 돌리고 싶을때 for each
        for(int i =0 ; i<=500; i++){ // i가 499면 count 500은안됨
            if (num == 1) {
                break;
            }else if(count == 500){
                    System.out.println("1111");
                    count = -1;
                    break;
            }else if(num % 2 == 0){
                num = num / 2;
                count ++;
                System.out.println("num = " + num);
            }else if(num % 2 == 1){
                num = (num * 3) + 1;
                count ++;
                System.out.println("num = " + num);
            }
        }
        System.out.println("count = " + count);




////        int num = 6;
//        int answer = 6;
//        int count = 0;
//
//        for (int i = 0; i < 500; i++) {
//            count++;
//            switch (answer % 2 ) {
//                case 0:
//                    answer = answer / 2;
//                    System.out.println(answer);
//                    break;
//                case 1:
//                    answer = (answer * 3) + 1;
//                    System.out.println(answer);
//                    break;
//            }
//        }
//        System.out.println(count);


        // 첫번째 시도 다섯번재 돌렸을때 원하는 값이 안나옴
//        int n = 6;
//        int answer = 0;
//        int test = 0;
//        int count = 0;
//
//        for (int i = 0; i < 500; i++) {
//            count++;
//            if ( test % 2 == 0 ) { //나머지 연산
//                answer = n / 2;
//                test ++;
//                if ( answer % 2 == 0) {
//                    answer = n / 2;
//                }
//            } else if ( test % 2 != 0 ) {
//                answer = (n * 3) + 1;
//                test ++;
//            }
//        }
//
//        System.out.println(answer);

    }
}
