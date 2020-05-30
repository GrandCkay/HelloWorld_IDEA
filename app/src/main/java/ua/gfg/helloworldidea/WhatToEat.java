package ua.gfg.helloworldidea;

public class WhatToEat {
    public static void main(String[] args) {
        int countOfMoney = 10100;
        if (countOfMoney >= 500) {
            int a = countOfMoney / 500;
            int b = countOfMoney % 500;
            System.out.println(a + " Пиццы");
                if (b > 0) {
                    System.out.println("сдача " + b + " $");
                }
        } else if (countOfMoney >= 300) {
            System.out.println("Шаурма");
        } else if (countOfMoney >= 100) {
            System.out.println("Гамбургер");
        } else {
            System.out.println("Доширак");
        }
    }
}
