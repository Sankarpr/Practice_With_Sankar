package com.basics;

public class CoutnNumberOccurence {
    public static void main(String[] args) {
        long n=1234557831112l;
        int count=0;
        while(n>0)
        {
            long rem=n%10;
            if(rem==1)
            {
                count++ ;
            }
            n=n/10 ;
        }
        System.out.println(count);

    }
}
