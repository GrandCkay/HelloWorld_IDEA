package ua.gfg.helloworldidea;

public class WhatToDo {
    public static void main(String[] args) {
        int time = 11 ;
        boolean night = time >= 23 || time <= 5;
        boolean weatherGood = false;
        if (night) {
            System.out.println("Sleep");
        }
        if (!night && weatherGood) {
            System.out.println("Go to play");
        }
        if (!night && !weatherGood) {
            System.out.println("Read a book");
        }
    }
}
