package cloning;
//clone is a method in the object class which is used to create exact copy of the object
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sankar= new Human(24,"Sankar");
        //Human sank= new Human(sankar);

        Human twin = (Human)sankar.clone();//creating the same copy of the sankar object (data copy)

    }
}
