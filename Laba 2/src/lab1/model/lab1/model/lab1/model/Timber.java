package lab1.model.lab1.model.lab1.model;

import lab1.model.lab1.model.Wood;

public class Timber extends AbstractForm {
    private float lenght;
    private float height;
    private float width;

    public Timber(Wood wood, float length, float height, float width){
        super(wood);
        this.lenght = length;
        this.height = height;
        this.width = width;
    }
    @Override
    public float volume()
        {
            return lenght * height* width;
        }

    @Override
    public String toString() {
        return "Timber{" +
                "wood=" + wood +
                ", lenght=" + lenght +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
