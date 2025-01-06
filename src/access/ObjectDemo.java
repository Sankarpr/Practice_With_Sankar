package access;

public class ObjectDemo {

    public ObjectDemo(int num) {
        this.num = num;
    }

    int num;

    public int hasCode()
    {
        return num;
    }
    public boolean equals(Object obj)
    {
        return this.num == ((ObjectDemo)obj).num;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return  super.clone();
    }
    public String toString()
    {
        return super.toString();
    }
    protected void finalize() throws Throwable
    {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1= new ObjectDemo(34);
        System.out.println(obj1.hashCode());
        System.out.println(obj1.num);


        ObjectDemo obj2= new ObjectDemo(34);
        if(obj1.equals(obj2))
        {
            System.out.println("obj1 is equal to obj2 itthh");
        }

        if(obj1.equals(obj2))
        {
            System.out.println("Obj1 is equal to obj2");
        }
    }
}
