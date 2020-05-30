package ua.gfg.helloworldidea;

public class Bool {
    public static void main(String[] args) {
        int temp = 10;
        int time = 23;
        boolean late = time >= 23;
        boolean hot = temp > 25;
        if (hot && !late ) {
            System.out.println(temp + ", Air conditioning ON");
        } else if (!hot || late) {
            System.out.println(temp + ", Air conditioning OFF");
        } else {
            System.out.println(temp + ", temp norm");
        }
    }
}
