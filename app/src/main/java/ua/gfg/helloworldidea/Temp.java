package ua.gfg.helloworldidea;

public class Temp {
    public static void main(String[] args) {
        int temp = 21;
        if (temp > 25) {
            System.out.println(temp + ", Air conditioning ON");
        } else if (temp < 22) {
            System.out.println(temp + ", Air conditioning OFF");
        } else {
            System.out.println(temp + ", temp norm");
        }
    }
}
