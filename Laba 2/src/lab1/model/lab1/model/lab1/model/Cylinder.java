package lab1.model.lab1.model.lab1.model;

import lab1.model.lab1.model.Wood;

public class Cylinder extends AbstractForm {
    private float lenght;
    private float diameter;
    public Cylinder(Wood wood, float lenght, float diameter)
    {
     super(wood);
     this.diameter = diameter;
     this.lenght = lenght;
    }
    @Override
    public float volume()
    {
        return (float) ((diameter/2)*(diameter/2) * Math.PI * lenght);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "lenght=" + lenght +
                ", diameter=" + diameter +
                '}';
    }
}
