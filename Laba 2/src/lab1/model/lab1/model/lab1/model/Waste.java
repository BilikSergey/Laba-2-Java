package lab1.model.lab1.model.lab1.model;

public class Waste implements IWeight {

    public float weight;

    @Override
    public float weight() {
        return weight;
    }

    public Waste(float weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Waste{" +
                "weight=" + weight +
                '}';
    }
}
