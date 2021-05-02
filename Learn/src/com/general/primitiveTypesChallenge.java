package com.general;

public class primitiveTypesChallenge {
    public static void main(String[] args) {
        byte bajcik = 42;
        short szorcik = 5517;
        int calak = 65536;
        long niwim = 50000L + 10L*(bajcik + szorcik + calak)+1;
        System.out.println(niwim);
    }
}