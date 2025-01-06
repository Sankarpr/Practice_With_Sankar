package enum_example;

public class DemoEnum {
    enum Week implements B{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are enum constants, public, static, final
        //since its a final you can't create child enum.
        //type is week

        Week() {
            System.out.println("Constructor called for"+ this.toString());
        }

        @Override
        public void msg() {

            System.out.println("hey I am Sankar");
        }
    }


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week.ordinal());
        week.msg();
        /*for (Week day : Week.values())
        {
            System.out.println(day);
        }*/

    }
}
