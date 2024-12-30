package kunalYoutubePrograms;

import java.util.Scanner;

public class ArmstrongNumber { ;
    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isArmstrong(num))*/;
        //To print all the 3 digit armstrong number
        for(int i=100;i<1000;i++)
        {
            if(isArmstrong(i))
                System.out.println(i);
        }
    }
    static boolean isArmstrong(int num)
    {
        int original = num ;
        int sum=0;

        if(num <= 1)
        {
            return false;
        }
        while(num > 0  )
        {
            int rem=num%10;
            num=num/10;
            sum=sum+rem*rem*rem;
        }
//        if(original==sum)
//        {
//            return true;
//        }
//        return false ;
        return original==sum ;
    }

}
