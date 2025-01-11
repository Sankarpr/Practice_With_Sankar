package interface_demo.nested_interface;

public class NestedInterface {
    public interface Mood
    {
        boolean isOdd(int num);
    }
}
class B implements NestedInterface.Mood
{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
