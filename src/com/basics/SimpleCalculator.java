package com.basics;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans = 0 ;
            while (true)
            {
                System.out.println("Enter the operator");
                char op=sc.next().trim().charAt(0);
                if(op == '+' || op == '-' || op == '/' || op == '*' || op == '%')
                    System.out.println("Enter Two number");
                    int num = sc.nextInt();
                    int num2 = sc.nextInt();
                    if(op == '+')
                        ans = num + num2;
                    if(op == '-')
                        ans = num - num2;
                    if(op == '*')
                        ans = num * num2;
                    if(op == '/')
                        if(num2 != 0)
                            ans = num / num2;
                        else
                            ans=0;
                    if(op == '%')
                        ans = num % num2;
                    else if(op == 'x' || op == 'X')
                        break;
                    else
                        System.out.println("Invalid program");
                    System.out.println(ans);
            }

    }
}
