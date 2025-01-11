package string_builder;

import java.util.Arrays;

public class Performance {
    public static void main(String[] args) {


        String name="Sankar Pradhan";
        System.out.println(Arrays.toString(name.toCharArray()));
        StringBuilder builder = new StringBuilder();
        String series = "";
        //for (int i=0; i<26;i++)
        //{
           // char ch = (char) ('a' + i);
            //series = series + ch;
            //System.out.println(ch);
           // builder.append(ch);

        //}
        //System.out.println(builder.toString());
    }
}
