import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {/*
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = sdf1.parse("2019-12-14T02:00:00Z");//拿到Date对象
            String str = sdf2.format(date);//输出格式：2017-01-22 09:28:33
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        String date = "2016-08-15T16:00:00.000Z";
        date = date.replace("Z", " UTC");
        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        Date d = null;
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
    }

}
