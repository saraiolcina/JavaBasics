import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeAndDates {

    public static void main(String[] args) {
        Current today = new Current();
        Create birthday = new Create(1993,03,03);
    }
}


//Get current date
class Current{
    public Current(){
        String formatString ="yyyy/MM/dd";
        SimpleDateFormat formatter = new SimpleDateFormat(formatString);
        Date today = Calendar.getInstance().getTime();
        String formattedString = formatter.format(today);
        System.out.println(formattedString);
    }
}

//Create a date
class Create{
    public Create(int year, int month, int day){
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        Date d =c.getTime();
        String formatString = "yyy/MM/dd";
        SimpleDateFormat formatter = new SimpleDateFormat(formatString);
        String formattedString=formatter.format(d);
        System.out.println(formattedString);
    }
}
