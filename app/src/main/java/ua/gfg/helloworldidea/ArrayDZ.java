package ua.gfg.helloworldidea;

public class ArrayDZ {
    public static void main(String[] args) {
        int[] bool = new int[900];
        for (int i = 0; i < bool.length; i++) {
            bool[i] = i + 100;
            System.out.println(bool[i]);
        }

        int[] cool = new int[bool.length];
        for (int i = 0, j = bool.length - 1; i < cool.length; i++, j--) {
            cool[j] = bool[i];
        }
        for (int i : cool) {
            System.out.println(i);
        }
    }
}
