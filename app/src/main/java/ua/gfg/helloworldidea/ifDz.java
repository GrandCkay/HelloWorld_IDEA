package ua.gfg.helloworldidea;

public class ifDz {
    public static void main(String[] args) {
        String monthString = "April";
        String januaryMonth = "January";
        String februaryMonth = "February";
        String marchMonth = "March";
        String aprilMonth = "April";
        String mayMonth = "May";
        String juneMonth = "June";
        String julyMonth = "July";
        String augustMonth = "August";
        String septemberMonth = "September";
        String octoberMonth = "October";
        String novemberMonth = "November";
        String decemberMonth = "December";

        if (monthString.equals(januaryMonth) || monthString.equals(februaryMonth)
                || monthString.equals(decemberMonth)) {
            System.out.println("Winter");
        } else if (monthString.equals(marchMonth) || monthString.equals(aprilMonth)
                || monthString.equals(mayMonth)) {
            System.out.println("Spring");
        } else if (monthString.equals(juneMonth) || monthString.equals(julyMonth)
                || monthString.equals(augustMonth)) {
            System.out.println("Summer");
        } else if (monthString.equals(septemberMonth) || monthString.equals(octoberMonth)
                || monthString.equals(novemberMonth)) {
            System.out.println("Autumn");
        } else {
            System.out.println("Month is false");
        }
    }
}
