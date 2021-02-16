import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeAndDates {

    public static void main(String[] args) throws ParseException {
        Current today = new Current();
        Create birthday = new Create(1993,03,03);
        Convert change = new Convert("30/06/09");
        Create birthday2 = new Create(1994,9,03);
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

//Convert a String into Date
class Convert{
    public Convert(String dateString) throws ParseException {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.FRANCE);
        String dateStr= dateString;
        Date date = dateFormat.parse(dateString);
        System.out.println(date);
    }
}

