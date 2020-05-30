package ua.gfg.helloworldidea;

public class ArrayPro {
    public static void main(String[] args) {
        int[] first = new int[11];
        int[] second = new int[first.length];

        for (int i = 2; i < first.length; i++) {
            first[i] = i * 5;
        }

        for (int i = 0, j = first.length - 1; i < first.length; i++, j--){
            second[j] = first[i];
        }

        for (int k : second) {
            if (k % 5 == 0 && k !=0) {
                System.out.println(k);
            }
        }
    }
}
