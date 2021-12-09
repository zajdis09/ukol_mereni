package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int a = 1000000;

        ArrayList<Integer> ar = new ArrayList<>(a);
        ArrayList<Integer> sar = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            ar.add(i);
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = (finish - start);
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sar.add(i);
        }
        long finish1 = System.currentTimeMillis();
        long timeElapsed2 = (finish1 - start1);
        System.out.println("ar = new ArrayList<Integer>() " + timeElapsed);
        System.out.println("sar = new ArrayList<Integer>() " + timeElapsed2);

        if (timeElapsed < timeElapsed2) {
            System.out.println("Rychlejší je ar");
        } else if (timeElapsed2 < timeElapsed) {
            System.out.println("Rychlejší je sar");
        } else {
            System.out.println("Oba jsou stejně rychlé");
        }
    }
}

