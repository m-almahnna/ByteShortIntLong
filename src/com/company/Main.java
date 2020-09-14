package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue= Integer.MIN_VALUE;
        int myMaxIntValue= Integer.MAX_VALUE;
        System.out.println("Interger Min = " + myMinIntValue);
        System.out.println("Interger Max = " + myMaxIntValue);
        System.out.println("Busted Max v = " + (myMaxIntValue + 1));
        System.out.println("Busted Min v = " + (myMinIntValue - 1));
        int myMaxIntTest=2147483647;

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minByte);
        System.out.println(maxByte);

        short minshort = Short.MIN_VALUE;
        short maxshort = Short.MAX_VALUE;
        System.out.println(minshort);
        System.out.println(maxshort);

        long mylong= 100;
        long minlong = Long.MIN_VALUE;
        long maxlong = Long.MAX_VALUE;
        System.out.println(minlong);
        System.out.println(maxlong);

        System.out.println(mylong);
        long big=2147483648L;



    }
}
