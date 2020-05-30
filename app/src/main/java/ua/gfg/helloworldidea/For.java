package ua.gfg.helloworldidea;

public class For {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++){
            if (i % 2 == 1 && i % 5 == 0) {
                    System.out.println(i);
            }
        }
    }
    public static void main1(String[] args) {
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i : dayOfMonth) {
            System.out.println(i);
        }
    }
}
