import java.text.SimpleDateFormat; // 날짜함수 관련 클래스(사용안했음)
import java.util.Calendar; // 날짜함수 관련 클래스(사용안했음)
import java.util.Date; // 날짜함수 관련 클래스(사용안했음)

//예지는 오늘 항해99를 시작했다. 성격이 급한 예지는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
//항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.
//제한조건
//1 ≤ month ≤ 12
//1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)

public class Solution19 {
    public static void main(String[] args) throws Exception {
        int month = 11;  // 11월 ,6월 test
        int day = 6; // 27일, 22일 test
        String answer = "";

        int final_month = 0;
        int final_day = 0;
        int[] datenumber = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int current_month = month - 1;  // 현재 달의 일수를 datenumber의 인덱스로 확인
        System.out.println("current_month = " + current_month); // 0이 되서 31을 가리킴
        // 이번 달의 남은 날들 더하기 ex. 31일에서 현재 18일을 빼면 13. 13일후면 다음달,이라서 +1
        int ing_days = datenumber[current_month] - day;
        current_month += 1;
        current_month %= 12; // 12월이 넘어가면 다시 1월로 돌아가기, 위에서
        System.out.println("current_month = " + current_month);

        // 한 달씩 더해가며 98일까지 더하기
        while (ing_days < 99) {
            // 이번 달 말일 내에  98일경과가 될 때 : 반복문 break
            if (ing_days + datenumber[current_month] >= 98) {
                final_month = current_month + 1; // 종료 달 =  이번 달 = 이번달 인덱스 +1
                final_day = 98 - ing_days; // 종료 날짜 = 98 - 누적 일수
                answer = final_month + "월" + final_day + "일"; // 종료 달과 종료 날짜출력
                break;
            }
            // 이번 달 내에 안 끝날 경우 : 계속 반복
            ing_days += datenumber[current_month]; // 누적 날짜에 이번 달 날짜 더하기
            current_month += 1; // 다음달로 넘어가기
            current_month %= 12; // 만약 12월이 넘어가면 다시 1월로 돌아가기
        }
        System.out.println(answer);
    }
}

//        String date = "20220118";
//        //1일 후 날짜
//        String addDay   = AddDate(date, 0, 0, 98);
//
//
//        System.out.println(addDay);   //20200802
//    }
//    private static String AddDate(String strDate, int year, int month, int day) throws Exception {
//
//        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
//        Calendar cal = Calendar.getInstance();
//        Date dt = dtFormat.parse(strDate);
//        cal.setTime(dt);
//
//        cal.add(Calendar.YEAR,  year);
//        cal.add(Calendar.MONTH, month);
//        cal.add(Calendar.DATE,  day);

//        return dtFormat.format(cal.getTime());
//    }

