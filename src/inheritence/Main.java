package inheritence;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l +" "+box.h +" "+box.w);

        Box box1=new Box(4);
        System.out.println(box1.l +" "+box1.h +" "+box1.w);

        Box box3=new BoxWeight(2,4,5,6);
        System.out.println(box3.w);

        //there are many variables in both parent and child classes.
        //You are given access to variables that are in the ref type that is Boxweight
        //hence u should have access to weight variables
        //this also means that ones you are trying to access should be initialized
        //but here when the obj itself is of type parent class, how will you call the constructor of child class
        //BoxWeight box4 = new Box(1,3,4,5);//error because this is child object class
        //System.out.println(box4);


    }
}
