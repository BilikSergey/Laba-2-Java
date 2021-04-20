package lab1.model.lab1.model.lab1.model;

import lab1.model.lab1.model.Wood;

public abstract class AbstractForm implements IWeight {
    protected Wood wood;

    public AbstractForm(Wood wood) {
        this.wood = wood;
    }

    @Override
    public float weight()
    {
        return wood.getDensity() * volume();
    }

    public abstract float volume();

}
