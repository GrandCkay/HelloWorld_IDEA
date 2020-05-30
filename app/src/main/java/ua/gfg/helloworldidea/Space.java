package ua.gfg.helloworldidea;

public class Space {
    public static void main(String[] args) {
        String[] month = {
                "d",
                "dd",
                "dds",
                "dsd"
        };
        String result = "";
        for (int i = 0; i < month.length; i++) {
            result += month[i];
            if (i == month.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
