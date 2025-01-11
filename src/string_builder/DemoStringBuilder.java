package string_builder;

public class DemoStringBuilder {
    public static void main(String[] args) {
        String a = "Sankar";
        String b = "Sankar";

        //pointing to the same object in the heap pool
        System.out.println(a == b);
        System.out.println(a.equals(b));

        //To point to the new pool in the heap we can create explicitly the string using new keyword

        String name1=new String("Pradhan");
        String name2= new String("Pradhan");
        System.out.println(name2 == name1);//== comparitor
        System.out.println(name1.equals(name2));//equals method or  function

        System.out.println(name1.charAt(0));


    }
}
