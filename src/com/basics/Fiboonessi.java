package com.basics;
import java.util.Scanner;
public class Fiboonessi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int st=0;
        int var=1;
        int count=2;
        System.out.println("Enter any number");
        int input=sc.nextInt();
        while(count <= input )
        {
            int temp=input;
            var=var+st;
            st=temp;
            count++ ;
        }
        System.out.println(var);
    }
}
