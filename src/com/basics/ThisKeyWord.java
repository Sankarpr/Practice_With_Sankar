package com.basics;
//this keyword always represent class / object
//variables types
//class variables
//local variables
public class ThisKeyWord {
    int x,y; //instance /class variables
    ThisKeyWord(int a, int b) {
        this.x = a;
        this.y = b;
    }
        void display()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }

