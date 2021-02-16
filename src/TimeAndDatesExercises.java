import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeAndDatesExercises {
    public static void main(String[] args) {
        //Ex. 1. Write a Java program to create a Date object using the Calendar class.
        Ex1 date1= new Ex1(2020,02,02);

        //Ex 2. Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar.
        Ex2 date2= new Ex2();
        Ex2 date2_2= new Ex2(2000,2,2,2,2,2);




    }
}

class Ex1{
    public Ex1(int year, int month, int day){
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(Calendar.YEAR,year);
        myCalendar.set(Calendar.MONTH, month-1);    //month index starts at 0
        myCalendar.set(Calendar.DATE, day);
        System.out.println(myCalendar.getTime());
    }
}

class Ex2{
    //With Date class, at the time the Date object is created
    public Ex2(){
        Date date = new Date();
        String dateString="dd/MM/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(dateString);
        String dateFormatted = formatter.format(date);
        System.out.println(dateFormatted);
    }

    //With Calendar class, with given parameters
    public Ex2(int year, int month, int day, int hour, int minute, int second){
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(Calendar.YEAR,year);
        myCalendar.set(Calendar.MONTH, month-1);
        myCalendar.set(Calendar.DATE,day);
        myCalendar.set(Calendar.HOUR,hour);
        myCalendar.set(Calendar.MINUTE,minute);
        myCalendar.set(Calendar.SECOND, second);
        System.out.println(myCalendar.getTime());
    }
}