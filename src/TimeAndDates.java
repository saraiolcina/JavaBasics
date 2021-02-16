import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeAndDates {

    public static void main(String[] args) throws ParseException {
        //Date class contains the date when the Date object was created
        Date today = new Date();
        System.out.println(today);

        /*If we want to create date objects with specific dates, is better to use Calendar class
        together with Date class*/
        Calendar myCalendar= Calendar.getInstance();
        myCalendar.set(2021,01,01); //set the date
        Date firstDay = myCalendar.getTime();   //creates the date
        System.out.println(firstDay);

        /*Using SimpleDateFormat for date formatter, so the Date object can be legible in a String*/

        Current today2 = new Current();
        Create birthday = new Create(1993,03,03);
        Convert change = new Convert("30/06/09");
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

