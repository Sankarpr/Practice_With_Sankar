package interface_demo;

public class NiceCar {
    private Engine engine;
    private Media player= new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine)
    {
        this.engine=engine;
    }
    public void star() {
        engine.start();
    }
    public void startMusic()
    {
        player.start();
    }
    public void upgradeEngine()
    {
        this.engine=new ElectricEngine();
    }
}
