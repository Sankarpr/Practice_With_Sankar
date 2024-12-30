package com.basics;
import java.util.Scanner;
public class EnhanceSwitch {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String fruit=sc.next();
     switch (fruit)
     {
         case "mango" -> System.out.println("The king of fruit");
         case "Apple" -> System.out.println("The testiest fruit");
         case "orange" -> System.out.println("juicies  fruit");
         default -> System.out.println("Invalid input");
     }
    }
}
