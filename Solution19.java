import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution19 {
    public static void main(String[] args) throws Exception {
        String date = "20220118";
        //1일 후 날짜
        String addDay   = AddDate(date, 0, 0, 98);


        System.out.println(addDay);   //20200802
    }
    private static String AddDate(String strDate, int year, int month, int day) throws Exception {

        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        Date dt = dtFormat.parse(strDate);
        cal.setTime(dt);

        cal.add(Calendar.YEAR,  year);
        cal.add(Calendar.MONTH, month);
        cal.add(Calendar.DATE,  day);

        return dtFormat.format(cal.getTime());
    }
        //        Date date = new Date();
//        int month = 1;
//        int day = 18;
//        int[] monthnum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//        int[] datenumber = {31,28,31,30,31,30,31,31,30,31,30,31};
//
//        for (int i = 0; i < monthnum.length-9; i++) {
//            month += i;
//        }
//        day += 8;
//        System.out.println(month+"월"+" "+day+"일");
}

