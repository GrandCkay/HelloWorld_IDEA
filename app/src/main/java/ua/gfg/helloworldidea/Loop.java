package ua.gfg.helloworldidea;

public class Loop {
    public static void main(String[] args) {
//        int a = 10;
//        a = a + 1;
//        a += 1;
//        a++;
        int b = 1;
//        for (b = 1; b < 1000; b++)
        while (b <= 10) {
            System.out.println(b++);
            if (b == 5) {
                break;
            }
        }
    }
}
