package interface_demo;

public class CDPlayer implements Media{


    @Override
    public void stop() {
        System.out.println("Stop music");
    }

    @Override
    public void start() {
        System.out.println("Start music");
    }
}
