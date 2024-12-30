package staticExample;


public class InnerClass {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
        public String toString()
        {
            return name;
        }
    }

        public static void main(String[] args) {
            Test a = new Test("Sankar");
            Test b = new Test("Pradhan");

            System.out.println(a);
            //System.out.println(b.name);

        }
}

