package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

//=========================Exercise 1===================================
        // display the date and the time for today
        LocalDateTime today = LocalDateTime.now();

//=========================("dd/MM/yyyy")===============================
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(fmt);
        System.out.println("Today is: " + formattedDate);

//==========================(yyy-MM-dd)==================================
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate1 = today.format(fmt1);
        System.out.println("Today is: " + formattedDate1);

//=======================(E, MMM dd yyyy")================================
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MMM dd yyyy");
        String formattedDate2 = today.format(fmt2);
        System.out.println("Today is: " + formattedDate2);

//=======================(E, MMM dd, yyyy HH: mm)==============================
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy  HH: mm");
        String formattedDate3 = today.format(fmt3);
        System.out.println("Today is: " + formattedDate3);


//=====================(HH: mm on dd MMM )================================
        System.out.println("\n===========Challenge==============");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("HH: mm dd-MMM-yyyy");
        String formattedDate4 = today.format(fmt4);
        System.out.println("Today is: " + formattedDate4);



//===========================Exercise 2=================================


//        System.out.println("Enter your birthdate: ");
//        System.out.println("You were born on ");



    }

}
