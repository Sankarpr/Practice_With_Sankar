package com.basics;

public class CountingTotal {
    public static void main(String[] args) {
        int n=123456654;
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++ ;
        }
        System.out.println(count);
    }
}
