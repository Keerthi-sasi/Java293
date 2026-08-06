
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.Duration;

public class Day4 {

    public static void main(String args[]) {

        //Display the current date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //Display the current time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //Display the current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        //Display only the current year
        System.out.println(date.getYear());

        //Display the current month name
        System.out.println(date.getMonth());

        //Display the current day of the week
        System.out.println(date.getDayOfWeek());

        //Display the day number in the year
        System.out.println(date.getDayOfYear());

        //Create your date of birth using LocalDate.of()
        LocalDate dob = LocalDate.of(2005, 1, 12);
        System.out.println("Date of Birth " + dob);

        //Add 30 days to today's date
        System.out.println(date.plusDays(30));

        //Subtract 15 days from today's date
        System.out.println(date.minusDays(15));

        //Add 6 months to today's date
        System.out.println(date.plusMonths(6));

        //Add 2 years to today's date
        System.out.println(date.plusYears(2));

        //Display only the current hour, minute, and second
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        //Format today's date as dd/MM/yyyy
        DateTimeFormatter display = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dateTime.format(display));

        //Format the current date and time as dd-MM-yyyy HH:mm:ss
        DateTimeFormatter ans = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateTime.format(ans));

        //Compare two dates using isBefore()
        LocalDate date1 = LocalDate.of(2024, 5, 10);
        LocalDate date2 = LocalDate.of(2025, 8, 15);
        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("Date1 is not before Date2");
        }

        //Compare two dates using isAfter()
        LocalDate date3 = LocalDate.of(2026, 7, 1);
        LocalDate date4 = LocalDate.of(2025, 7, 1);
        if (date3.isAfter(date4)) {
            System.out.println("Date3 is after Date4");
        } else {
            System.out.println("Date3 is not after Date4");
        }

        //Check whether two dates are equal using isEqual()
        if (date3.isEqual(date4)) {
            System.out.println("Date3 is equal Date4");
        } else {
            System.out.println("Date3 is not equal Date4");
        }

        //Calculate and display an employee's joining date after adding one year and six months
        LocalDate newDate = date.plusYears(1).plusMonths(6);
        System.out.println("Original Joining Date: " + date);
        System.out.println("Date after 1 year and 6 months: " + newDate);

        //Create a Student Age Calculator
        LocalDate birth = LocalDate.of(2005, 01, 12);
        System.out.println("Birthday Date:" + birth);
        LocalDate current = LocalDate.now();
        Period displayAge = Period.between(birth, current);
        System.out.println("Current Age:" + displayAge.getYears());
        System.out.println(current.getDayOfWeek());
        DateTimeFormatter DOB = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = birth.format(DOB);
        System.out.println("Formatted Birth Date:" + formattedDate);

        //Duration between two time
        LocalTime T1 = LocalTime.of(11, 20, 10);
        LocalTime T2 = LocalTime.of(12, 40, 40);
        Duration answer = Duration.between(T1, T2);
        System.out.println(answer.toSeconds());
        System.out.println(answer.toMinutes());

    }
}
