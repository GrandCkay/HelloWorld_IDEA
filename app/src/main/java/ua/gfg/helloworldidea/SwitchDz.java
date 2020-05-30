package ua.gfg.helloworldidea;

public class SwitchDz {
    public static void main(String[] args) {
        String monthString = "September";

        switch (monthString) {
            case "January":
            case "February":
            case "December":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Month is false");
                break;
        }
    }
}