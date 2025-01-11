package interface_demo;

//Hy static method in interface should always have a body because static method and variables in interface cannot be inherited"
//while calling call via the interface name
//if any method in the parent interface has access modifier than while overriding always try to us the public lease protected
//Nested interface can be use access modifier as public protected private but the top level interface should always be as public or default
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        /*System.out.println(car.a);

        car.brake();
        car.acc();
        car.start();
        car.stop();

        Engine obj = new Car();
        System.out.println(obj.price);*/
        NiceCar niceCar= new NiceCar();
        niceCar.star();
        niceCar.startMusic();
        niceCar.upgradeEngine();
        niceCar.star();
    }
}
