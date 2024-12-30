package staticExample;

public class Main {
    public static void main(String[] args) {
        Human sankar = new Human(24,30000,"Sankar Pradhan",false);
        Human unknown = new Human(23, 20000, "Unknown",true);
        Human bekar = new Human(23, 20000, "Bekar",true);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        //fun1();non static we need and object to access this method
        fun2();
    }
     void fun1()
     {
         System.out.println("fun1 non static method");
     }
     static void fun2()
     {
         System.out.println("fun2 static method");
     }

     static void fun3()
     {
         System.out.println("fun3 static method");
     }
     void fun4()
     {
         System.out.println("fun1 non static method");
         fun1();
         fun2();
     }
}
