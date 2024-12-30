package inheritence;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight()
    {
        this.weight= - 1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//calling the parent class constructor //used to initialize values present in the parent class
        this.weight = weight;
    }
}
