package ua.gfg.helloworldidea;

public class Seconds {
    public static void main(String[] args) {
        int seconds = 1000000;
        int days = seconds / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = ((seconds % 86400) % 3600) / 60;
        int leftSeconds = seconds - days * 86400 - hours * 3600
                - minutes * 60;


        System.out.println(seconds + " seconds it's - "
                + days + " days, "
                + hours + " hours, "
                + minutes + " minutes "
                + "and "
                + leftSeconds + " seconds."
        );

    }
}
