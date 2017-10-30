package com.emerzondx.beersong;

public class Main {

    public static void main(String[] args) {

        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 1) {

            System.out.println(beerNum + " " + word + " of beers on the wall");
            System.out.println(beerNum + " " + word + " of beers");
            System.out.println("take one down");
            System.out.println("pass it around");
            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = "bottle";
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println("take one down");
                System.out.println("pass it around");
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}