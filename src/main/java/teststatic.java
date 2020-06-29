import sun.util.calendar.BaseCalendar;

import java.sql.Date;

public class teststatic {
    private java.util.Date brithdayDate;
    private static Date startDate,endDate;
    static {
        startDate = Date.valueOf("1946");
        endDate = Date.valueOf("1964");
    }
    boolean IsBornBoomer(){
        return brithdayDate.compareTo(startDate)>=0 && brithdayDate.compareTo(endDate)<=0;
    }
}
