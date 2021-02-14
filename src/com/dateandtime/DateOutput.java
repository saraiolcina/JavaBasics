package com.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateOutput {

    public static void main(String[] args) {
        //A basic date output

        //Define the format to use. We can change the format all desired ways.
        String formatString="dd/MM/yyyy hh:mm.ss";

        //Create the formatter
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);

        //Get a current date object with Date and Calendar classes
        Date date= Calendar.getInstance().getTime();

        //Format the date
        String formattedDate = simpleDateFormat.format(date);

        System.out.println(formattedDate);

        /*We need to define the String format for the output date and create the formatter based on the
        *String former format (with SimpleDateFormat class).
        *Then, get the current date through Date and Calendar classes (with getInstance and getTime methods).
        *Finally, use the formatter previously created to format the date we got. */
    }
}
