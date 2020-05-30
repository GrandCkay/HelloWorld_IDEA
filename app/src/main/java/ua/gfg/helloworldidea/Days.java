package ua.gfg.helloworldidea;

import java.net.SocketOption;

public class Days {
    public static void main(String[] args) {
        int days = 1360;
        int years = days / 365;
        int month = (days % 365) / 31;
        int leftDays = days - years * 365 - month * 31;

        System.out.println("Days total " + days);
        System.out.println("Years " + years);
        System.out.println("Month " + month);
        System.out.println("Days " + leftDays);

        System.out.println(days + " days it's - " + years + " years, " + month + " month "
        + "and " + leftDays + " days.");
    }
}
