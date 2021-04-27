package com.tp1.partie2;

import java.math.BigInteger;

public class Main {

    public static long factorielle1(int n) {
        return  (n==0 || n==1) ? 1 : n*factorielle1(n-1);
    }

    public static BigInteger factorielle2(int n) {
        BigInteger result = BigInteger.ONE;
        if( n==0 || n==1) {
            return result;
        }else {
            for(int i=2;i<=n;i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int n=20;
	    System.out.println(factorielle2(n));
	    System.out.println(factorielle2(n).divide(factorielle2(n-1)));

        System.out.println(factorielle1(n));
        System.out.println(factorielle1(n)/factorielle1(n-1));

    }
}
